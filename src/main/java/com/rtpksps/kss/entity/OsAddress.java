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
 * 收获地址表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OsAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 收获地址ID
     */
    @TableId(value = "address_id", type = IdType.AUTO)
    private Long addressId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 地址标签
     */
    private String userTag;

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
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
