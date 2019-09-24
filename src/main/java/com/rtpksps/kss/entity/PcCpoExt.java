package com.rtpksps.kss.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2办事机构党组织基本信息表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpoExt implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String cpowId;

    /**
     * 父级Id
     */
    private String parentId;

    /**
     * 党组织名称
     */
    private String name;

    /**
     * 管理员（用户表外键）
     */
    private String userId;

    /**
     * 管理员人员信息
     */
    private Long emplId;

    /**
     * 创建日期
     */
    private LocalDate foundationTime;

    /**
     * 党组织地址
     */
    private String address;

    /**
     * 上级党组织名称
     */
    private String parentParty;

    /**
     * 党组织形式(B1001:独立党组织;B1002:高度重合党组织;B1003:联合党组织B1004:临时党组织)
     */
    private String partyOrganizationType;

    /**
     * 挂靠单位(0:无挂靠1:有挂靠)
     */
    private Integer affiliatedUnit;

    /**
     * 党组织类型(B0009:党委;B0010:党总支;B0011:党支部)
     */
    private String partyType;

    /**
     * 党组织简介
     */
    private String introduction;

    /**
     * 党组织logo
     */
    private String logoPath;

    /**
     * 状态（暂定活跃状态，0非常活跃）
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


}
