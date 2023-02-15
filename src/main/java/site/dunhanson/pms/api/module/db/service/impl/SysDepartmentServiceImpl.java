package site.dunhanson.pms.api.module.db.service.impl;

import site.dunhanson.pms.api.module.db.service.SysDepartmentService;
import site.dunhanson.pms.api.module.db.model.entity.SysDepartmentEntity;
import site.dunhanson.pms.api.module.db.dao.SysDepartmentMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门 服务实现类
 * </p>
 *
 * @author dunhanson
 * @since 2023-02-15
 */
@Service
public class SysDepartmentServiceImpl extends ServiceImpl<SysDepartmentMapper, SysDepartmentEntity> implements SysDepartmentService {

}
