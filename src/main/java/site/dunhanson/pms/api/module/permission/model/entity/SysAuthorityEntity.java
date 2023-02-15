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
 * 权限
 * </p>
 *
 * @author dunhanson
 * @since 2023-02-15
 */
@Getter
@Setter
  @TableName("sys_authority")
public class SysAuthorityEntity implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 权限ID
     */
        @TableId(value = "auth_id", type = IdType.AUTO)
      private Integer authId;

      /**
     * 父ID
     */
      private Integer parentId;

      /**
     * 权限名称
     */
      private String authName;

      /**
     * 权限代码
     */
      private String authCode;

      /**
     * url路径
     */
      private String url;

      /**
     * 创建时间
     */
      private LocalDateTime createTime;

      /**
     * 更新时间
     */
      private LocalDateTime updateTime;


}
