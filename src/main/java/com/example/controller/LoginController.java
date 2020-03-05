package com.example.controller;

import com.example.bean.UserBean;
import com.example.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    private static Logger logger = Logger.getLogger(LoginController.class);
  
     String prefix = "login";
    
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return prefix + "/login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
        logger.info("登录后台方法+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        UserBean userBean = userService.loginIn(name,password);
        if(userBean != null){
            return prefix + "/success";
        }else {
            return prefix + "/error";
        }
    }



}