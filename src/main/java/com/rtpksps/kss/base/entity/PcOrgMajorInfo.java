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
 * 学会业务情况表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcOrgMajorInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 所属学会
     */
    private Long orgId;

    /**
     * 年收入（元）
     */
    private Float annualIncome;

    /**
     * 净资产（元）
     */
    private Float netIncome;

    /**
     * 主办期刊数量
     */
    private Integer articleCounter;

    /**
     * 设奖数量
     */
    private Integer honorCounter;

    /**
     * 个人会员数
     */
    private Integer memberCounter;

    /**
     * 单位会员数
     */
    private Integer orgCounter;

    /**
     * 分支机构数量
     */
    @TableField("naNum")
    private Long naNum;

    /**
     * 上一年度未开展活动的分支机构数量(个)
     */
    @TableField("unaNum")
    private Long unaNum;

    /**
     * 是否正常换届(0:是，1：否)
     */
    private Integer transition;

    /**
     * 是否按期召开理事会
     */
    private Integer convene;

    /**
     * 是否按期召开常务理事会
     */
    private Integer nasc;

    /**
     * 是否正常开展业务活动
     */
    private Integer nabiz;

    /**
     * 上一年度年检情况
     */
    private Integer renewal;

    /**
     * 成立时间
     */
    private LocalDate foundationTime;

    /**
     * 正常开展业务活动
     */
    private Integer isActive;

    /**
     * 审核状态
     */
    private Integer status;

    /**
     * 审核意见
     */
    private String comments;

    @TableField("batchId")
    private Long batchId;


}
