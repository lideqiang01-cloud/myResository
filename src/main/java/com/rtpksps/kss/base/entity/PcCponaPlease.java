package com.rtpksps.kss.base.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2请示表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcCponaPlease implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String pleaseId;

    /**
     * 学会党委id
     */
    private String cponaId;

    /**
     * 文件路径
     */
    private String filePath;

    /**
     * 类型(0.申报文件1.批复文件2.报备文件)
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
    private Integer wDelete;


}
