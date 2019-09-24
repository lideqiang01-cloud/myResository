package com.rtpksps.kss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 规格表

 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OsSpecification implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规格ID
     */
    @TableId(value = "specification_id", type = IdType.AUTO)
    private Long specificationId;

    /**
     * 分类ID
     */
    private Long categoryId;

    /**
     * 规格名称
     */
    private String name;

    /**
     * 状态：1.显示；0.隐藏
     */
    private Integer status;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
