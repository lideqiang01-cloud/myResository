package com.lee.springbootdemo.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.lee.springbootdemo.druid.annocation.DataSource;
import com.lee.springbootdemo.druid.enums.DataSourceEnum;
import com.lee.springbootdemo.entity.CmsRole;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.springbootdemo.resultvo.CmsRoleVO;
import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion;

import java.io.Serializable;
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
    List<CmsRoleVO> doQueryDoubleTable();
}
