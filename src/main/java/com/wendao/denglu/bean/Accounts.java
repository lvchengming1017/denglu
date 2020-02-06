package com.wendao.denglu.bean;
/*
 *FileName:  userlogin
 * Author:   Administrator
 * Date  :   2020/2/4 16:56
 * */

import lombok.Data;

@Data
public class Accounts {
    private Integer sid;
    private String account;
    private String pwd;
    private String safe;
    private String cookie;
    private String yaoqingma;
    private String erjimima;
    private String registtime;
    private String quanxian;
    private String ban;
}
