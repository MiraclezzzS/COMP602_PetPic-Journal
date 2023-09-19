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
 * About us
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
@TableName("systemintro")
public class SystemintroEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SystemintroEntity() {
		
	}
	
	public SystemintroEntity(T t) {
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
	 * title
	 */
					
	private String title;
	
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
	/**
	 * set：title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * get：title
	 */
	public String getTitle() {
		return title;
	}
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
	 * set：内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * get：内容
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
