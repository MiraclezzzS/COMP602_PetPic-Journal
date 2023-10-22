package com.entity.vo;

import com.entity.PetImageEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
public class PetImageVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * Album Category
	 */
	
	private String imagetime;
		
	/**
	 * Shooting time
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date imageclass;
		
	/**
	 * 
	 */
	
	private String petimage;
		
	/**
	 * UserName
	 */
	
	private String username;
		
	/**
	 * Photo description
	 */
	
	private String imageremark;
				
	
	
	public String getImagetime() {
		return imagetime;
	}

	public void setImagetime(String imagetime) {
		this.imagetime = imagetime;
	}

	public Date getImageclass() {
		return imageclass;
	}

	public void setImageclass(Date imageclass) {
		this.imageclass = imageclass;
	}

	/**
	 * set：
	 */
	 
	public void setPetimage(String petimage) {
		this.petimage = petimage;
	}
	
	/**
	 * get：
	 */
	public String getPetimage() {
		return petimage;
	}
				
	
	
				
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getImageremark() {
		return imageremark;
	}

	public void setImageremark(String imageremark) {
		this.imageremark = imageremark;
	}

	
			
}
