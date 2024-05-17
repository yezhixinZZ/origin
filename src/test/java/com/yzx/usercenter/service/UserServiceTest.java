package com.yzx.usercenter.service;
import com.yzx.usercenter.model.domain.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void testAddUser(){

        User user = new User();

        user.setUsername("dogyzx");
        user.setUserAccount("2002");
        user.setAvatarUrl("https://ts3.cn.mm.bing.net/th?id=ORMS.49328ccd312f622e34aa2cc9ec1cd765&pid=Wdp&w=300&h=156&qlt=90&c=1&rs=1&dpr=1&p=0");
        user.setGender(0);
        user.setUserPassword("admin");
        user.setPhone("123");
        user.setEmail("456");

        boolean result = userService.save(user);
        System.out.printf(String.valueOf(user.getId()));

        Assertions.assertTrue(result);
    }

    @Test
    void userRegister() {
        String userAccount = "Yuan";
        String userPassword = "12345678";
        String checkPassword = "12345678";
        String planetCode = "6";
        userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        //Assertions.assertEquals(-1, result);
    }
}