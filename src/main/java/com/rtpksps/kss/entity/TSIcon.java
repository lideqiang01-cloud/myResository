package com.rtpksps.kss.entity;

import java.sql.Blob;
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
public class TSIcon implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String extend;

    private String iconclas;

    private Blob content;

    private String name;

    private String path;

    private Integer type;


}
