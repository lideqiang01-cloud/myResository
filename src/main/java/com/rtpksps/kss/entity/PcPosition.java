package com.rtpksps.kss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 部门职位表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcPosition implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 职位名称
     */
    private String name;

    /**
     * 职位简介
     */
    private String introduction;

    /**
     * 所属机构（冗余）
     */
    private Long orgId;

    /**
     * 所属部门
     */
    private Long depId;

    /**
     * 审核状态
     */
    private Integer status;

    /**
     * 审核意见
     */
    private String comments;

    /**
     * 是否是默认职位（1：默认；0：不是）
     */
    private Integer isDefault;

    /**
     * 职位code
     */
    private String code;


}
