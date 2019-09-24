package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2党员自我鉴定记录表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpmAppraise implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String cpmaId;

    /**
     * 人员信息表外键
     */
    private String cpmId;

    /**
     * 所属党组织外键
     */
    private String cporId;

    /**
     * 自我评价
     */
    private String selfReview;

    /**
     * 自我评价时间
     */
    private LocalDateTime selfReviewD;

    /**
     * 组织评定
     */
    private String cpoReview;

    /**
     * 组织评定时间
     */
    private LocalDateTime cpoReviewD;

    /**
     * 状态(0未评定1已评定)
     */
    private Integer status;

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
     * 是否删除
     */
    private Boolean wDelete;

    /**
     * 学会id
     */
    private Long orgId;


}
