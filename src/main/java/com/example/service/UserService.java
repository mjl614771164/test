package com.example.service;

import com.example.bean.UserBean;

public interface UserService {

    UserBean loginIn(String name,String password);

}