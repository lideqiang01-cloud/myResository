package com.rtpksps.kss.base.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2党员民主评议情况表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpmReview implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String cmreId;

    /**
     * 人员信息表外键
     */
    private Long emplId;

    /**
     * 所属党组织外键
     */
    private String cporId;

    /**
     * 评议时间
     */
    private LocalDateTime reviewD;

    /**
     * 评议结果（0合格；1良好；2优秀；3不合格）
     */
    private Integer reviewResult;

    /**
     * 党支部意见/建议
     */
    private String opion;

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
