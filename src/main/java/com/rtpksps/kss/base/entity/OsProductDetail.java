package com.rtpksps.kss.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品描述表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OsProductDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品描述ID
     */
    @TableId(value = "product_detail_id", type = IdType.AUTO)
    private Long productDetailId;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
