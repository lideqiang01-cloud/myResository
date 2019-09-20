package com.lee.springbootdemo.entity;

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
public class QrtzCalendars implements Serializable {

    private static final long serialVersionUID = 1L;

    private String schedName;

    private String calendarName;

    private Blob calendar;


}
