package com.rtpksps.kss.base.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 分类管理
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TSCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 图标地址
     */
    private String iconId;

    /**
     * 类型编码
     */
    private String code;

    /**
     * 类型名称
     */
    private String name;

    /**
     * 创建人名称
     */
    private String createName;

    /**
     * 创建人登录名称
     */
    private String createBy;

    /**
     * 创建日期
     */
    private LocalDateTime createDate;

    /**
     * 更新人名称
     */
    private String updateName;

    /**
     * 更新人登录名称
     */
    private String updateBy;

    /**
     * 更新日期
     */
    private LocalDateTime updateDate;

    /**
     * 上级ID
     */
    private String parentId;

    /**
     * 机构
     */
    private String sysOrgCode;

    /**
     * 公司
     */
    private String sysCompanyCode;

    private String parentCode;


}
