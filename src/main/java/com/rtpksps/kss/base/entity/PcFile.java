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
 * v2党组织文件柜
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcFile implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 类型（1.党组织，2.学会党委，3.会议，4.活动，5.党员, 15星级党组织数据）
     */
    private Integer clazz;

    /**
     * 子类型
     */
    private Integer type;

    /**
     * 文件名
     */
    private String name;

    /**
     * 上传时间
     */
    private LocalDate uploadD;

    /**
     * 后缀
     */
    private String suffix;

    /**
     * 关联表uuid
     */
    private String fkId;

    /**
     * 存储路径
     */
    private String path;

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
     * 是否删除
     */
    private Boolean wDelete;


}
