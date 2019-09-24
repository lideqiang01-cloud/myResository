package com.rtpksps.kss.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2项目申报关系表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcProject implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String proId;

    /**
     * 学会表id
     */
    private Long orgId;

    /**
     * 办事机构党组织id
     */
    private String cpoId;

    /**
     * 学会党委id
     */
    private String cponId;

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
     * 是否删除（0未删除,1已删除）
     */
    private Integer wDelete;


}
