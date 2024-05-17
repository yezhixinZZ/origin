package com.yzx.usercenter.service;

import com.yzx.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
* @author Merer
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2024-04-18 14:15:04
*/
public interface UserService extends IService<User> {

    /**
     * 用户登录态标识
     */
     String USER_LOGIN_STATE = "userLoginState";

    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @param planetCode 编号
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);


    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);


    /**
     * 退出登录
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
}
