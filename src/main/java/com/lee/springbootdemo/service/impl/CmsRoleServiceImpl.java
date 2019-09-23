package com.lee.springbootdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.lee.springbootdemo.druid.annocation.DataSource;
import com.lee.springbootdemo.druid.enums.DataSourceEnum;
import com.lee.springbootdemo.entity.CmsRole;
import com.lee.springbootdemo.mapper.CmsRoleMapper;
import com.lee.springbootdemo.resultvo.CmsRoleVO;
import com.lee.springbootdemo.service.CmsRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class CmsRoleServiceImpl extends ServiceImpl<CmsRoleMapper, CmsRole> implements CmsRoleService {

    @Override
    @DataSource(DataSourceEnum.DB2)
    public CmsRole getById(Serializable id){
        return super.getById(id);
    }
    @Override
    @DataSource(DataSourceEnum.DB1)
    public List<CmsRole> list(Wrapper<CmsRole> queryWrapper){
        return super.list(null);
    }

    /**
     * 自定义方法实现关联查询
     * @return
     */
    @Override
    public List<CmsRoleVO> doQueryDoubleTable() {
        return this.baseMapper.queryDoubleTable();
    }
}
