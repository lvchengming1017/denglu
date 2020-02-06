package com.wendao.denglu.dao;/*
 *FileName:  registerDao
 * Author:   Administrator
 * Date  :   2020/2/4 17:05
 * */

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegisterDao {
    Integer register(String account, String pwd,String safe,String cookie);
}
