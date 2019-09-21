package com.lee.springbootdemo.druid.aop;
import com.lee.springbootdemo.druid.conf.DataSourceContextHolder;
import com.lee.springbootdemo.druid.annocation.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @title: DataSourceAspect
 * @projectName springboot-demo
 * @description: TODO
 * @date 2019/9/20 0020下午 17:15
 */
@Component
@Slf4j
@Aspect
@Order(-1)
public class DataSourceAspect {
    @Pointcut("@within(com.lee.springbootdemo.druid.annocation.DataSource) || @annotation(com.lee.springbootdemo.druid.annocation.DataSource)")
    public void dataSourcePointCut(){

    }

    @Before("dataSourcePointCut() && @annotation(dataSource)")
    public void doBefore(DataSource dataSource){
        log.info("当前选择数据源:"+dataSource.value().getValue());
        DataSourceContextHolder.setDataSource(dataSource.value().getValue());
    }

    @After("dataSourcePointCut()")
    public void doAfter(){
        DataSourceContextHolder.clear();
    }
}
