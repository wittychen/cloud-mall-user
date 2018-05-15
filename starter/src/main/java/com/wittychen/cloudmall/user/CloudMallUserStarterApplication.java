package com.wittychen.cloudmall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wittychen.cloudmall.user.dal")
public class CloudMallUserStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudMallUserStarterApplication.class, args);
    }
}
