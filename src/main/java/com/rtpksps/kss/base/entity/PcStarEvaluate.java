package com.rtpksps.kss.base.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * star 评价主表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcStarEvaluate implements Serializable {

    private static final long serialVersionUID = 1L;

    private String stevId;

    /**
     * 星级配置外键
     */
    private String stcfId;

    /**
     * 编号
     */
    private String docNum;

    /**
     * 标题
     */
    private String title;

    /**
     * 开始时间
     */
    private LocalDateTime stD;

    /**
     * 结束时间
     */
    private LocalDateTime enD;

    /**
     * 详细内容
     */
    private String content;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 年份
     */
    private String year;

    private Long sort;

    private Integer whDelete;

    private Integer level;

    private String mark;


}
