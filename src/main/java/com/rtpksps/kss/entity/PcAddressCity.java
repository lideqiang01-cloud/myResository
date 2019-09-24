package com.rtpksps.kss.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2城市表 [此表没有台湾香港澳门的数据]
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcAddressCity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @TableField("cityID")
    private Long cityID;

    private String city;

    @TableField("provinceID")
    private Long provinceID;


}
