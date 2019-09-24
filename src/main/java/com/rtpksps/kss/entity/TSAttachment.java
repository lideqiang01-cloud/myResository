package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
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
public class TSAttachment implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private Blob attachmentcontent;

    private String attachmenttitle;

    private String businesskey;

    private LocalDateTime createdate;

    private String extend;

    private String note;

    private String realpath;

    private String subclassname;

    private String swfpath;

    private String busentityname;

    private String infotypeid;

    private String userid;

    @TableField("remoteUrl")
    private String remoteUrl;


}
