package com.rtpksps.kss.base.entity;

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
public class TSDocument implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer documentstate;

    private String documenttitle;

    private Blob pictureindex;

    private Integer showhome;

    private String id;

    private String typeid;


}
