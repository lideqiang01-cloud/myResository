package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2党小组长名册
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcRosterLeader implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String leadId;

    /**
     * 人员表外键
     */
    private Long emplId;

    /**
     * 办事机构党组织外键
     */
    private String cpowId;

    /**
     * 党员表外键
     */
    private String membId;

    /**
     * 部门表外键
     */
    private Long depId;

    /**
     * 党小组长任职时间
     */
    private LocalDateTime startDate;

    /**
     * 结束任职时间
     */
    private LocalDateTime endDate;

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
    private Integer wDelete;

    /**
     * 学会id
     */
    private Long orgId;


}
