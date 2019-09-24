package com.rtpksps.kss.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2党员表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpm implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String cpmId;

    /**
     * 用户外键
     */
    private Long userId;

    /**
     * 所属机构外键
     */
    private Long orgId;

    /**
     * 所属办事机构党组织外键
     */
    private String cpowId;

    /**
     * 所属学会党委外键
     */
    private String cponId;

    /**
     * 人员基本信息外键
     */
    private Long emplId;

    /**
     * 党内职务(字典表ID)
     */
    private Long dicId;

    /**
     * 入党时间
     */
    private LocalDate jopmD;

    /**
     * 转正时间
     */
    private LocalDate turnD;

    /**
     * 党员能力平均值
     */
    private Double avgAbility;

    /**
     * 党组织关系是否在此
     */
    private Integer whetherHere;

    /**
     * 党组织所在地
     */
    private String partyOrganizationWhether;

    /**
     * 党内职务(所在党组织)
     */
    private String innerParty;

    /**
     * 行政级别/技术职称
     */
    private String technicalTitle;

    /**
     * 党籍状态(0正常1异常)
     */
    private Integer state;

    /**
     * 是否失联(0未失联1已失联)
     */
    private Integer wLose;

    /**
     * 失联日期
     */
    private LocalDate loseD;

    /**
     * 是否删除（0.未删除；1.删除）
     */
    private Boolean wDelete;

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


}
