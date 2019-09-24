package com.rtpksps.kss.base.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2项目类基本信息表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcProjectExt1 implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String proId;

    /**
     * 审核管理状态(0待审核,1已通过,2未通过,3已上传文件,4执行中,5待结项,6已结项)
     */
    private Integer manageStatus;

    /**
     * 申报状态(0填报中,1申报中,2未通过,3通过,4审核中,5申报成功,6已结项)
     */
    private Integer applyStatus;

    /**
     * 项目标题
     */
    private String title;

    /**
     * 副标题
     */
    private String subName;

    /**
     * 项目类别
     */
    private Integer proType;

    /**
     * 项目归属管理部门
     */
    private String proMng;

    /**
     * 承担单位
     */
    private String undertake;

    /**
     * 起始时间
     */
    private LocalDate startTime;

    /**
     * 终止时间
     */
    private LocalDate stopTime;

    /**
     * 承担单位地址
     */
    private String underAddr;

    /**
     * 参加单位
     */
    private String joinUnit;

    /**
     * 邮政编码
     */
    private String code;

    /**
     * 单位负责人
     */
    private String compLeader;

    /**
     * 职务/职称
     */
    private String duties;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 手机号
     */
    private String regPhone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 传真
     */
    private String fax;

    /**
     * 项目负责人
     */
    private String proLeader;

    /**
     * 项目负责人职称/职务
     */
    private String proDuties;

    /**
     * 项目负责人电话
     */
    private String proPhone;

    /**
     * 项目负责人手机号
     */
    private String proRegPhone;

    /**
     * 项目负责人传真
     */
    private String proFax;

    /**
     * 项目负责人邮箱
     */
    private String proEmail;

    /**
     * 项目总目标
     */
    private String target;

    /**
     * 工作任务和考核指标
     */
    private String workTask;

    /**
     * 预算合计
     */
    private Double countMoney;

    /**
     * 测算依据
     */
    private String calbas;

    /**
     * 开户行
     */
    private String bankName;

    /**
     * 户名
     */
    private String accountName;

    /**
     * 账号
     */
    private String account;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 标识
     */
    private String mark;

    /**
     * 是否删除
     */
    private Integer wDelete;

    /**
     * 经费预算
     */
    private Double budget;

    /**
     * 未通过原因
     */
    private String reason;

    /**
     * 审核意见
     */
    private String auditComment;

    /**
     * 单位性质
     */
    private String unitProperties;

    /**
     * 提交时间
     */
    private LocalDateTime createD;


}
