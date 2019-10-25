package com.lang.springboot_e.aware;

import com.lang.springboot_e.aop.AopConfig;
import com.lang.springboot_e.aop.DemoAnnotationService;
import com.lang.springboot_e.aop.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.setBeanName("qwer");
        awareService.outputResult();
        context.close();
    }
}
