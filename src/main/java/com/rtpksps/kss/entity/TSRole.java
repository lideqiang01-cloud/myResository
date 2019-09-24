package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
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
public class TSRole implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 角色编码
     */
    private String rolecode;

    /**
     * 角色名称
     */
    private String rolename;

    /**
     * 修改人
     */
    private String updateName;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;

    /**
     * 修改人id
     */
    private String updateBy;

    /**
     * 创建人
     */
    private String createName;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 创建人id
     */
    private String createBy;


}
