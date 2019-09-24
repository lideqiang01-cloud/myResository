package com.rtpksps.kss.druid.enums;

/**
 * @author Administrator
 * @title: DataSourceEnum
 * @projectName springboot-demo
 * @description: TODO
 * @date 2019/9/20 0020下午 16:52
 */
public enum DataSourceEnum {
    /**
     * value  配置文件中数据库连接名字
     */
    DB1("db1"),
    DB2("db2");

    private String value;

    DataSourceEnum(String value){this.value=value;}

    public String getValue() {
        return value;
    }
}
