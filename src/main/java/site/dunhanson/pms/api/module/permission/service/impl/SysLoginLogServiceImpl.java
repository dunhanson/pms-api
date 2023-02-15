package site.dunhanson.pms.api.module.permission.service.impl;

import site.dunhanson.pms.api.module.permission.model.entity.SysLoginLogEntity;
import site.dunhanson.pms.api.module.permission.dao.SysLoginLogMapper;
import site.dunhanson.pms.api.module.permission.service.SysLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录日志 服务实现类
 * </p>
 *
 * @author dunhanson
 * @since 2023-02-15
 */
@Service
public class SysLoginLogServiceImpl extends ServiceImpl<SysLoginLogMapper, SysLoginLogEntity> implements SysLoginLogService {

}
