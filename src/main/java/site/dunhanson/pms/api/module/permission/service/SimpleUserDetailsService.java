package site.dunhanson.pms.api.module.permission.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import jakarta.annotation.Resource;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import site.dunhanson.pms.api.module.db.model.entity.*;
import site.dunhanson.pms.api.module.db.service.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 数据库DetailsService
 * @author dunhanson
 * @since 2023-02-15
 */
@Service
public class SimpleUserDetailsService implements UserDetailsService {
    @Resource
    private SysUserService userService;
    @Resource
    private SysRoleService roleService;
    @Resource
    private SysAuthorityService authorityService;
    @Resource
    private SysUserRoleService userRoleService;
    @Resource
    private SysRoleAuthorityService roleAuthorityService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 1、获取用户
        LambdaQueryWrapper<SysUserEntity> queryWrapper1 = new LambdaQueryWrapper<SysUserEntity>()
                .eq(SysUserEntity::getUsername, username);
        SysUserEntity userEntity = userService.getOne(queryWrapper1, false);
        String password = userEntity.getPassword();
        // 2、获取角色
        LambdaQueryWrapper<SysUserRoleEntity> queryWrapper2 = new LambdaQueryWrapper<SysUserRoleEntity>()
                .eq(SysUserRoleEntity::getUserId, userEntity.getUserId());
        List<SysUserRoleEntity> userRoleEntities = userRoleService.list(queryWrapper2);
        String[] roles = userRoleEntities.stream().map(obj -> {
            Integer roleId = obj.getRoleId();
            return roleService.getById(roleId);
        }).map(SysRoleEntity::getRoleCode).toArray(String[]::new);
        // 3、获取权限
        String[] authorities = Arrays.stream(roles).toList().stream().map(roleId -> {
                    LambdaQueryWrapper<SysRoleAuthorityEntity> queryWrapper3 = new LambdaQueryWrapper<SysRoleAuthorityEntity>()
                            .eq(SysRoleAuthorityEntity::getRoleId, roleId);
                    return roleAuthorityService.list(queryWrapper3);
                }).flatMap(Collection::stream)
                .map(SysRoleAuthorityEntity::getAuthId).map(authId -> authorityService.getById(authId))
                .map(SysAuthorityEntity::getAuthCode).toArray(String[]::new);
        // 4、获取User
        return User.withUsername(username)
                .password(password)
                .roles(roles)
                .authorities(authorities)
                .build();
    }
}
