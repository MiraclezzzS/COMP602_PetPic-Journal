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
 * @author Jingzhao PIAO
 * @email hcb1764@autuni.ac.nz
 * @date 2023-09-11
 */
@TableName("chongwuxiangce")
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
					
	private String zhaopianbiaoti;
	
	/**
	 * Album Category
	 */
					
	private String xiangcefenlei;
	
	/**
	 * Shooting time
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date paisheshijian;
	
	/**
	 * image
	 */
					
	private String zhaopian;
	
	/**
	 * UserName
	 */
					
	private String yonghuming;
	
	/**
	 * Photo description
	 */
					
	private String zhaopianmiaoshu;
	
	
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
	 * set：Photo Title
	 */
	public void setZhaopianbiaoti(String zhaopianbiaoti) {
		this.zhaopianbiaoti = zhaopianbiaoti;
	}
	/**
	 * get：Photo Title
	 */
	public String getZhaopianbiaoti() {
		return zhaopianbiaoti;
	}
	/**
	 * set：Album Category
	 */
	public void setXiangcefenlei(String xiangcefenlei) {
		this.xiangcefenlei = xiangcefenlei;
	}
	/**
	 * get：Album Category
	 */
	public String getXiangcefenlei() {
		return xiangcefenlei;
	}
	/**
	 * set：Shooting time
	 */
	public void setPaisheshijian(Date paisheshijian) {
		this.paisheshijian = paisheshijian;
	}
	/**
	 * get：Shooting time
	 */
	public Date getPaisheshijian() {
		return paisheshijian;
	}
	/**
	 * set
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * get
	 */
	public String getZhaopian() {
		return zhaopian;
	}
	/**
	 * set：UserName
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * get：UserName
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * set：Photo description
	 */
	public void setZhaopianmiaoshu(String zhaopianmiaoshu) {
		this.zhaopianmiaoshu = zhaopianmiaoshu;
	}
	/**
	 * get：Photo description
	 */
	public String getZhaopianmiaoshu() {
		return zhaopianmiaoshu;
	}

}
