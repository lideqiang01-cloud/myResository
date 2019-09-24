package com.rtpksps.kss.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2民主评议分数
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcDemScore implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "odic_id", type = IdType.AUTO)
    private Long odicId;

    /**
     * 评价类型表外键
     */
    private Long ddicId;

    /**
     * 评议值(0-好1-较好2-一般3-差)
     */
    private String score;

    /**
     * 任务表主键
     */
    private String taskId;

    /**
     * 关联外键
     */
    private String fkId;

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
