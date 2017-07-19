package com.example.demo.controller;

import com.example.demo.domain.user.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/users")
@Validated
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping
    public List<User> users() {
        User user = this.userService.getById(1);
        return Collections.singletonList(user);
    }

    @RequestMapping(value = "/{id}")
    @NotNull
    public User user(@PathVariable @Min(1) Integer id) {
        return this.userService.getById(id);
    }
}

