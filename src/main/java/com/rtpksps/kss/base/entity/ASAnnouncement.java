package com.rtpksps.kss.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class ASAnnouncement implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公告主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 公告标题
     */
    private String title;

    /**
     * 版本号
     */
    private String version;

    /**
     * 简介
     */
    private String synopsis;

    /**
     * 发行人
     */
    private String issuer;

    /**
     * 发行时间
     */
    private LocalDate date;

    /**
     * 状态
     */
    private Integer state;


}
