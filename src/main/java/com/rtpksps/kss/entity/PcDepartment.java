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
 * 部门表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcDepartment implements Serializable {

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
     * 部门类型（1：党；0：非党）
     */
    private Integer type;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 地址
     */
    private String address;

    /**
     * 成立时间
     */
    private LocalDate foundationTime;

    /**
     * 所属机构
     */
    private Long orgId;

    /**
     * 状态（0：报备 1：申请）
     */
    private Integer status;

    /**
     * 审核意见
     */
    private String comments;

    /**
     * 是否是默认部门（1：默认；0：不是）
     */
    private Integer isDefault;

    /**
     * 上级党组织
     */
    private String parentParty;

    /**
     * 部门代码
     */
    private String code;

    @TableField("parentId")
    private Long parentId;

    /**
     * 人员表 ID
     */
    private Long employeeId;

    /**
     * 挂靠单位(0:无挂靠1:有挂靠)
     */
    private Integer affiliatedUnit;

    /**
     * 申报类型(0:报备1:申请)
     */
    private Integer declarationType;

    /**
     * 党组织形式(0:独立党组织1:高度重合党组织2:联合党组织3:临时党组织)
     */
    private String partyOrganizationType;

    /**
     * 党组织类型(1:党委;2:党总支;3:党支部)
     */
    private String partyType;

    /**
     * 组织部门logo
     */
    private String logoPath;


}
