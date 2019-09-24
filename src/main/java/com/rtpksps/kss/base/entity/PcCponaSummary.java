package com.rtpksps.kss.base.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2_工作总结分享表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCponaSummary implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String summId;

    /**
     * 标题
     */
    private String title;

    /**
     * 发布时间
     */
    private LocalDateTime createD;

    /**
     * 点击数
     */
    private Integer clickNum;

    /**
     * 类型
     */
    private String type;

    /**
     * 发布人员id
     */
    private Long emplId;

    /**
     * 发布内容
     */
    private String content;

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
     * 审核状态0.未审核1.已审核
     */
    private Integer audstatus;

    /**
     * 学会党委id
     */
    private String cponId;

    /**
     * 状态（审核状态，0审核通过，1审核未通过，2待审核）
     */
    private Integer status;

    /**
     * 图片路径
     */
    private String imagePath;

    /**
     * 所属机构id
     */
    private Long orgId;

    /**
     * 党组织id
     */
    private String cpowId;


}
