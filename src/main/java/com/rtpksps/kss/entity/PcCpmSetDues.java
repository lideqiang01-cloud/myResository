package com.rtpksps.kss.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2党费设置表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpmSetDues implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键 
     */
    private String setdId;

    /**
     * 学会id
     */
    private Long orgId;

    /**
     * 所属党组织
     */
    private String cpoId;

    /**
     * 人员id
     */
    private Long emplId;

    /**
     * 税后收入
     */
    private Double postRevenue;

    /**
     * 党费
     */
    private Double dues;

    /**
     * 缴纳经手人
     */
    private Long agent;

    /**
     * 收入类型（0月薪，1年薪，）
     */
    private Integer type;

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
     * 党员id
     */
    private String cpmId;


}
