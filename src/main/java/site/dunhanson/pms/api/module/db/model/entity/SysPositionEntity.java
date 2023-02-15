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
 * 职位
 * </p>
 *
 * @author dunhanson
 * @since 2023-02-15
 */
@Getter
@Setter
@TableName("sys_position")
public class SysPositionEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "post_id", type = IdType.AUTO)
    private Integer postId;

    /**
     * 职位名称
     */
    private String postName;

    /**
     * 岗位编码
     */
    private String postCode;

    /**
     * 排序顺序
     */
    private Integer postSort;

    /**
     * 职位状态（10=启用 20=暂停 30=删除）
     */
    private Integer postStatus;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
