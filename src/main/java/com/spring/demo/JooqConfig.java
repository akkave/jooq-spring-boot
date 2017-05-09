package com.spring.demo;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class JooqConfig {
  
  @Bean
  @ConfigurationProperties("jooq.datasource")
  public DataSource dataSource() {
    return DataSourceBuilder.create().build();
  }
}