package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
       String prefix = "templates/login";
     
    @RequestMapping("/first")
    public String index(){
      
           return prefix + "/login";
    }
}
