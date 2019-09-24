package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2党员党费缴纳记录表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpmDues implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String cpmdId;

    /**
     * 学会id
     */
    private Long orgId;

    /**
     * 人员信息表外键
     */
    private Long emplId;

    /**
     * 所属党组织外键
     */
    private String cporId;

    /**
     * 缴纳金额
     */
    private Double money;

    /**
     * 缴纳开始时间
     */
    private LocalDateTime payD;

    /**
     * 实际缴纳时间
     */
    private LocalDateTime actualPayD;

    /**
     * 缴纳经手人
     */
    private Long agent;

    /**
     * 缴纳状态(0未交1已交)
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
     * 党员设置表主键
     */
    private String setdId;

    /**
     * 党员外键
     */
    private String cpmId;


}
