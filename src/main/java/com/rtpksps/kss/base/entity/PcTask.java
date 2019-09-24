package com.rtpksps.kss.base.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2任务表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcTask implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String taskId;

    /**
     * 任务名/标题
     */
    private String name;

    /**
     * 任务内容
     */
    private String content;

    /**
     * 开始时间
     */
    private LocalDate stD;

    /**
     * 结束时间
     */
    private LocalDate enD;

    /**
     * 状态(-1->撤回,0-待发布,1-已发布,2-已结束)
     */
    private Integer status;

    /**
     * 任务类型表外键
     */
    private Long tdicId;

    /**
     * 创建人
     */
    private String userId;

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


}
