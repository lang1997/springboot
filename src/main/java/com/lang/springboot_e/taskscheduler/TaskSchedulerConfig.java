package com.lang.springboot_e.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.lang.springboot_e.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
