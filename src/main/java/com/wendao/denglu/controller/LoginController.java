package com.wendao.denglu.controller;/*
 *FileName:  denglu
 * Author:   Administrator
 * Date  :   2020/2/4 16:46
 * */

import com.wendao.denglu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import  static com.wendao.denglu.utils.PwdUtil.GetMD5;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("test")
    public String test(){
        return "hellow world";
    }

    @RequestMapping("login")
    public String login(@RequestParam String account ,@RequestParam String pwd){
        if (account==null || account.length()==0 || "".equals(account.trim()) ||("undefined".equalsIgnoreCase(account))){
            return null;
        }else if(pwd==null || pwd.length()==0 || "".equals(pwd.trim()) ||("undefined".equalsIgnoreCase(pwd))){
            return null;
        }else {
            String s = GetMD5(pwd);
            Integer login = loginService.login(account, s);
                return "登录成功";
        }
    }
    }


