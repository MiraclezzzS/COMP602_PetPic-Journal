package com.entity.model;

import com.entity.NewsEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * Rotation Chart Management
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
public class NewsModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * introduction
	 */
	
	private String introduction;
		
	/**
	 * picture
	 */
	
	private String picture;
		
	/**
	 * content
	 */
	
	private String content;
				
	
	/**
	 * set：setIntroduction
	 */
	 
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	/**
	 * get：getIntroduction
	 */
	public String getIntroduction() {
		return introduction;
	}
				
	
	/**
	 * set：setPicture
	 */
	 
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	/**
	 * get：getPicture
	 */
	public String getPicture() {
		return picture;
	}
				
	
	/**
	 * set：setContent
	 */
	 
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * get：getContent
	 */
	public String getContent() {
		return content;
	}
			
}
