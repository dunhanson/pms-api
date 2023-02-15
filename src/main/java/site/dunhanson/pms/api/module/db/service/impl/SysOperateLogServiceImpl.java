package site.dunhanson.pms.api.module.db.service.impl;

import site.dunhanson.pms.api.module.db.service.SysOperateLogService;
import site.dunhanson.pms.api.module.db.model.entity.SysOperateLogEntity;
import site.dunhanson.pms.api.module.db.dao.SysOperateLogMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志 服务实现类
 * </p>
 *
 * @author dunhanson
 * @since 2023-02-15
 */
@Service
public class SysOperateLogServiceImpl extends ServiceImpl<SysOperateLogMapper, SysOperateLogEntity> implements SysOperateLogService {

}
