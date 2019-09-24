package com.rtpksps.kss.base.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单明细表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OsOrderProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单商品ID
     */
    @TableId(value = "order_product_id", type = IdType.AUTO)
    private Long orderProductId;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 商品编号
     */
    private Long productNumber;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 展示图片
     */
    private String picImg;

    /**
     * 商品规格编号
     */
    private Long productSpecNumber;

    /**
     * 商品规格名称
     */
    private String productSpecName;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 积分
     */
    private Integer score;

    /**
     * 商品总数量
     */
    private Integer buyNumber;

    /**
     * 商品总积分
     */
    private Integer productScore;

    /**
     * 商品总金额
     */
    private BigDecimal productAmount;

    /**
     * 评论状态 0=未评论，1=已评论
     */
    private Integer commentStatus;


}
