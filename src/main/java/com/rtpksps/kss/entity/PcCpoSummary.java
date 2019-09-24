package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2年度工作总结
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpoSummary implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String summId;

    /**
     * 党组织外键
     */
    private String cpoId;

    /**
     * 标题
     */
    private String title;

    /**
     * 年份
     */
    private LocalDateTime year;

    /**
     * 状态：0.编辑，1.结束,2.已提交,3.已阅
     */
    private Integer status;

    /**
     * 内容
     */
    private String content;

    /**
     * 提交时间
     */
    private LocalDateTime subD;

    /**
     * 创建时间
     */
    private LocalDateTime establishD;

    /**
     * 署名:人员表外键
     */
    private Long signatureEmp;

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
     * 编辑人
     */
    private String editname;

    /**
     * 已阅状态0.未阅1.已阅
     */
    private Integer audstatus;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 学会id
     */
    private Long orgId;


}
