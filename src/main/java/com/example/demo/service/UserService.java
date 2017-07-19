package com.example.demo.service;

import com.example.demo.domain.user.User;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.List;

@Validated
public interface UserService {
    User getById(Integer id);

    @NotNull
    List<User> getByAge(@NotNull @Max(value = 1) Integer age);

    int update(User user);

    int add(User user);
}
