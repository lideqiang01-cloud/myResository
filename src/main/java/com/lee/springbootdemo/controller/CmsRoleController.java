package com.lee.springbootdemo.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lee.springbootdemo.dto.CmsRoleDto;
import com.lee.springbootdemo.entity.CmsRole;
import com.lee.springbootdemo.service.CmsRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 角色表 前端控制器
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Controller
@RequestMapping("/cmsRole")
public class CmsRoleController {
    private Logger logger = LoggerFactory.getLogger(CmsRoleController.class);
    @Autowired
    private CmsRoleService cmsRoleService;
    @RequestMapping("/page")
    @ResponseBody
    public IPage<CmsRole> queryPages(){
        Page<CmsRole> page = new Page<>(2,2);
        IPage<CmsRole> page1 = cmsRoleService.page(page, null);
        System.out.println(JSON.toJSONString(page1));
        logger.info("当前页码数{}，显示条数{}",page.getSize(),page.getCurrent());
        return page1;
    }
    @RequestMapping("/queryMoreTable")
    @ResponseBody
    public List<CmsRoleDto> queryDoubleTable(){
        System.out.println(JSON.toJSONString(cmsRoleService.doQueryDoubleTable()));
        System.out.println(cmsRoleService.doQueryDoubleTable());
        return cmsRoleService.doQueryDoubleTable();
    }
}

