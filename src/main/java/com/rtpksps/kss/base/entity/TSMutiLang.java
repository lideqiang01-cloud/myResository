package com.rtpksps.kss.base.entity;

import java.time.LocalDateTime;
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
public class TSMutiLang implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 语言主键
     */
    private String langKey;

    /**
     * 内容
     */
    private String langContext;

    /**
     * 语言
     */
    private String langCode;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 创建人编号
     */
    private String createBy;

    /**
     * 创建人姓名
     */
    private String createName;

    /**
     * 更新日期
     */
    private LocalDateTime updateDate;

    /**
     * 更新人编号
     */
    private String updateBy;

    /**
     * 更新人姓名
     */
    private String updateName;


}
