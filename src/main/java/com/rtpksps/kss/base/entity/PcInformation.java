package com.rtpksps.kss.base.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2消息表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String releaseId;

    /**
     * 消息类型
     */
    private Integer type;

    /**
     * 执行内容
     */
    private String content;

    /**
     * 执行人id
     */
    private String userId;

    /**
     * 发布时间
     */
    private LocalDate startTime;

    /**
     * 是否已读0：未读，1：已读
     */
    private Integer isRead;

    private Long sort;

    private Integer wDelete;


}
