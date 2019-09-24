package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v3 党风廉政
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCleanGov implements Serializable {

    private static final long serialVersionUID = 1L;

    private String clgoId;

    /**
     * 学会id
     */
    private Long orgId;

    /**
     * 学会党委id
     */
    private String cponaId;

    /**
     * 标题
     */
    private String title;

    /**
     * 时间
     */
    private LocalDateTime date;

    /**
     * 内容
     */
    private String content;

    private Integer whDelete;

    private Long sort;

    private Integer level;

    private String mark;


}
