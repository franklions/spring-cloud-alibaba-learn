package com.franklions.service.user.service;

import com.franklions.service.user.config.ConfigBeanProperties;

/**
 * @author flsh
 * @version 1.0
 * @date 2021/7/30
 * @since Jdk 1.8
 */
public class ConfigBean {
    private ConfigBeanProperties beanProperties;

    public ConfigBean(ConfigBeanProperties beanProperties) {
        this.beanProperties = beanProperties;
    }

    public String getName(){
        return "ConfigBean: "+beanProperties.getName();
    }
}
