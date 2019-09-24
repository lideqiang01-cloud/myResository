package com.rtpksps.kss.base.entity;

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
public class TSDepart implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String departname;

    private String description;

    private String parentdepartid;

    private String orgCode;

    private String orgType;


}
