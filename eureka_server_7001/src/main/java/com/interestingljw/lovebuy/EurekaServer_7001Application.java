package com.interestingljw.lovebuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_7001Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001Application.class,args);
    }
}
