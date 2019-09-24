package com.rtpksps.kss.druid.conf;
/**
 * @author Administrator
 * @title: DataSourceContextHolder
 * @projectName springboot-demo
 * @description: TODO
 * @date 2019/9/20 0020下午 16:51
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> contextHolder = new InheritableThreadLocal<>();

    /**
     *  设置数据源
     * @param db
     */
    public static void setDataSource(String db){
        contextHolder.set(db);
    }

    /**
     * 取得当前数据源
     * @return
     */
    public static String getDataSource(){
        return contextHolder.get();
    }

    /**
     * 清除上下文数据
     */
    public static void clear(){
        contextHolder.remove();
    }
}
