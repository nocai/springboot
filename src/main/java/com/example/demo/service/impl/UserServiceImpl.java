package com.example.demo.service.impl;

import com.example.demo.domain.user.User;
import com.example.demo.domain.user.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> getByAge(Integer age) {
        return this.userMapper.getByAge(age);
    }

    //    @Transactional
    @Override
    public int update(User user) {
        return this.userMapper.updateByPrimaryKey(user);
    }

    @Override
    public int add(User user) {
        return this.userMapper.insert(user);
    }
}
