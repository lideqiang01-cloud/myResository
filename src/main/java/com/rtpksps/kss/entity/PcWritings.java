package com.rtpksps.kss.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcWritings implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 学会id
     */
    private Long orgId;

    /**
     * 党组织id
     */
    private String cpoId;

    /**
     * 标题
     */
    private String title;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 出生年月
     */
    private LocalDate birthday;

    /**
     * 政治面貌
     */
    private Integer politicalStatus;

    /**
     * 所学专业
     */
    private String major;

    /**
     * 学历
     */
    private String education;

    /**
     * 职务
     */
    private String jobname;

    /**
     * 职称
     */
    private String jobtitle;

    /**
     * 籍贯
     */
    private String nativeplac;

    /**
     * 工作单位
     */
    private String workunit;

    private String email;

    /**
     * 通讯地址
     */
    private String communication;

    /**
     * 手机号码
     */
    private String regPhone;

    /**
     * 征文发布人用户表id
     */
    private String publisher;

    /**
     * 提交时间
     */
    private LocalDate publishD;

    /**
     * 征文内容
     */
    private String context;

    /**
     * 征文状态（0：未提交；1：已提交）
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
     * 是否删除(0.否1.是)
     */
    private Integer wDelete;

    /**
     * 退回原因
     */
    private String reason;

    /**
     * 是否退回状态
     */
    private Integer reasonstatus;


}
