package com.interestingljw.lovebuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy//配置网关
public class Zuul_9527Application {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527Application.class);
    }
}
