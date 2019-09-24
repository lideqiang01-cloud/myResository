package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2党员关系转接表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpmTransfer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String cmtrId;

    /**
     * 人员基本信息外键
     */
    private String cpmId;

    /**
     * 所属党组织外键
     */
    private String cporId;

    /**
     * 转接党组织
     */
    private String cpoTransfer;

    /**
     * 状态(0未审核；1审核中；2已通过；3未通过)
     */
    private Integer status;

    /**
     * 类型(0转入;1转出)
     */
    private Integer type;

    /**
     * 创建时间
     */
    private LocalDateTime createD;

    /**
     * 未通过原因
     */
    private String failureReason;

    /**
     * 审核时间
     */
    private LocalDateTime auditD;

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

    /**
     * 学会id
     */
    private Long orgId;


}
