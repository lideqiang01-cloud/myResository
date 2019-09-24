package com.rtpksps.kss.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * star 评价人员表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcStarAssessor implements Serializable {

    private static final long serialVersionUID = 1L;

    private String stasId;

    /**
     * 人员表外键
     */
    private Long emplId;

    private Long sort;

    private Integer whDelete;

    private Integer level;

    private String mark;


}
