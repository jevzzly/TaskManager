package com.example.TaskService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.*;
import org.springframework.context.annotation.*;

@SpringBootApplication
@EnableHystrix
@EnableEurekaServer
@EnableFeignClients

@Configuration
@PropertySource("classpath:application.properties")
public class TaskServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskServiceApplication.class, args);
    }

}
