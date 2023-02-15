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
 * 用户
 * </p>
 *
 * @author dunhanson
 * @since 2023-02-15
 */
@Getter
@Setter
  @TableName("sys_user")
public class SysUserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 用户ID
     */
        @TableId(value = "user_id", type = IdType.AUTO)
      private Integer userId;

      /**
     * 昵称
     */
      private String nickname;

      /**
     * 头像
     */
      private String avatar;

      /**
     * 性别（10=男 20=女 ）
     */
      private Integer sex;

      /**
     * 邮箱
     */
      private String email;

      /**
     * 用户名
     */
      private String username;

      /**
     * 密码
     */
      private String passwd;

      /**
     * 手机号码
     */
      private String phone;

      /**
     * 用户状态（10=正常 20=禁用 30=注销）
     */
      private Integer userStatus;

      /**
     * 用户类型（10=系统用户 20=添加用户）
     */
      private Integer userType;

      /**
     * 创建时间
     */
      private LocalDateTime createTime;

      /**
     * 更新时间
     */
      private LocalDateTime updateTime;

      /**
     * 备注说明
     */
      private String remark;

      /**
     * 部门ID
     */
      private Integer deptId;

      /**
     * 职位ID
     */
      private Integer postId;


}
