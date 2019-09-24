package com.rtpksps.kss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OsUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    /**
     * 用户编号
     */
    private Long userNumber;

    /**
     * 昵称
     */
    private String userName;

    /**
     * 登录密码
     */
    private String loginPassword;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 性别 0=保密/1=男/2=女
     */
    private Boolean sex;

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
    private Boolean status;

    /**
     * 手机号码
     */
    private String telephone;

    /**
     * 注册时间
     */
    private LocalDateTime regeistTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
