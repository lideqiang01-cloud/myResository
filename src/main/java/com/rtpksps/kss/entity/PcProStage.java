package com.rtpksps.kss.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2项目进度表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcProStage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String prosId;

    /**
     * 项目基本表id
     */
    private String proId;

    /**
     * 阶段名
     */
    private String phaseName;

    /**
     * 目标内容(进度简述)
     */
    private String content;

    /**
     * 起始时间
     */
    private LocalDate startTime;

    /**
     * 计划终止时间
     */
    private LocalDate stopTime;

    /**
     * 实际结束时间
     */
    private LocalDate actStop;

    /**
     * 经费预算
     */
    private Double money;

    /**
     * 实际进度使用经费
     */
    private Double actMoney;

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
    private Integer wDelete;

    /**
     * 修改日期
     */
    private LocalDate modifyTime;

    /**
     * 状态(0计划进度，1已填写实际进度）
     */
    private Integer status;


}
