package site.dunhanson.pms.api.module.db.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 部门
 * </p>
 *
 * @author dunhanson
 * @since 2023-02-15
 */
@Getter
@Setter
@TableName("sys_department")
public class SysDepartmentEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 部门
     */
    @TableId(value = "dept_id", type = IdType.AUTO)
    private Integer deptId;

    private String deptName;

    /**
     * 状态（10=正常 20=删除）
     */
    private String deptStatus;

    /**
     * 排序顺序
     */
    private Integer sortNum;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
