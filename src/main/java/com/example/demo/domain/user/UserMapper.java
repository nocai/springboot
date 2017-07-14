package com.example.demo.domain.user;

import com.example.demo.domain.MyBatisMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserMapper extends MyBatisMapper<User, Integer> {
    public List<User> getByAge(Integer age) {
        return this.sqlSessionTemplate.selectList(super.namespace + "selectByAge", age);
    }
}
