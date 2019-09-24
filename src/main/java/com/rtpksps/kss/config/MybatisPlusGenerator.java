package com.rtpksps.kss.config;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


/**
 * @author Administrator
 * @title: MybatisPlusGenerator
 * @projectName springboot-demo
 * @description: TODO
 * @date 2019/9/16 0016下午 14:49
 */
public class MybatisPlusGenerator {
    private static MybatisPlusGenerator single = null;

    private MybatisPlusGenerator() {
        super();
    }

    private static MybatisPlusGenerator getSingle() {
        if (single == null) {
            single = new MybatisPlusGenerator();
        }
        return single;
    }

    public void autoGeneration() {

        String dbUrl = "jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("123456")
                .setDriverName("com.mysql.jdbc.Driver");

        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setEntityLombokModel(true)
                // .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel);

        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(false)
                .setEnableCache(false)
                .setAuthor("admin")
                //指定输出文件夹位置
                .setOutputDir("D:\\project\\springboot-demo\\src\\main\\java")
                .setFileOverride(false)
                .setServiceName("%sService");

        AutoGenerator autoGenerator = new AutoGenerator();
           autoGenerator.setGlobalConfig(config)
                    .setDataSource(dataSourceConfig)
                    .setStrategy(strategyConfig)
                    .setPackageInfo(
                            new PackageConfig()
                                    .setParent("com.rtpksps.kss")
                                    .setController("controller")
                                    .setEntity("entity")
                    ).execute();


    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MybatisPlusGenerator generator = MybatisPlusGenerator.getSingle();
        generator.autoGeneration();
    }




}
