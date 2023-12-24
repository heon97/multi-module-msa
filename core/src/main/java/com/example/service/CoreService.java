package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class CoreService {
    public String testMultiModuleTest(){
        String str = "Core의 Bean 테스트";
        return str;
    }
}
