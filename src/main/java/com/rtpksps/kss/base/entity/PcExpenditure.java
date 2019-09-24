package com.rtpksps.kss.base.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * v2项目支出预算表(弃用)
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcExpenditure implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long proId;

    /**
     * 编号
     */
    private Integer mark;

    /**
     * 支出内容
     */
    private String expenditure;

    /**
     * 金额
     */
    private String money;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 测算依据
     */
    private String calcBasis;


}
