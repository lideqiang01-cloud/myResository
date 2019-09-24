package com.rtpksps.kss.base.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * star 评价目标表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcStarTarget implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sttaId;

    /**
     * 学会id
     */
    private Long orgId;

    /**
     * 评价主表外键
     */
    private String stevId;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 总分
     */
    private Integer point;

    /**
     * 星级
     */
    private Integer star;

    private Long sort;

    private Integer whDelete;

    private Integer level;

    private String mark;


}
