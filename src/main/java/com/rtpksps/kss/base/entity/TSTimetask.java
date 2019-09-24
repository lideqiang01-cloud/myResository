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
public class TSTimetask implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String createBy;

    private LocalDateTime createDate;

    private String createName;

    private String cronExpression;

    private String isEffect;

    private String isStart;

    private String taskDescribe;

    private String taskId;

    private String updateBy;

    private LocalDateTime updateDate;

    private String updateName;


}
