package com.rtpksps.kss.base.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2主题党日活动任务表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcTaskEvent implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String tkevId;

    /**
     * 学会外键
     */
    private Long orgId;

    /**
     * 党组织外键
     */
    private String cpoId;

    /**
     * 任务表外键
     */
    private String taskId;

    /**
     * 状态(0-未执行,1-已执行)
     */
    private Integer status;

    /**
     * 回执时间
     */
    private LocalDateTime receiptD;

    /**
     * 党组织是否参加(null-未选择,0-参加,1-不参加)
     */
    private Integer attend;

    /**
     * 党组织缺席原因(不参加填写)
     */
    private String reason;

    /**
     * 排序
     */
    private Long sort;

    /**
     * 标识
     */
    private String mark;

    /**
     * 是否删除
     */
    private Integer wDelete;

    /**
     * 等级
     */
    private Integer level;


}
