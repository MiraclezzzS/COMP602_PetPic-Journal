package com.utils;

import cn.hutool.crypto.digest.DigestUtil;

public class MD5Util {
    
	/**
	 * @param text  
	 * @param key  
	 * @return   
	 */
	//      
	public static String md5(String text) {
		//        
		String md5str = DigestUtil.md5Hex(text);
		return md5str;
	}

}
