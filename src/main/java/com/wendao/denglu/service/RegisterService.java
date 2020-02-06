package com.wendao.denglu.service;

public interface RegisterService {
    public Integer register(String account, String pwd,String safe,String cookie);
    public Integer selectuser(String account);
}
