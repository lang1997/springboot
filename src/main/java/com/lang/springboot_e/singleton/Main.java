package com.lang.springboot_e.singleton;

import com.lang.springboot_e.aop.AopConfig;
import com.lang.springboot_e.aop.DemoAnnotationService;
import com.lang.springboot_e.aop.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService demoSingletonService1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService demoSingletonService2 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService demoPrototypeService1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService2 = context.getBean(DemoPrototypeService.class);
        System.out.println("demoSingletonService1与demoSingletonService2是否相等"+(demoSingletonService1==demoSingletonService2));
        System.out.println("demoPrototypeService1与demoPrototypeService2是否相等"+(demoPrototypeService1==demoPrototypeService2));
        System.out.println("demoSingletonService1与demoSingletonService2是否相等"+(demoSingletonService1.equals(demoSingletonService2)));
        System.out.println("demoPrototypeService1与demoPrototypeService2是否相等"+(demoPrototypeService1.equals(demoPrototypeService2)));
        context.close();
    }
}
