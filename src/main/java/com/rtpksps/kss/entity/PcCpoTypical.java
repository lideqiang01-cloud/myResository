package com.rtpksps.kss.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2先进典型
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCpoTypical implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 先进典型主键
     */
    private String typiId;

    /**
     * 先进典型主人公
     */
    private String typiName;

    /**
     * 标题
     */
    private String title;

    /**
     * 发布人姓名
     */
    private Long emplId;

    /**
     * 发布时间
     */
    private LocalDate createD;

    /**
     * 学会党委外键
     */
    private String cponaId;

    /**
     * 基层党组织外键
     */
    private String cpowId;

    /**
     * 浏览量
     */
    private Integer pageView;

    /**
     * 先进事迹内容
     */
    private String content;

    /**
     * 点赞数
     */
    private Integer clickNum;

    /**
     * 先进典型图片显示路径
     */
    private String picPath;

    /**
     * 状态
     */
    private Integer status;

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
     * 是否删除（0.未删除；1.已删除）
     */
    private Boolean wDelete;


}
