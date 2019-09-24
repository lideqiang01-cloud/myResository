package com.rtpksps.kss.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2工作岗位字典表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcDicWorkpost implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 工作岗位字典表主键
     */
    private String id;

    /**
     * 父级id
     */
    private String parentid;

    private String workname;

    /**
     * 备注
     */
    private String comments;

    /**
     * 层级
     */
    private Integer level;


}
