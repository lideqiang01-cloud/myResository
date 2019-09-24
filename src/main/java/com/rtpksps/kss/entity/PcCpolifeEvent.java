package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2组织生活活动公共表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpolifeEvent implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String evenId;

    /**
     * 党组织外键
     */
    private String cpoId;

    /**
     * 活动类型表外键
     */
    private Long edicId;

    /**
     * 学会id
     */
    private Long orgId;

    /**
     * 使用行政经费
     */
    private Double adminFunds;

    /**
     * 使用党费
     */
    private Double partyFunds;

    /**
     * 主题
     */
    private String title;

    /**
     * 开始时间
     */
    private LocalDateTime stD;

    /**
     * 结束时间
     */
    private LocalDateTime enD;

    /**
     * 主持人(人员表外键)
     */
    private Long emceeEmp;

    /**
     * 内容
     */
    private String content;

    /**
     * 记录人（人员表外键）
     */
    private Long recordEmp;

    /**
     * 地点
     */
    private String addr;

    /**
     * 状态(0.计划中。1.执行中。2.已结束 3.归档)
     */
    private Integer status;

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
     * 应参人数
     */
    private Integer parnumber;

    /**
     * 实参人数
     */
    private Integer refnumber;

    /**
     * 会议总结
     */
    private String comsummary;

    /**
     * 形式
     */
    private String modality;

    /**
     * 创建时间
     */
    private LocalDateTime createD;


}
