package com.wendao.denglu.dao;/*
 *FileName:  selectuser
 * Author:   Administrator
 * Date  :   2020/2/4 18:32
 * */

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface selectuserDao {
    public Integer selectuser(String username);
}
