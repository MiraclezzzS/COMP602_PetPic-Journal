package com.entity.model;

import com.entity.PetImageEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * Pet Album
 * @author Jingzhao PIAO
 * @email hcb1764@autuni.ac.nz
 * @date 2023-09-18
 */
public class PetImageModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * Album Category
	 */
	
	private String xiangcefenlei;
		
	/**
	 * Shooting time
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date paisheshijian;
	
	
	private String zhaopian;
		
	/**
	 * UserName
	 */
	
	private String yonghuming;
		
	/**
	 * Photo description
	 */
	
	private String zhaopianmiaoshu;
				
	
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
