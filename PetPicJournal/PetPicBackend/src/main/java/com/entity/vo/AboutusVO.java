package com.entity.vo;

import com.entity.AboutusEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * About us
 *              
 * （              ）
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
public class AboutusVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * subtitle
	 */
	
	private String subtitle;
		
	/**
	 *   
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
	 *   ：subtitle
	 */
	 
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	
	/**
	 *   ：subtitle
	 */
	public String getSubtitle() {
		return subtitle;
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
				
	
	/**
	 *   ：Img1
	 */
	 
	public void setPicture1(String picture1) {
		this.picture1 = picture1;
	}
	
	/**
	 *   ：Img1
	 */
	public String getPicture1() {
		return picture1;
	}
				
	
	/**
	 *   ：Img2
	 */
	 
	public void setPicture2(String picture2) {
		this.picture2 = picture2;
	}
	
	/**
	 *   ：Img2
	 */
	public String getPicture2() {
		return picture2;
	}
				
	
	/**
	 *   ：Img3
	 */
	 
	public void setPicture3(String picture3) {
		this.picture3 = picture3;
	}
	
	/**
	 *   ：Img3
	 */
	public String getPicture3() {
		return picture3;
	}
			
}
