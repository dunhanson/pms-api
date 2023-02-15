package site.dunhanson.pms.api.module.db.service.impl;

import site.dunhanson.pms.api.module.db.service.SysRoleService;
import site.dunhanson.pms.api.module.db.model.entity.SysRoleEntity;
import site.dunhanson.pms.api.module.db.dao.SysRoleMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色 服务实现类
 * </p>
 *
 * @author dunhanson
 * @since 2023-02-15
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRoleEntity> implements SysRoleService {

}
