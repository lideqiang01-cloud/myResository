package com.rtpksps.kss.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 * @title: CmsRoleDto
 * @projectName springboot-demo
 * @description: TODO
 * @date 2019/9/23 0023上午 10:26
 */
@Data
public class CmsRoleDto {
    @TableId(value="role_id")
    private Long roleId;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "role_name")
    private String roleName;
    @TableField(value = "user_name")
    private String username;
    @TableField(value = "age")
    private Integer Age;

}
