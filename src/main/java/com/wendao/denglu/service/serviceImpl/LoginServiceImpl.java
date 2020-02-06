package com.wendao.denglu.service.serviceImpl;/*
 *FileName:  ServiceImpl
 * Author:   Administrator
 * Date  :   2020/2/4 16:59
 * */

import com.wendao.denglu.dao.LoginDao;
import com.wendao.denglu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginDao loginDao;

    @Override
    public Integer login(String account, String pwd) {
        Integer result=loginDao.login(account,pwd);
        return result;
    }


}
