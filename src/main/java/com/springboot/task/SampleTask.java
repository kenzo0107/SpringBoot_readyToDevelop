package com.springboot.task;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SampleTask {

    @Scheduled(cron = "*/10 * * * * *")
    public void echo() {
        log.info("Do batch.. {}", new Date());
    }
}