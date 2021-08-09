package com.franklions.service.proxy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author flsh
 * @version 1.0
 * @date 2021/7/28
 * @since Jdk 1.8
 */
@RestController
@RequestMapping("/proxy")
public class ProxyController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    @Qualifier(value = "restTemplate")
    private RestTemplate restTemplate;

    @Autowired
    @Qualifier(value = "loadBalanceRestTemplate")
    private RestTemplate loadBalanceRestTemplate;

    /**
     * 通过loadBalancer和restTemplate组合访问
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public String loadOneUser(@PathVariable("id") Long id){
        ServiceInstance serviceInstance = loadBalancerClient.choose("user-service");
        String path = String.format("http://%s:%s/user/get",serviceInstance.getHost(),serviceInstance.getPort());
        System.out.println("request path:" +path);
        return restTemplate.getForObject(path,String.class);
    }

    @GetMapping("/user/get")
    public String loadOneUser2(){
        return loadBalanceRestTemplate.getForObject("http://user-service/user/get" , String.class);
    }
}
