package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2_党建动态表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCponaNews implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String newsId;

    /**
     * 标题
     */
    private String title;

    /**
     * 编辑人
     */
    private String editor;

    /**
     * 类型
     */
    private String type;

    /**
     * 发布人id
     */
    private String emplId;

    /**
     * 发布日期
     */
    private LocalDateTime createD;

    /**
     * 状态（采纳状态，0待采纳，1已采纳，2未采纳，4全部）
     */
    private Integer status;

    /**
     * 内容
     */
    private String content;

    /**
     * 点击数
     */
    private Integer clickNum;

    /**
     * 摘要简介
     */
    private String summary;

    /**
     * 栏目类型(0党建动态1政策园地)
     */
    private Integer columnType;

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
     * 来源
     */
    private String source;

    /**
     * 所属机构id
     */
    private Long orgId;

    /**
     * 党组织id
     */
    private String cpowId;

    /**
     * 学会党委id
     */
    private String cponId;

    /**
     * 图片路径
     */
    private String imagePath;

    /**
     * 删除人姓名
     */
    private String deleteName;

    /**
     * 删除时间
     */
    private LocalDateTime deleteD;


}
