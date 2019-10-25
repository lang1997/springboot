package com.lang.springboot_e.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.lang.springboot_e.aop")
@EnableAspectJAutoProxy//开启Spring对AspectJ代理的支持
public class AopConfig {
}
