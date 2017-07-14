package com.example.demo.service;

import com.example.demo.domain.entity.User;
import com.example.demo.domain.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    public List<User> getByAge(Integer age) {
        return this.userMapper.getByAge(age);
    }

    public int update(User user) {
        return this.userMapper.updateByPrimaryKey(user);
    }
}
