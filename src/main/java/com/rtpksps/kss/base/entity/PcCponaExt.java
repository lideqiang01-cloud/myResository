package com.rtpksps.kss.base.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2学会党委基本信息表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCponaExt implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String cponId;

    /**
     * 党组织名称
     */
    private String name;

    /**
     * 党组织所在地
     */
    private String address;

    /**
     * 成立时间
     */
    private LocalDate foundationTime;

    /**
     * 管理员id
     */
    private Long userId;

    /**
     * 状态
     */
    private Integer status;

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
     * 是否删除
     */
    private Integer wDelete;

    /**
     * 学会党委简介
     */
    private String content;

    /**
     * 学会创建时间
     */
    private LocalDate createD;

    /**
     * 申报时间
     */
    private LocalDate declareD;


}
