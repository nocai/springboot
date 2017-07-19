package com.example.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    private static Logger logger = LoggerFactory.getLogger(HelloService.class);
    @Value(value = "${ZF_CODE}")
    private String zfCode;

    public String hello() {
        logger.info("zfCode = " + zfCode);
        return "aaabccc";
    }
}
