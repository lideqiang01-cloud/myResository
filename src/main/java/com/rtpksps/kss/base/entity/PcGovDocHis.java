package com.rtpksps.kss.base.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 机构文件历史表
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PcGovDocHis implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 党组织类型
     */
    private String patyType;

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 文件路径
     */
    private String filePath;

    /**
     * 文件类型(1:请示文件,2:挂靠单位党组织批件,3:党员大会纪要,4:党组会议纪要,5:其他)
     */
    private String fileType;

    /**
     * 所属部门
     */
    private Long departId;

    /**
     * 文件后缀
     */
    private Integer docType;

    /**
     * 批次Id
     */
    @TableField("batchId")
    private Long batchId;

    /**
     * 审核审批历史表ID
     */
    private Long declareHisId;


}
