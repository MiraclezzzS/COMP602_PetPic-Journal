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


/**
 * User
 * DataBase Operate Entity
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
@TableName("yonghu")
public class LoginUserEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LoginUserEntity() {
		
	}
	
	public LoginUserEntity(T t) {
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
	 * UserName
	 */
					
	private String username;
	
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
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * set：Full Name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * set：Full Name
	 */
	public String getName() {
		return name;
	}
	/**
	 * set：PassWord
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * set：PassWord
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * set：Gender
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * get：Gender
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * set：Phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * get：Phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * set：Head Sculpture
	 */
	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}
	/**
	 * get：Head Sculpture
	 */
	public String getHeadImage() {
		return headImage;
	}

}
