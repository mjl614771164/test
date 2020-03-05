package com.example.serviceImpl;

import com.example.bean.UserBean;
import com.example.controller.LoginController;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private static Logger slfLogger = LoggerFactory.getLogger(LoginController.class);
    //将DAO注入Service层
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        slfLogger.info("输出参数name"+ name + ",password"+password);
        return userMapper.getInfo(name,password);
    }
}