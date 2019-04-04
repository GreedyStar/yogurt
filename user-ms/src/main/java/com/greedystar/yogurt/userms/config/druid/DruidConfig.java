package com.greedystar.yogurt.userms.config.druid;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Author GreedyStar
 * Date   2019-04-02
 */
@Configuration
public class DruidConfig {
    @Autowired
    private DruidProperty druidProperty;

    @RefreshScope
    @Bean
    public DataSource druidDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(druidProperty.getDriverClassName());
        dataSource.setUrl(druidProperty.getUrl());
        dataSource.setUsername(druidProperty.getUsername());
        dataSource.setPassword(druidProperty.getPassword());
        return dataSource;
    }

}
