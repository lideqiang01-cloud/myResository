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
 * 商品图片表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OsProductImage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品图片ID
     */
    @TableId(value = "pic_img_id", type = IdType.AUTO)
    private Long picImgId;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 展示图片
     */
    private String picImg;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 状态：1.显示；0.隐藏
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
