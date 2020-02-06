package com.wendao.denglu.mapper;/*
 *FileName:  UserMapper
 * Author:   Administrator
 * Date  :   2020/2/4 23:12
 * */

import com.wendao.denglu.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> queryUserInfo();



}