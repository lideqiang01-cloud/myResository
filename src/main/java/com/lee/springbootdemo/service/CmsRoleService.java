package com.lee.springbootdemo.service;

import com.lee.springbootdemo.entity.CmsRole;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.springbootdemo.dto.CmsRoleDto;

import java.util.List;

/**
 * <p>
 * 角色表 服务类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
public interface CmsRoleService extends IService<CmsRole> {
    List<CmsRoleDto> doQueryDoubleTable();
}
