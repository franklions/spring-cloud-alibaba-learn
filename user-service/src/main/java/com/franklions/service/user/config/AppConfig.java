package com.franklions.service.user.config;

import com.franklions.service.user.service.ConfigBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author flsh
 * @version 1.0
 * @date 2021/7/30
 * @since Jdk 1.8
 */
@Configuration
@EnableConfigurationProperties(value = {AppConfigProperties.class,ConfigBeanProperties.class})
public class AppConfig {

    @Bean
    public ConfigBean configBean(ConfigBeanProperties beanProperties){
        return new ConfigBean(beanProperties);
    }
}
