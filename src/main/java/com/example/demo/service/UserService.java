package com.example.demo.service;

import com.example.demo.domain.user.User;
import com.example.demo.domain.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Service
@Validated
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    @NotNull
    public List<User> getByAge(@NotNull @Max(value = 1)Integer age) {
//        return this.userMapper.getByAge(age);
        return null;
    }

    public int update(User user) {
        return this.userMapper.updateByPrimaryKey(user);
    }
}
