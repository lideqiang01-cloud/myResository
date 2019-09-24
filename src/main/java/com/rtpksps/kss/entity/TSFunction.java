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
public class TSFunction implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private Integer functioniframe;

    private Integer functionlevel;

    private String functionname;

    private String functionorder;

    private String functionurl;

    private String parentfunctionid;

    private String iconid;

    private String deskIconid;

    private Integer functiontype;


}
