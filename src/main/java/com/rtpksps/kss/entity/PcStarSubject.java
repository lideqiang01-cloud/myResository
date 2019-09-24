package com.rtpksps.kss.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * star 题目表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcStarSubject implements Serializable {

    private static final long serialVersionUID = 1L;

    private String stsuId;

    /**
     * 题目名称
     */
    private String name;

    /**
     * 指标表外键
     */
    private String stquId;

    /**
     * 评分依据
     */
    private String basis;

    /**
     * 是不是客观评分
     */
    private Integer whAuto;

    /**
     * 分值(客观评分)
     */
    private Integer point;

    private Long sort;

    private Integer whDelete;

    private String mark;

    private Integer level;


}
