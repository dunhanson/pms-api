package site.dunhanson.pms.api.module.db.service.impl;

import site.dunhanson.pms.api.module.db.service.SysUserService;
import site.dunhanson.pms.api.module.db.model.entity.SysUserEntity;
import site.dunhanson.pms.api.module.db.dao.SysUserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author dunhanson
 * @since 2023-02-15
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUserEntity> implements SysUserService {

}
