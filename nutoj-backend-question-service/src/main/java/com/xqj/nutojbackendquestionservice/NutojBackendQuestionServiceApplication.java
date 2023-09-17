package com.xqj.nutojbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.xqj.nutojbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.xqj")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.xqj.nutojbackendserviceclient.service"})
public class NutojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NutojBackendQuestionServiceApplication.class, args);
    }

}
