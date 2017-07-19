package com.example.demo.controller;

import com.example.demo.mail.MailProperties;
import com.example.demo.service.impl.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    private Logger logger = LoggerFactory.getLogger(DemoController.class);
    @Autowired
    private DemoService demoService;
    @Autowired
    private MailProperties mailProperties;

    @RequestMapping
    public Object demo() {
        logger.info(demoService.toString());
        return "demo";
    }
}
