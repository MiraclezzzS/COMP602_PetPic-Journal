package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * Pet Album
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
@TableName("petimage")
public class PetImageEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	
	public PetImageEntity() {
		
	}
	
	public PetImageEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * Photo Title
	 */
					
	private String pettitle;
	
	/**
	 * Album Category
	 */
					
	private String imageclass;
	
	/**
	 * Shooting time
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date imagetime;
	
	/**
	 * image
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPettitle() {
		return pettitle;
	}

	public void setPettitle(String pettitle) {
		this.pettitle = pettitle;
	}

	public String getImageclass() {
		return imageclass;
	}

	public void setImageclass(String imageclass) {
		this.imageclass = imageclass;
	}

	public Date getImagetime() {
		return imagetime;
	}

	public void setImagetime(Date imagetime) {
		this.imagetime = imagetime;
	}

	
	
	public String getPetimage() {
		return petimage;
	}

	public void setPetimage(String petimage) {
		this.petimage = petimage;
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
