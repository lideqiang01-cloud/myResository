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
 * v2 回收站表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcRecycle implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 回收站id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 操作人ID
     */
    private String userId;

    /**
     * 操作人姓名
     */
    private String userName;

    /**
     * 模块类型id
     */
    private Integer type;

    /**
     * 标题
     */
    private String name;

    /**
     * 删除时间
     */
    private LocalDate deleteD;

    /**
     * 被删除的数据ID
     */
    private String fkId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 标识
     */
    private String mark;

    /**
     * 是否需要还原
     */
    private Integer wDelete;

    /**
     * 所属机构id
     */
    private Integer orgId;

    /**
     * 党组织id
     */
    private String cpowId;

    /**
     * 学会党委id
     */
    private String cponId;


}
