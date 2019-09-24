package com.rtpksps.kss.base.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2会议参会人员信息表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcConfEmployee implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("confE_id")
    private String confeId;

    /**
     * 会议信息表id
     */
    private String confId;

    private Long emplId;

    /**
     * 参会人姓名
     */
    private String name;

    /**
     * 所属学会
     */
    private Long orgId;

    /**
     * 所属部门
     */
    private Long depaId;

    /**
     * 手机号
     */
    private String regPhone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 签到情况(0：未签到；1：已签到)
     */
    private Integer status;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 标识
     */
    private String mark;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 是否删除
     */
    private Boolean wDelete;


}
