package com.rtpksps.kss.base.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * star 指标表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcStarQuota implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String stquId;

    /**
     * 指标名称
     */
    private String name;

    /**
     * 指标类型表外键
     */
    private Integer stqtId;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 指标详细内容
     */
    private String content;

    /**
     * 所属父级指标id
     */
    private String parentId;

    private Long sort;

    /**
     * 等级(1-一级指标,2-二级指标)
     */
    private Integer level;

    private Integer whDelete;

    private String mark;


}
