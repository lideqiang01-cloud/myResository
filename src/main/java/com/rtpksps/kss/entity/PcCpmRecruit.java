package com.rtpksps.kss.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2 发展党员表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpmRecruit implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 发展党员
     */
    private String recrId;

    /**
     * 机构表ID
     */
    private Integer orgId;

    /**
     * 人员基本信息表ID
     */
    private Integer emplId;

    /**
     * 基层党组织ID
     */
    private String cpowId;

    /**
     * 人员姓名
     */
    private String name;

    /**
     * 发展阶段
     */
    private Integer stage;

    /**
     * 阶段记录时间
     */
    private LocalDate stageD;

    /**
     * 排序
     */
    private Long sort;

    /**
     * 级别
     */
    private Integer level;

    /**
     * 识别标识
     */
    private String mark;

    /**
     * 是否删除
     */
    private Boolean wDelete;


}
