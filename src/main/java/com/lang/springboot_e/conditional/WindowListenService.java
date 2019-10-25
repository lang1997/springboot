package com.lang.springboot_e.conditional;

public class WindowListenService implements ListenService{
    @Override
    public String showListCmd() {
        return "dir";
    }
}
