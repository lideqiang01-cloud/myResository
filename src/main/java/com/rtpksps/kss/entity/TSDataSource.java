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
public class TSDataSource implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String dbKey;

    private String description;

    private String driverClass;

    private String url;

    private String dbUser;

    private String dbPassword;

    private String dbType;

    private String dbName;


}
