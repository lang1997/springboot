package com.lang.springboot_e.conditional;

import com.lang.springboot_e.aware.AwareConfig;
import com.lang.springboot_e.aware.AwareService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListenService listenService = context.getBean(ListenService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+"系统下的命令列表为："+listenService.showListCmd());
        context.close();
    }
}
