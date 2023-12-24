package com.example.controller;

import com.example.service.ApiService;
import com.example.service.CoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    private ApiService apiService;

    @GetMapping(value = "/msaTest")
    public String msaTest(){
        String s = apiService.testApiMsa();
        return s;
    }
    @PostMapping(value = "/dbTest")
    public void dbTest(){
        apiService.saveUser();
    }
}
