package com.rtpksps.kss.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2 办事机构党组织表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 办事机构党组织表
     */
    private String cpoId;

    /**
     * 父级ID
     */
    private String parentId;

    /**
     * 所属学会外键
     */
    private Long orgId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 人员ID
     */
    private Long emplId;

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
