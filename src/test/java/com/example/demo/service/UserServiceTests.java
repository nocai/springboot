package com.example.demo.service;

import com.example.demo.DemoApplication;
import com.example.demo.domain.user.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class UserServiceTests {
    @Resource
    private UserService userService;

    @Test
    public void testGetById() {
        List<User> user = this.userService.getByAge(10);
        Assert.assertNotNull("User 不能为Null", user);
    }

    @Test
    public void testAdd() {
        User user = new User();
        user.setName("Test1");
        user.setAge(1);
        int add = this.userService.add(user);

    }
}
