package com.lang.springboot_e.aop;

import org.aspectj.lang.annotation.Aspect;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Aspect
public @interface Action {
    String name();
}
