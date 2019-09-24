package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
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
public class TSUsergroup implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @TableField("userGroupCode")
    private String userGroupCode;

    @TableField("userGroupName")
    private String userGroupName;

    /**
     * 修改人
     */
    @TableField("updateName")
    private String updateName;

    /**
     * 修改时间
     */
    @TableField("updateDate")
    private LocalDateTime updateDate;

    /**
     * 修改人id
     */
    @TableField("updateBy")
    private String updateBy;

    /**
     * 创建人
     */
    @TableField("createName")
    private String createName;

    /**
     * 创建时间
     */
    @TableField("createDate")
    private LocalDateTime createDate;

    /**
     * 创建人id
     */
    @TableField("createBy")
    private String createBy;


}
