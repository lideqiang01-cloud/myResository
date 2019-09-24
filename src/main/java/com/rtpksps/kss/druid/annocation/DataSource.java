package com.rtpksps.kss.druid.annocation;

import com.rtpksps.kss.druid.enums.DataSourceEnum;

import java.lang.annotation.*;

/**
 * @author Administrator
 * @title: DataSource
 * @projectName springboot-demo
 * @description: TODO
 * @date 2019/9/20 0020下午 16:54
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    DataSourceEnum value() default DataSourceEnum.DB1;
}
