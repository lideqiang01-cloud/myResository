package com.rtpksps.kss.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v3 组织学习制度
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcStudySystem implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sdsyId;

    /**
     * 编号
     */
    private String docNum;

    /**
     * 标题
     */
    private String title;

    /**
     * 学会id
     */
    private Long orgId;

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

    private String mark;

    private Integer level;


}
