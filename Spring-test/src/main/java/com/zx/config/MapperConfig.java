package com.zx.config;

import org.apache.ibatis.session.AutoMappingBehavior;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.zx.mapper")
public class MapperConfig {


    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        //实例化sqlSessionFactory工厂
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //设置连接池
        sqlSessionFactoryBean.setDataSource(dataSource);

        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();

        configuration.setMapUnderscoreToCamelCase(true);
        configuration.setAutoMappingBehavior(AutoMappingBehavior.FULL);
        sqlSessionFactoryBean.setConfiguration(configuration);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.zx.pojo");
        return sqlSessionFactoryBean;
    }


    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.zx.mapper");
        return mapperScannerConfigurer;
    }
}
