package com.rtpksps.kss.base.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2党支部党务公开表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpoOpen implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String openId;

    /**
     * 党组织外键
     */
    private String cpoId;

    /**
     * 主题
     */
    private String title;

    /**
     * 公开年度
     */
    private LocalDate year;

    /**
     * 公开时间
     */
    private LocalDateTime openD;

    /**
     * 公开形式
     */
    private String modality;

    /**
     * 项目
     */
    private String project;

    /**
     * 内容
     */
    private String content;

    /**
     * 公开期限
     */
    private LocalDateTime term;

    /**
     * 意见反馈
     */
    private String objection;

    /**
     * 状态（0-未审定，1-已审定，2-已公开）
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
