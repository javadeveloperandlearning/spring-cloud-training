package com.gft.academy.selen.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableDiscoveryClient
@EnableFeignClients
@EnableResourceServer
@SpringBootApplication
public class LendingUIApplication {

    public static void main(String[] args) {
        SpringApplication.run(LendingUIApplication.class, args);
    }
}