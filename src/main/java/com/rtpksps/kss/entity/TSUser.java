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
public class TSUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 学会党委id
     */
    private String cponaId;

    /**
     * 办事机构id
     */
    private String cpowId;

    /**
     * 是否拥有角色切换权限（0无 1有）
     */
    private Boolean roleSwitch;

    private Long emplId;

    private String orgId;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机
     */
    @TableField("mobilePhone")
    private String mobilePhone;

    /**
     * 办公电话
     */
    @TableField("officePhone")
    private String officePhone;

    /**
     * 签名文件
     */
    @TableField("signatureFile")
    private String signatureFile;

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
