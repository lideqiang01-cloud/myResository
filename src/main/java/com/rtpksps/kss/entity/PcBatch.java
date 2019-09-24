package com.rtpksps.kss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 批次表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcBatch implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 开始时间
     */
    private LocalDate startTime;

    /**
     * 结束时间
     */
    private LocalDate endTime;

    /**
     * 类型
     */
    @TableField("applyType")
    private String applyType;

    /**
     * 状态（0：启用，1：未启用）
     */
    private Integer state;

    /**
     * 自定义时间
     */
    private Long customTime;

    /**
     * 是否过期（0：不过期 1：过期）
     */
    @TableField("isOverdue")
    private Integer isOverdue;


}
