package com.rtpksps.kss.base.entity;

import java.sql.Blob;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class TSBaseUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 是否可以申报项目
     */
    @TableField("activitiSync")
    private Integer activitiSync;

    private String browser;

    private String password;

    private String realname;

    private Blob signature;

    private Integer status;

    private String userkey;

    private String username;

    private String departid;


}
