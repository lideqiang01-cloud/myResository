package com.rtpksps.kss.base.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2学历字典表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcDicEducation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学历字典表主键
     */
    private String id;

    /**
     * 父级id
     */
    private String parentid;

    /**
     * 学历名称
     */
    private String educationname;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 备注
     */
    private String comments;


}
