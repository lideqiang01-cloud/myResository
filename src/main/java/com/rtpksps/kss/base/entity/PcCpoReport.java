package com.rtpksps.kss.base.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2党支部书记述职报告表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpoReport implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String repoId;

    /**
     * 党员外键
     */
    private String cpmId;

    /**
     * 主题
     */
    private String title;

    /**
     * 报告时间
     */
    private LocalDateTime reportD;

    /**
     * 党组织外键
     */
    private Long cpoId;

    /**
     * 报告内容
     */
    private String content;

    /**
     * 上级党组织意见
     */
    private String objection;

    /**
     * 状态(0.编辑.1.结束)
     */
    private Integer status;

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
    private Boolean wDelete;


}
