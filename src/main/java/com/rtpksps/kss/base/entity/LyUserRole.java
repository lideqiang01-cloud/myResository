package com.rtpksps.kss.base.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LyUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("userId")
    private Integer userId;

    @TableField("roleId")
    private Integer roleId;


}
