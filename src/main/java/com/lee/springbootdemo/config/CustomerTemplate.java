package com.lee.springbootdemo.config;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.builder.ConfigBuilder;
import com.baomidou.mybatisplus.generator.engine.AbstractTemplateEngine;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @author Administrator
 * @title: CustomerTemplate
 * @projectName springboot-demo
 * @description: TODO
 * @date 2019/9/21 0021上午 10:39
 */
public class CustomerTemplate extends AbstractTemplateEngine {
    /**
     * 配置信息
     */
    @Autowired
    private ConfigBuilder configBuilder;
    @Autowired
    private TemplateConfig templateConfig;

    @Override
    public void writer(Map<String, Object> objectMap, String templatePath, String outputFile) throws Exception {


    }

    @Override
    public String templateFilePath(String filePath) {
        return null;
    }
}
