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
 * 订单状态表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OsOrderStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单状态ID
     */
    @TableId(value = "order_status_id", type = IdType.AUTO)
    private Long orderStatusId;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 操作类型 0=会员，1=后台管理人员，2=异常通知
     */
    private Integer createStatus;

    /**
     * 备注信息
     */
    private String remarks;


}
