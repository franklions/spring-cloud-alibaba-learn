package com.franklions.service.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author flsh
 * @version 1.0
 * @date 2021/7/30
 * @since Jdk 1.8
 */
@Data
@RefreshScope
@ConfigurationProperties(prefix = "user.service.bean")
public class ConfigBeanProperties {
    private String name;
}
