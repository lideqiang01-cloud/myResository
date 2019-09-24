package com.rtpksps.kss.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2学会党委届次职务 中间表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcSecondComm implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 届次
     */
    private String secondId;

    /**
     * 职务id
     */
    private String dutiesId;

    private Integer sort;

    private String mark;

    private Integer level;

    private Integer wDelete;


}
