package com.lee.springbootdemo.mapper;

import com.lee.springbootdemo.entity.CmsRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lee.springbootdemo.dto.CmsRoleDto;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
public interface CmsRoleMapper extends BaseMapper<CmsRole> {

    /**
     * 自定义多表查询
     * @return
     */
    @Select("select role.create_time,role.role_name,cmsuser.login_name,cmsuser.age from cms_role role,cms_user cmsuser where role.role_sign = cmsuser.login_name ;\n")
    public List<CmsRoleDto> queryDoubleTable();
}
