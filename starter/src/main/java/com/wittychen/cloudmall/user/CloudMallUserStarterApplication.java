package com.wittychen.cloudmall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@MapperScan("com.wittychen.cloudmall.user.dal")
public class CloudMallUserStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudMallUserStarterApplication.class, args);
    }
}
