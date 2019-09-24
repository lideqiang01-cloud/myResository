package com.rtpksps.kss.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 管理员表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CmsUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员ID
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    /**
     * 管理员账号
     */
    private String loginName;

    /**
     * 管理员密码
     */
    private String loginPassword;

    /**
     * 加密密码的盐
     */
    private String salt;

    /**
     * 昵称
     */
    private String userName;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 性别 0=保密/1=男/2=女
     */
    private Integer sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 用户头像
     */
    private String picImg;

    /**
     * 状态 0=冻结/1=正常
     */
    private Integer status;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String telephone;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
