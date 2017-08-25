package com.quark.porent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author LHR
 * Create By 2017/8/23
 */
@RequestMapping("/user")
@Controller
public class UserController {



    @RequestMapping("/login")
    public String login(){
        return "user/login";
    }

    @RequestMapping("/register")
    public String register(){
        return "user/register";
    }


}
