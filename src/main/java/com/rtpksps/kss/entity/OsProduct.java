package com.rtpksps.kss.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OsProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品ID
     */
    @TableId(value = "product_id", type = IdType.AUTO)
    private Long productId;

    /**
     * 商品编号
     */
    private Long productNumber;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 显示价格
     */
    private BigDecimal showPrice;

    /**
     * 商品简介
     */
    private String introduce;

    /**
     * 展示图片
     */
    private String picImg;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 页面标题
     */
    private String pageTitle;

    /**
     * 页面描述
     */
    private String pageDescription;

    /**
     * 备注
     */
    private String remarks;


}
