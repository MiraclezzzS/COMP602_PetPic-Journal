package com.entity.vo;

import com.entity.LoginUserEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * UserVO Entity
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
public class LoginUserVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * Full Name
	 */
	
	private String xingming;
		
	/**
	 * PassWord
	 */
	
	private String mima;
		
	/**
	 * Gender
	 */
	
	private String xingbie;
		
	/**
	 * Phone
	 */
	
	private String lianxidianhua;
		
	/**
	 * Head Sculpture
	 */
	
	private String touxiang;
				
	
	/**
	 * 设置：Full Name
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：Full Name
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：PassWord
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：PassWord
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：Gender
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：Gender
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：Phone
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：Phone
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：Head Sculpture
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：Head Sculpture
	 */
	public String getTouxiang() {
		return touxiang;
	}
			
}
