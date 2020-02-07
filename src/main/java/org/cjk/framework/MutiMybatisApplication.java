package org.cjk.framework;

import org.cjk.framework.datasource.config.DynamicDataSourceConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@MapperScan(basePackages = "org.cjk.framework.mapper")
@Import({DynamicDataSourceConfig.class})
public class MutiMybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MutiMybatisApplication.class, args);
    }
}
