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
 * 登录日志
 * </p>
 *
 * @author dunhanson
 * @since 2023-02-15
 */
@Getter
@Setter
  @TableName("sys_login_log")
public class SysLoginLogEntity implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "login_id", type = IdType.AUTO)
      private Integer loginId;

      /**
     * 用户ID
     */
      private Integer userId;

      /**
     * IP地址
     */
      private String ipAddress;

      /**
     * IP归属
     */
      private String ipLocation;

      /**
     * 创建时间
     */
      private LocalDateTime createTime;


}
