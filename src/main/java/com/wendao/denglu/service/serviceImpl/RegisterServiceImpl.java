package com.wendao.denglu.service.serviceImpl;/*
 *FileName:  RegisterServiceImpl
 * Author:   Administrator
 * Date  :   2020/2/4 21:03
 * */

import com.wendao.denglu.dao.RegisterDao;
import com.wendao.denglu.dao.selectuserDao;
import com.wendao.denglu.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    RegisterDao registerDao;

    @Autowired
    selectuserDao selectuserDao;

    @Override
    public Integer register(String account, String pwd,String safe,String cookie) {
        Integer result=registerDao.register(account,pwd,safe,cookie);
        return result;
    }

    @Override
    public Integer selectuser(String account) {
        Integer result= selectuserDao.selectuser(account);
        return result;
    }
}
