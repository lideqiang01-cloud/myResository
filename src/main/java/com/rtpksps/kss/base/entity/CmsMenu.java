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
 * 目录表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CmsMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 权限ID
     */
    @TableId(value = "menu_id", type = IdType.AUTO)
    private Long menuId;

    /**
     * 父级编号
     */
    private Long parentId;

    /**
     * 权限类型 1=菜单/2=功能/3=子功能/0=操作
     */
    private String menuType;

    /**
     * 权限代码
     */
    private String menuCode;

    /**
     * 权限名称
     */
    private String menuName;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 链接地址
     */
    private String href;

    /**
     * 图标名称
     */
    private String icon;

    /**
     * 状态 0=隐藏/1=显示
     */
    private Integer status;

    /**
     * 权限标识
     */
    private String permission;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 备注信息
     */
    private String remarks;


}
