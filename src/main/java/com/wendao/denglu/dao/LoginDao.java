package com.wendao.denglu.dao;/*
 *FileName:  loginDao
 * Author:   Administrator
 * Date  :   2020/2/4 16:57
 * */

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDao {
        public Integer login(String account, String pwd);
}
