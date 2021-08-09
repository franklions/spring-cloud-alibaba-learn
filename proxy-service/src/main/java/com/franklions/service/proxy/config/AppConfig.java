package com.franklions.service.proxy.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author flsh
 * @version 1.0
 * @date 2021/7/28
 * @since Jdk 1.8
 */
@Configuration
public class AppConfig {

    @Bean(name = "restTemplate")
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @LoadBalanced
    @Bean(name = "loadBalanceRestTemplate")
    public RestTemplate loadBalanceRestTemplate(){
        return new RestTemplate();
    }
}
