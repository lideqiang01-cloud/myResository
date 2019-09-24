package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2_思想政治工作管理
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCponaReport implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String repoId;

    /**
     * 类型
     */
    private String type;

    /**
     * 标题
     */
    private String title;

    /**
     * 发布人员id
     */
    private Long emplId;

    /**
     * 发布日期
     */
    private LocalDateTime createD;

    /**
     * 内容
     */
    private String content;

    /**
     * 上级领导意见区
     */
    private String suggestion;

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
     * 评价状态
     */
    private Integer status;

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
