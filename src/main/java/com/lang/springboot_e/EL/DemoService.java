package com.lang.springboot_e.EL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Value("其他类属性")
    private String anothor;

    public String getAnothor() {
        return anothor;
    }

    public void setAnothor(String anothor) {
        this.anothor = anothor;
    }
}
