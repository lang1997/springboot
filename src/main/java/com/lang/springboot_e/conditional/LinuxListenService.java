package com.lang.springboot_e.conditional;

public class LinuxListenService implements ListenService{

    @Override
    public String showListCmd() {
        return "ls";
    }
}
