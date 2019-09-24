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
 * 员工信息表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcEmployee implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 显示名称
     */
    private String showName;

    /**
     * 实际名字
     */
    private String actualName;

    /**
     * email
     */
    private String email;

    /**
     * 电话
     */
    private String regPhone;

    /**
     * 注册电话
     */
    private String phone;

    /**
     * 学会
     */
    @TableField("orgId")
    private Long orgId;

    /**
     * 邮政编码
     */
    @TableField("postCode")
    private String postCode;

    /**
     * 用户编码
     */
    private String code;

    /**
     * 头像
     */
    private String pic;

    /**
     * 简介
     */
    private String userDesc;

    /**
     * 身份证号码
     */
    private String identification;

    /**
     * 性别(0:男;1:女)
     */
    private Integer sex;

    /**
     * 生日
     */
    private LocalDate birthday;

    /**
     * 住址
     */
    private String location;

    /**
     * 所属城市
     */
    private String city;

    /**
     * 民族
     */
    private String nations;

    /**
     * 籍贯
     */
    private String nativePlace;

    /**
     * 所属省份
     */
    private String province;

    /**
     * qq
     */
    private String qq;

    /**
     * 微信
     */
    @TableField("weChat")
    private String weChat;

    /**
     * 是否是党员(1是， 0不是)
     */
    private Integer isPartyMember;

    /**
     * 角色
     */
    private String role;

    /**
     * 用户组主键
     */
    @TableField("userGroupId")
    private String userGroupId;

    /**
     * 激活码
     */
    private String verifyCode;

    /**
     * (激活)状态
     */
    private Integer status;

    /**
     * 激活失败次数
     */
    private Integer failure;

    /**
     * 学历
     */
    private String degree;

    /**
     * 行政级别
     */
    private String administrativeLevel;

    /**
     * 技术职称
     */
    private String technicalTitle;

    /**
     * 职称
     */
    private String certification;

    /**
     * 职务
     */
    private String professional;

    /**
     * 工作单位
     */
    private String employer;

    /**
     * 入党时间
     */
    private LocalDate entrytime;

    /**
     * 转正时间
     */
    private LocalDate verifytime;

    /**
     * 审核状态
     */
    private Integer status2;

    /**
     * 审核意见
     */
    private String comments;

    /**
     * 学会聘用合同
     */
    private String contractFile;

    /**
     * 补充协议副本
     */
    private String contractAttach;

    /**
     * 组织关系转接请示文件
     */
    private String contractApplication;

    /**
     * 介绍信
     */
    private String partyIntroduction;

    /**
     * 所在党组织
     */
    @TableField("CPOName")
    private String CPOName;

    /**
     * 党内职务
     */
    @TableField("CPOjob")
    private String CPOjob;

    /**
     * 学会职务
     */
    @TableField("orgJobName")
    private String orgJobName;

    /**
     * 政治面貌
     */
    @TableField("politeState")
    private String politeState;

    /**
     * 党组织关系所在地
     */
    private String cpoAddress;

    /**
     * 党组织形式(0:独立党组织1:高度重合党组织2:联合党组织3:临时党组织)
     */
    private Integer cpoFrom;

    /**
     * 党组织关系所在地
     */
    private Integer cpoWhere;

    /**
     * 编制情况(0:在编1:未编)
     */
    private Integer officeState;

    /**
     * 工作形式((0:专职1:兼职)
     */
    private Integer workingForm;

    /**
     * 类型(0:退休返聘1:社会聘用2:其他)
     */
    private Integer typeWork;

    /**
     * 部门(0:理事会,1:党组织)
     */
    private Integer departType;

    private Boolean isDelete;

    /**
     * 工作岗位
     */
    private String workpost;


}
