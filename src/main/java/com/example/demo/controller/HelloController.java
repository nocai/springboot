package com.example.demo.controller;

import com.example.demo.domain.user.User;
import com.example.demo.service.HelloService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String index() {
        User user = this.userService.getById(1);
//        List<User> users = this.userService.getByAge(1);
        System.out.println(user);
//        System.out.println(users);
        System.out.println("a");
        return this.helloService.hello();
    }

}