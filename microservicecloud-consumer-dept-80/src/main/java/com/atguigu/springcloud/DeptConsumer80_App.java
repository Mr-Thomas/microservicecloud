package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.atguigu.myrule.MySelfRule;

/**
 * 通过restTemplate调用microservicecloud-dept服务【spring.application.name: microservicecloud-dept】
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //消费端可以调用服务发现
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
//@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = MySelfRule.class)
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}
