package com.lang.springboot_e.taskexecutor;

import com.lang.springboot_e.singleton.DemoPrototypeService;
import com.lang.springboot_e.singleton.DemoSingletonService;
import com.lang.springboot_e.singleton.ScopeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
