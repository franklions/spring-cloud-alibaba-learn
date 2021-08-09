package com.franklions.service.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author flsh
 * @version 1.0
 * @date 2021/7/28
 * @since Jdk 1.8
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RunApplication {
    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class,args);
    }
}
