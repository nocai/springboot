package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class DemoService {

    @Autowired
    public void setArguments(ApplicationArguments arguments) {
        System.out.println(arguments);
    }
}
