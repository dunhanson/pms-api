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
 * 操作日志
 * </p>
 *
 * @author dunhanson
 * @since 2023-02-15
 */
@Getter
@Setter
  @TableName("sys_operate_log")
public class SysOperateLogEntity implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 操作日志ID
     */
        @TableId(value = "oper_id", type = IdType.AUTO)
      private Integer operId;

      /**
     * 创建时间
     */
      private LocalDateTime createTime;

      /**
     * 模块名称
     */
      private String moduleName;

      /**
     * 操作类型（10=新增 20=删除 30=修改 40=查询）
     */
      private String operType;

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
     * 操作状态（10=正常 20=失败）
     */
      private Integer operStatus;

      /**
     * 请求地址
     */
      private String requestUrl;

      /**
     * 请求参数
     */
      private String requestParam;

      /**
     * 响应内容
     */
      private String responseBody;


}
