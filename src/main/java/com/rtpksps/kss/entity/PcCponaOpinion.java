package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2_意见与建议汇总提出表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCponaOpinion implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String opinId;

    /**
     * 标题
     */
    private String title;

    /**
     * 提出人员id
     */
    private Long emplId;

    /**
     * 提出日期
     */
    private LocalDateTime createD;

    /**
     * 状态(0未回复1已回复)
     */
    private Integer status;

    /**
     * 内容
     */
    private String content;

    /**
     * 回复次数
     */
    private Integer replyNum;

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
     * 学会党委id
     */
    private String cponId;

    /**
     * 所属机构id
     */
    private Long orgId;

    /**
     * 党组织id
     */
    private String cpowId;


}
