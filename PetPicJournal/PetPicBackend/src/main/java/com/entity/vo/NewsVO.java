package com.entity.vo;

import com.entity.NewsEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * Rotation Chart Management
 *              
 * （              ）
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
public class NewsVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 *   
	 */
	
	private String introduction;
		
	/**
	 *   
	 */
	
	private String picture;
		
	/**
	 *   
	 */
	
	private String content;
				
	
	/**
	 *   ：  
	 */
	 
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	/**
	 *   ：  
	 */
	public String getIntroduction() {
		return introduction;
	}
				
	
	/**
	 *   ：  
	 */
	 
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	/**
	 *   ：  
	 */
	public String getPicture() {
		return picture;
	}
				
	
	/**
	 *   ：  
	 */
	 
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 *   ：  
	 */
	public String getContent() {
		return content;
	}
			
}
