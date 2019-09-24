package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v3 群团工作
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcAllianceWork implements Serializable {

    private static final long serialVersionUID = 1L;

    private String alwkId;

    /**
     * 标题
     */
    private String title;

    /**
     * 学会id
     */
    private String orgId;

    /**
     * 党组织id
     */
    private String cpoId;

    /**
     * 创建时间
     */
    private LocalDateTime createD;

    /**
     * 创建人(用户id)
     */
    private String createP;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 内容
     */
    private String content;

    private Integer whDelete;

    private Long sort;

    private Integer level;

    private String mark;


}
