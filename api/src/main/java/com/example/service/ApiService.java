package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
    @Autowired
    private CoreService coreService;
    @Autowired
    private UserRepository userRepository;

    public String testApiMsa() {
        String s = coreService.testMultiModuleTest();
        return s;
    }

    public void saveUser() {
        String username = "testUser";
        User user = new User(username);
        userRepository.save(user);
    }
}
