package com.lang.springboot_e.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListenService windowListenService(){
        return new WindowListenService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListenService linuxListenService(){
        return new LinuxListenService();
    }
}
