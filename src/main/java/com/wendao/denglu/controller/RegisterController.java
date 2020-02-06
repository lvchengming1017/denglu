package com.wendao.denglu.controller;/*
 *FileName:  RegisterController
 * Author:   Administrator
 * Date  :   2020/2/4 21:12
 * */

import com.wendao.denglu.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import static com.wendao.denglu.utils.PwdUtil.GetMD5;
@RestController
public class RegisterController {
    @Autowired
    RegisterService registerService;

    @RequestMapping("register")
    public String register(@RequestParam String account, @RequestParam String pwd,@RequestParam String safe,@RequestParam String cookie,String registtime){
        Integer selectuser = registerService.selectuser(account);
        if (selectuser==1){
            return "註冊失敗";
        }else {
            String s = GetMD5(pwd);
          /*  Date date=new Date();
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            String format = dateFormat.format(date);*/
            registerService.register(account,s,safe,cookie);
            return "注册成功";
        }
    }

}
