package com.rtpksps.kss.entity;

import java.time.LocalDate;
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
public class TSFileno implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String filenobefore;

    private Integer filenonum;

    private String filenotype;

    @TableField("filenoYear")
    private LocalDate filenoYear;


}
