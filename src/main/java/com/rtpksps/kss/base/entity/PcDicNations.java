package com.rtpksps.kss.base.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2民族字典表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcDicNations implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 民族字典表主键
     */
    private String id;

    /**
     * 父级id
     */
    private String parentid;

    /**
     * 民族名称
     */
    private String nationsname;

    /**
     * 备注
     */
    private String comments;

    /**
     * 等级
     */
    private Integer level;


}
