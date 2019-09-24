package com.rtpksps.kss.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2任务目标表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcTaskTarget implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String tktaId;

    /**
     * 党组织外键
     */
    private String cpoId;

    /**
     * 任务表外键
     */
    private String taskId;

    /**
     * 排序
     */
    private Long sort;

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


}
