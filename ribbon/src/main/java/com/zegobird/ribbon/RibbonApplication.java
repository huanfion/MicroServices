package com.zegobird.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient //注册服务
@EnableHystrix  //开启熔断器
@EnableHystrixDashboard //开启熔断器仪表盘监控
public class RibbonApplication {

    public static void main(String[] args) {

        SpringApplication.run(RibbonApplication.class, args);
    }
    //注入RestTemplate对象
    @Bean
    @LoadBalanced //开启负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
