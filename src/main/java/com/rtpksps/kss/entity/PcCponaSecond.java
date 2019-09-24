package com.rtpksps.kss.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2 学会党委届次表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCponaSecond implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String secondId;

    /**
     * 届次名称
     */
    private String name;

    /**
     * 届次开始时间
     */
    private LocalDate startD;

    /**
     * 届次结束时间
     */
    private LocalDate endD;

    /**
     * 学会党委id
     */
    private String cponaId;

    /**
     * 学会管理员id
     */
    private Long cponaEmpl;

    /**
     * 状态(0.现届1.往届)
     */
    private Integer status;

    private Integer sort;

    private String mark;

    private Integer level;

    private Integer wDelete;


}
