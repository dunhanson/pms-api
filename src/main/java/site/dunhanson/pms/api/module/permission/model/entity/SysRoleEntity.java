package site.dunhanson.pms.api.module.permission.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 角色
 * </p>
 *
 * @author dunhanson
 * @since 2023-02-15
 */
@Getter
@Setter
  @TableName("sys_role")
public class SysRoleEntity implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "role_id", type = IdType.AUTO)
      private Integer roleId;

      /**
     * 角色名称
     */
      private String roleName;

      /**
     * 角色编码
     */
      private String roleCode;

      /**
     * 排序顺序
     */
      private Integer roleSort;

      /**
     * 角色状态（10=启用 20=禁用 30=删除）
     */
      private String roleStatus;

      /**
     * 更新时间
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
