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
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
@TableName("storeup")
public class StoreupEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public StoreupEntity() {
		
	}
	
	public StoreupEntity(T t) {
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
	 * Userid
	 */
					
	private Long userid;
	
	/**
	 * id
	 */
					
	private Long refid;
	
	/**
	 * tablename
	 */
					
	private String tablename;
	
	/**
	 * name
	 */
					
	private String name;
	
	/**
	 * picture
	 */
					
	private String picture;
			
	private String type;
	
	/**
	 * inteltype
	 */
					
	private String inteltype;
	
	/**
	 * remark
	 */
					
	private String remark;
	
	
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
	 * set：Userid
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * get：Userid
	 */
	public Long getUserid() {
		return userid;
	}
	/**
	 * set：setRefid
	 */
	public void setRefid(Long refid) {
		this.refid = refid;
	}
	/**
	 * get：getRefid
	 */
	public Long getRefid() {
		return refid;
	}
	/**
	 * set：setTablename
	 */
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	/**
	 * get：getTablename
	 */
	public String getTablename() {
		return tablename;
	}
	/**
	 * set：name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * get：name
	 */
	public String getName() {
		return name;
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
	 * set：setType
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * get：getType
	 */
	public String getType() {
		return type;
	}
	/**
	 * set：setInteltype
	 */
	public void setInteltype(String inteltype) {
		this.inteltype = inteltype;
	}
	/**
	 * get：getInteltype
	 */
	public String getInteltype() {
		return inteltype;
	}
	/**
	 * set：setRemark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * get：getRemark
	 */
	public String getRemark() {
		return remark;
	}

}
