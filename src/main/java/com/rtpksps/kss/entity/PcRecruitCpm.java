package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v3 发展党员主表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcRecruitCpm implements Serializable {

    private static final long serialVersionUID = 1L;

    private String repmId;

    /**
     * 学会id
     */
    private Long orgId;

    /**
     * 进度/完成度(百分比)
     */
    private Double progress;

    /**
     * 发展对象(人员表外键)
     */
    private Long emplId;

    /**
     * 内容
     */
    private String content;

    /**
     * 创建时间
     */
    private LocalDateTime createD;

    /**
     * 创建人
     */
    private Long createP;

    private Long sort;

    private Integer whDelete;

    private Integer level;

    private String mark;


}
