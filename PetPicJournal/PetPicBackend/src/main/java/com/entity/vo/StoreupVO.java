package com.entity.vo;

import com.entity.StoreupEntity;

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
public class StoreupVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * refid
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
		
	/**
	 * type
	 */
	
	private String type;
		
	/**
	 * inteltype
	 */
	
	private String inteltype;
		
	/**
	 * remark
	 */
	
	private String remark;
				
	
	
	 
	public void setRefid(Long refid) {
		this.refid = refid;
	}
	
	 Long getRefid() {
		return refid;
	}
				
	
	
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	
	
	public String getTablename() {
		return tablename;
	}
				
	
	
	 
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
				
	
	 
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	/**
	 * getPicture
	 */
	public String getPicture() {
		return picture;
	}
				
	
	/**
	 * setType
	 */
	 
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * getType
	 */
	public String getType() {
		return type;
	}
				
	
	/**
	 * setInteltype
	 */
	 
	public void setInteltype(String inteltype) {
		this.inteltype = inteltype;
	}
	
	/**
	 * getInteltype
	 */
	public String getInteltype() {
		return inteltype;
	}
				
	
	/**
	 * setRemark
	 */
	 
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	/**
	 * getRemark
	 */
	public String getRemark() {
		return remark;
	}
			
}
