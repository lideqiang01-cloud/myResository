package com.rtpksps.kss.entity;

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
public class TSType implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String typecode;

    private String typename;

    private String typepid;

    private String typegroupid;


}
