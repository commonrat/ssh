package com.SSH.controller;

import com.SSH.pojo.User;
import com.SSH.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @RequestMapping("/add")
    @ResponseBody
    public String addUser(User user){
//        System.out.println("/add 方法");
        userService.addUser(user);
        return "ok";
    }

}
