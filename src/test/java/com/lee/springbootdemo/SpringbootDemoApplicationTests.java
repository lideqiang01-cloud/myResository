package com.lee.springbootdemo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lee.springbootdemo.entity.ASCategory;
import com.lee.springbootdemo.entity.CmsRole;
import com.lee.springbootdemo.entity.Dbinfo;
import com.lee.springbootdemo.mapper.ASCategoryMapper;
import com.lee.springbootdemo.service.CmsRoleService;
import com.lee.springbootdemo.service.DbinfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemoApplicationTests {

    @Resource
    private ASCategoryMapper asCategoryMapper;

    @Autowired
    private CmsRoleService cmsRoleService;

    @Autowired
    private DbinfoService dbinfoService;
    @Test
    public void contextLoads() {
        System.out.println("run in ----------------->test");
        List<ASCategory> asCategoryList = asCategoryMapper.selectList(null);
        asCategoryList.forEach(System.out::println);
    }


    @Test
    public void druidTest() {

        CmsRole cmsRole = cmsRoleService.getById(1111);
        System.out.println(cmsRole.toString());

        List<CmsRole> cmsRoleList = cmsRoleService.list(null);
        cmsRoleList.forEach(System.out::print);
    }

    /**
     * @param
     * @return
     * @throws
     * @author ldq
     * @date 2019-09-21 10:57:46
     */
    @Test
    public void pageTest() {
        Page<CmsRole> page = new Page<>(2, 2);
        IPage<CmsRole> page1 = cmsRoleService.page(page, null);
        System.out.println(page1);
    }

    @Test
    public void propTest() throws IOException {
        List<Dbinfo> dbinfoList =  dbinfoService.list(null);
        dbinfoList.forEach(System.out::println);
        Properties prop = new Properties();
        InputStream in = getClass().getResourceAsStream("/application-dev.properties");
        prop.load(in);
        Set keyValue = prop.keySet();
        for (Object o : keyValue) {
            System.out.println("key="+o+"-----"+"value="+prop.getProperty(o.toString()));
        }
    }
}
