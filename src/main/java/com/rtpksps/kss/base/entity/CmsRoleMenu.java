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
 * 角色权限关联表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CmsRoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色权限编号
     */
    @TableId(value = "role_menu_id", type = IdType.AUTO)
    private Long roleMenuId;

    /**
     * 角色编号
     */
    private Long roleId;

    /**
     * 权限编号
     */
    private Long menuId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
