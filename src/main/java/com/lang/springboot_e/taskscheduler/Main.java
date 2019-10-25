package com.lang.springboot_e.taskscheduler;

import com.lang.springboot_e.taskexecutor.AsyncTaskService;
import com.lang.springboot_e.taskexecutor.TaskExecutorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        //SchedulerTaskService schedulerTaskService = context.getBean(SchedulerTaskService.class);
//        context.close();
    }
}
