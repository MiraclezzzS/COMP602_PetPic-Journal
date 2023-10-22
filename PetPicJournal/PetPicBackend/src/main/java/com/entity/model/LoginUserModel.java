package com.entity.model;

import com.entity.LoginUserEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * @author 
 * @email 
 */
public class LoginUserModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * Full Name
	 */
	
	private String name;
		
	/**
	 * PassWord
	 */
	
	private String password;
		
	/**
	 * Gender
	 */
	
	private String sex;
		
	/**
	 * Phone
	 */
	
	private String phone;
		
	/**
	 * Head Sculpture
	 */
	
	private String headImage;
				
	
	
				
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * set：PassWord
	 */
	 
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * get：PassWord
	 */
	public String getPassword() {
		return password;
	}
				
	
	/**
	 * set：Gender
	 */
	 
	public void setsex(String sex) {
		this.sex = sex;
	}
	
	/**
	 * get：Gender
	 */
	public String getsex() {
		return sex;
	}
				
	
	/**
	 * set：Phone
	 */
	 
	public void setphone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * get：Phone
	 */
	public String getphone() {
		return phone;
	}
				
	
	/**
	 * set：Head Sculpture
	 */
	 
	public void setheadImage(String headImage) {
		this.headImage = headImage;
	}
	
	/**
	 * get：Head Sculpture
	 */
	public String getheadImage() {
		return headImage;
	}
			
}
