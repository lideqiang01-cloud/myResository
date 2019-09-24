package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2会议信息表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcConf implements Serializable {

    private static final long serialVersionUID = 1L;

    private String confId;

    /**
     * 发布者id
     */
    private Long publisherId;

    private String cpowId;

    /**
     * 会议主题
     */
    private String confName;

    /**
     * 会议图片
     */
    private String picture;

    /**
     * 开始时间
     */
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    private LocalDateTime finishTime;

    /**
     * 截止报名时间
     */
    private LocalDateTime signTime;

    /**
     * 所在省的名称
     */
    private String province;

    /**
     * 主办城市
     */
    private String city;

    /**
     * 场馆名称
     */
    private String siteName;

    /**
     * 会议详细地址
     */
    private String siteAddress;

    /**
     * 主办方名称
     */
    private String publisherName;

    /**
     * 承办方名称
     */
    private String organizerName;

    /**
     * 协办方名称
     */
    private String cosponsorName;

    /**
     * 发布时间
     */
    private LocalDateTime releaseTime;

    /**
     * 会议分类名称，或者是tag
     */
    private String categoryTag;

    /**
     * 会议被点击次数
     */
    private Long count;

    /**
     * 会议状态 0：进行中，1：未发布，2:已结束，3：审核中，4:审核未通过
     */
    private Integer status;

    private String logoPath;

    /**
     * 会议简介
     */
    private String content;

    /**
     * 是否发布（0：保存；1：发布）
     */
    private Integer isRelease;

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
     * 是否删除0：删除1：未删除
     */
    private Boolean wDelete;


}
