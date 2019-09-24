package com.rtpksps.kss.base.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2项目的主要参加人员
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcProEmployee implements Serializable {

    private static final long serialVersionUID = 1L;

    private String proeId;

    /**
     * 基本信息表id
     */
    private String proId;

    private Long emplId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private String age;

    /**
     * 职务/职称
     */
    private String duties;

    /**
     * 工作单位
     */
    private String employeer;

    /**
     * 在项目中承担的主要工作
     */
    private String mainWork;

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
