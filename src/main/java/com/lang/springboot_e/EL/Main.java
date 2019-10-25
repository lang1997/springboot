package com.lang.springboot_e.EL;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceConfig.class);
        ELConfig resourceService = context.getBean(ELConfig.class);
        resourceService.outputResource();
        context.close();
    }
}
