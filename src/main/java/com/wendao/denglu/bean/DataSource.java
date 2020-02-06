package com.wendao.denglu.bean;/*
 *FileName:  DataSource
 * Author:   Administrator
 * Date  :   2020/2/4 22:09
 * */

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class DataSource {
    String datasourceId;
    String url;
    String userName;
    String passWord;
    String code;
    String databasetype;

}
