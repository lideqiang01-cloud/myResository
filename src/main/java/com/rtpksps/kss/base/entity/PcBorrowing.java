package com.rtpksps.kss.base.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2-资料借阅
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcBorrowing implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String borrId;

    /**
     * 序号
     */
    private String serialNum;

    /**
     * 资料名称
     */
    private String name;

    /**
     * 作者
     */
    private String author;

    /**
     * 出版时间
     */
    private LocalDateTime createD;

    /**
     * 出版社
     */
    private String publicsher;

    /**
     * isbn二维码
     */
    private String isbn;

    /**
     * 状态(0:在库中 1:已借出)
     */
    private Integer status;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 标识
     */
    private String mark;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 是否删除
     */
    private Boolean wDelete;

    /**
     * 图片路径
     */
    private String path;

    /**
     * 党组织id
     */
    private String cpowId;

    /**
     * 学会id
     */
    private Long orgId;


}
