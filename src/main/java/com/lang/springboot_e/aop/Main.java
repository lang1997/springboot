package com.lang.springboot_e.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
//        FunctionService functionService = context.getBean(FunctionService.class);
//        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
//        useFunctionService.setFunctionService(functionService);
//        System.out.println(useFunctionService.SayHello("Lang"));
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
}
