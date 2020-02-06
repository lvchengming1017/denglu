package com.wendao.denglu.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * MD5加密[密码等等] 16位小写
 * 
 */
public class PwdUtil {

	
	public static String GetMD5(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			return new BigInteger(1, md.digest()).toString(16);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
