package com.lang.springboot_e.prepost;

import com.lang.springboot_e.EL.ELConfig;
import com.lang.springboot_e.EL.ResourceConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        //JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        context.close();
    }
}
