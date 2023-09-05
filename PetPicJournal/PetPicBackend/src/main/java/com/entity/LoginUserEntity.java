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
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * UserName
	 */
					
	private String yonghuming;
	
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
	 * set：UserName
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * set：UserName
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * set：Full Name
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * set：Full Name
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * set：PassWord
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * set：PassWord
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * set：Gender
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * get：Gender
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * set：Phone
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * get：Phone
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * set：Head Sculpture
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * get：Head Sculpture
	 */
	public String getTouxiang() {
		return touxiang;
	}

}
