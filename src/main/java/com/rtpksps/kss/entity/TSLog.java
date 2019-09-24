package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
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
public class TSLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String broswer;

    private String logcontent;

    private Integer loglevel;

    private String note;

    private LocalDateTime operatetime;

    private Integer operatetype;

    private String userid;


}
