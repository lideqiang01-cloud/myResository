package com.rtpksps.kss.base.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2党员思想记录汇报表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpmThought implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String cmthId;

    /**
     * 人员信息表外键
     */
    private String cpmId;

    /**
     * 所属党组织外键
     */
    private String cporId;

    /**
     * 工作情况
     */
    private String workInfo;

    /**
     * 思想情况
     */
    private String thoughtInfo;

    /**
     * 提交时间
     */
    private LocalDateTime subD;

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
    private Boolean wDelete;

    /**
     * 学会id
     */
    private Long orgId;


}
