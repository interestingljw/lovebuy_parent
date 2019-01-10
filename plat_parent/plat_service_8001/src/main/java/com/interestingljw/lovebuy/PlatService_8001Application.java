package com.interestingljw.lovebuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PlatService_8001Application {
    public static void main(String[] args) {
        SpringApplication.run(PlatService_8001Application.class);
    }
}
