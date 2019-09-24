package com.rtpksps.kss.base.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class TSDataRule implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String ruleName;

    private String ruleColumn;

    private String ruleConditions;

    private String ruleValue;

    private LocalDateTime createDate;

    private String createBy;

    private String createName;

    private LocalDateTime updateDate;

    private String updateBy;

    private String updateName;

    @TableField("functionId")
    private String functionId;


}
