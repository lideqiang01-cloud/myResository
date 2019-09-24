package com.rtpksps.kss.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2学会党委委员职务表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCponaDuties implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String dutiesId;

    /**
     * 职务编号
     */
    private String dutiesCode;

    /**
     * 委员id
     */
    private String commId;

    /**
     * 职务名称
     */
    private String dutiesName;

    /**
     * 兼职编码
     */
    private String code;

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
    private Integer wDelete;


}
