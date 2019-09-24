package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2党组织信息公共表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCponaCom implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cpowId;

    /**
     * 人员id
     */
    private Long emplId;

    /**
     * 学会id
     */
    private Long orgId;

    /**
     * 组织名称
     */
    private String name;

    /**
     * 组织地址
     */
    private String address;

    /**
     * 成立时间
     */
    private LocalDateTime fundationTime;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 组织logo
     */
    private String logoPath;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 标识
     */
    private Integer mark;

    /**
     * 是否删除
     */
    private Boolean wDelete;


}
