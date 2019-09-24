package com.rtpksps.kss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单配送表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OsOrderShipment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 配送ID
     */
    @TableId(value = "order_shipment_id", type = IdType.AUTO)
    private Long orderShipmentId;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 手机号码
     */
    private String userPhone;

    /**
     * 详细地址
     */
    private String userAdress;

    /**
     * 邮政编码
     */
    private Integer userZipcode;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
