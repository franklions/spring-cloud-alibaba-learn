package com.franklions.service.user.controller;

import com.franklions.service.user.config.AppConfigProperties;
import com.franklions.service.user.service.ConfigBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author flsh
 * @version 1.0
 * @date 2021/7/28
 * @since Jdk 1.8
 */
@RestController
@RequestMapping("/user")
@Slf4j
@RefreshScope
public class UserController {

    @Value("${user.service.server.name}")
    private String serverName;

    @Autowired
    private AppConfigProperties properties;

    @Autowired
    private ConfigBean configBean;

    @GetMapping("/get")
    public Map<String,String> loadOne(){
        log.info("获取单个用户信息");
        Map<String,String> userMap = new HashMap<>();
        userMap.put("user",properties.getName());
        userMap.put("server",serverName);
        userMap.put("bean",configBean.getName());
        return userMap;
    }

}
