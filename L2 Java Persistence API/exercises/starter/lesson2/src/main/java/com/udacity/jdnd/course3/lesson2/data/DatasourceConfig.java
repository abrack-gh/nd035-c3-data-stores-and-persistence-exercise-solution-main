package com.udacity.jdnd.course3.lesson2.data;


import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {

    @Bean
    @ConfigurationProperties
    public DataSource getDataSource(DataSourceProperties properties){
        DataSourceBuilder dsb = DataSourceBuilder.create();
        dsb.username("admin");
        dsb.url("jdbc:mysql://localhost:3306/plant");
        return dsb.build();
    }



}
