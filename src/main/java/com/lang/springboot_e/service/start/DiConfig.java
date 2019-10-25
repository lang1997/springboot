package com.lang.springboot_e.service.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiConfig {
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }
    @Bean
    public UseFunctionService useFunctionService(){
        return new UseFunctionService();
    }
}
