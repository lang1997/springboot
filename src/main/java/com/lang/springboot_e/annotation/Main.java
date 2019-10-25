package com.lang.springboot_e.annotation;

import com.lang.springboot_e.aop.AopConfig;
import com.lang.springboot_e.aop.DemoAnnotationService;
import com.lang.springboot_e.aop.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();
    }
}
