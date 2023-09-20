package com.entity.model;

import com.entity.SystemintroEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * About us
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
public class SystemintroModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * subtitle
	 */
	
	private String subtitle;
		
	/**
	 * content
	 */
	
	private String content;
		
	/**
	 * Img1
	 */
	
	private String picture1;
		
	/**
	 * Img2
	 */
	
	private String picture2;
		
	/**
	 * Img3
	 */
	
	private String picture3;
				
	
	/**
	 * set：subtitle
	 */
	 
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	
	/**
	 * get：subtitle
	 */
	public String getSubtitle() {
		return subtitle;
	}
				
	
	/**
	 * set：setContent
	 */
	 
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * get：  
	 */
	public String getContent() {
		return content;
	}
				
	
	/**
	 * set：Img1
	 */
	 
	public void setPicture1(String picture1) {
		this.picture1 = picture1;
	}
	
	/**
	 * get：Img1
	 */
	public String getPicture1() {
		return picture1;
	}
				
	
	/**
	 * set：Img2
	 */
	 
	public void setPicture2(String picture2) {
		this.picture2 = picture2;
	}
	
	/**
	 * get：Img2
	 */
	public String getPicture2() {
		return picture2;
	}
				
	
	/**
	 * set：Img3
	 */
	 
	public void setPicture3(String picture3) {
		this.picture3 = picture3;
	}
	
	/**
	 * get：Img3
	 */
	public String getPicture3() {
		return picture3;
	}
			
}
