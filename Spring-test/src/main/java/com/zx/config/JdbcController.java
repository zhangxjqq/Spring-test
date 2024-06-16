package com.zx.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class JdbcController {
    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.url}")
    private String URL;

    @Value("${jdbc.driver}")
    private String driver;


    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        druidDataSource.setUrl(URL);
        druidDataSource.setDriverClassName(driver);
        return druidDataSource;
    }
}
