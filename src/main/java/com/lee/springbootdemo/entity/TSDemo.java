package com.lee.springbootdemo.entity;

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
public class TSDemo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String democode;

    private Integer demoorder;

    private String demotitle;

    private String demourl;

    private String demopid;


}
