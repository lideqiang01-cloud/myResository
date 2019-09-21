package com.lee.springbootdemo;
import com.lee.springbootdemo.entity.ASCategory;
import com.lee.springbootdemo.entity.CmsRole;
import com.lee.springbootdemo.mapper.ASCategoryMapper;
import com.lee.springbootdemo.service.CmsRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemoApplicationTests {

    @Resource
    private ASCategoryMapper asCategoryMapper;

    @Autowired
    private CmsRoleService cmsRoleService;

    @Test
    public void contextLoads() {
        System.out.println("run in ----------------->test");
        List<ASCategory> asCategoryList = asCategoryMapper.selectList(null);
        asCategoryList.forEach(System.out::println);
    }


    @Test
    public void druidTest(){

        CmsRole cmsRole = cmsRoleService.getById(1111);
        System.out.println(cmsRole.toString());

        List<CmsRole> cmsRoleList = cmsRoleService.list(null);
        cmsRoleList.forEach(System.out::print);
    }



}
