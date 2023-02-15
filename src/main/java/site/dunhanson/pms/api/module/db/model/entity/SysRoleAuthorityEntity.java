package site.dunhanson.pms.api.module.db.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 *
 * </p>
 *
 * @author dunhanson
 * @since 2023-02-15
 */
@Getter
@Setter
@TableName("sys_role_authority")
public class SysRoleAuthorityEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 角色
     */
    private Integer roleId;

    /**
     * 权限ID
     */
    private Integer authId;


}
