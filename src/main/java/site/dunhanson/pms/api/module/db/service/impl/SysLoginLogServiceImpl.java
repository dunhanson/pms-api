package site.dunhanson.pms.api.module.db.service.impl;

import site.dunhanson.pms.api.module.db.service.SysLoginLogService;
import site.dunhanson.pms.api.module.db.model.entity.SysLoginLogEntity;
import site.dunhanson.pms.api.module.db.dao.SysLoginLogMapper;
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
