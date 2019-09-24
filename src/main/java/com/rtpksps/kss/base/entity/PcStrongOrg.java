package com.rtpksps.kss.base.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v3 党建强会
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcStrongOrg implements Serializable {

    private static final long serialVersionUID = 1L;

    private String stogId;

    /**
     * 学会id
     */
    private Long orgId;

    /**
     * 开始时间
     */
    private LocalDateTime stD;

    /**
     * 结束时间
     */
    private LocalDateTime enD;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 申报活动状态
     */
    private Integer reportEvent;

    /**
     * 开展活动状态
     */
    private Integer launchEvent;

    /**
     * 创建时间
     */
    private LocalDateTime createD;

    /**
     * 创建人(用户id)
     */
    private String createP;

    private Integer whDelete;

    private Long sort;

    private Integer level;

    private String mark;


}
