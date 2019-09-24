package com.rtpksps.kss.base.entity;

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
 * 学会及分支机构表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcOrg implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 父机构
     */
    private Long parentId;

    /**
     * 名称
     */
    private String name;

    /**
     * 账号
     */
    private String account;

    /**
     * 开户行
     */
    private String bankName;

    /**
     * 户名
     */
    private String accountName;

    /**
     * 地址
     */
    private String address;

    /**
     * 传真
     */
    private String fax;

    /**
     * 是否成立党组部门0是成立1是未成立
     */
    private Integer hasPartyGroup;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 学会及分支机构编码
     */
    private String orgInternalCode;

    /**
     * 成立时间
     */
    private LocalDate foundationTime;

    /**
     * 审核状态
     */
    private Integer status;

    /**
     * 审核意见
     */
    private String comments;

    /**
     * 党组织部门
     */
    private Long departmentId;

    /**
     * 党组织部门审核状态
     */
    private Integer departmentStatus;

    /**
     * 党组织部门审核意见
     */
    private String departmentComments;

    /**
     * 未成立党组织原因
     */
    private String departmentUnappliedReason;

    /**
     * 业务主管
     */
    @TableField("busiExecutive")
    private Integer busiExecutive;

    /**
     * 挂靠类型
     */
    @TableField("affiType")
    private Integer affiType;

    /**
     * 挂靠单位
     */
    @TableField("affUnits")
    private String affUnits;

    /**
     * 学科
     */
    private Integer pot;

    /**
     * 邮箱
     */
    private String email;

    /**
     *  网址
     */
    private String url;

    /**
     * 电话
     */
    private String tel;

    /**
     * 未建党组织专职人员中正式党员人数
     */
    @TableField("number_of_Party_members")
    private Integer numberOfPartyMembers;

    /**
     * 联系人
     */
    private Long employeeId;

    /**
     * 办事机构(部门表ID)
     */
    private Long office;

    /**
     * 理事会(部门表ID)
     */
    private Long council;

    /**
     * 办事机构数量
     */
    private Integer branchOfficesCount;

    /**
     * logo地址
     */
    private String logoPath;

    private Integer hasBoParty;

    private Integer hasNaParty;


}
