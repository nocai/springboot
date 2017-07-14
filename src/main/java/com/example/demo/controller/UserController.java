package com.example.demo.controller;

import com.example.demo.domain.user.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping
    public List<User> users() {
        User user = this.userService.getById(1);
//        List<User> users = this.userService.getByAge(1);
        System.out.println(user);
        user.setName("test2");
//        System.out.println(users);
//        this.userService.update(user);
        return Arrays.asList(new User[]{user});
    }
}
