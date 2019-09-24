package com.rtpksps.kss.druid.conf;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author Administrator
 * @title: MultipleDataSource
 * @projectName springboot-demo
 * @description: TODO
 * @date 2019/9/20 0020下午 17:07
 */
public class MultipleDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDataSource();
    }
}
