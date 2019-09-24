package com.rtpksps.kss.base.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2入党申请人名册
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcRosterApply implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String applId;

    /**
     * 办事机构党组织外键
     */
    private String cpowId;

    /**
     * 人员表外键
     */
    private Long emplId;

    /**
     * 部门表外键
     */
    private Long depId;

    /**
     * 入党申请时间
     */
    private LocalDateTime applD;

    /**
     * 入党通过时间
     */
    private LocalDateTime applPassD;

    /**
     * 申请状态(0:未申请，1:审核中，2:申请通过，3:审核事变)
     */
    private Integer status;

    /**
     * 党内联系人
     */
    private Integer contact;

    /**
     * 未通过原因
     */
    private String reason;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 标识
     */
    private String mark;

    /**
     * 是否删除（0：未删除，1：已删除）
     */
    private Boolean wDelete;


}
