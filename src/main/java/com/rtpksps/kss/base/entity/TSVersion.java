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
public class TSVersion implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String loginpage;

    private String versioncode;

    private String versionname;

    private String versionnum;


}
