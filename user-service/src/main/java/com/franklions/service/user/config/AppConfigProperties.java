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
@ConfigurationProperties(prefix = "user.service")
@RefreshScope
public class AppConfigProperties {
    private String name;
}
