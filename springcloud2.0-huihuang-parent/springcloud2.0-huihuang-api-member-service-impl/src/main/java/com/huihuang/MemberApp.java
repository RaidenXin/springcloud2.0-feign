package com.huihuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MemberApp {

    public static final void main(String[] args){
        SpringApplication.run(MemberApp.class, args);
    }
}
