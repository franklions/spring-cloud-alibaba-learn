package com.franklions.service.user.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author flsh
 * @version 1.0
 * @date 2021/7/30
 * @since Jdk 1.8
 */
@Service
@Slf4j
public class ScheduledService {

    @Scheduled(cron = "${user.service.scheduled.cron}",zone = "Asia/Shanghai")
    public void run(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        log.info("启动计算程序,{}",sdf.format(new Date()));
    }
}
