package com.rtpksps.kss.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2任务类型表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcTaskDic implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "tdic_id", type = IdType.AUTO)
    private Long tdicId;

    /**
     * 任务类型名字
     */
    private String name;

    /**
     * 目标任务模块
     */
    private String targetTask;

    /**
     * 目标后台service
     */
    private String targetSevice;

    /**
     * 任务分类
     */
    private Boolean type;

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

    /**
     * 党组织路由
     */
    private String cpoRouter;

    /**
     * 科技社团党委路由
     */
    private String adminRouter;


}
