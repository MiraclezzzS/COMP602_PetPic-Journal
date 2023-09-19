package com.entity.vo;

import com.entity.PetImageEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * Pet Album
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * 
 * 
 * 
 * @author Jingzhao PIAO
 * @email hcb1764@autuni.ac.nz
 * @date 2023-09-10
 */
public class PetImageVO  implements Serializable {
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
		
	/**
	 * 照片
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
				
	
	/**
	 * 设置：Album Category
	 */
	 
	public void setXiangcefenlei(String xiangcefenlei) {
		this.xiangcefenlei = xiangcefenlei;
	}
	
	/**
	 * 获取：Album Category
	 */
	public String getXiangcefenlei() {
		return xiangcefenlei;
	}
				
	
	/**
	 * 设置：Shooting time
	 */
	 
	public void setPaisheshijian(Date paisheshijian) {
		this.paisheshijian = paisheshijian;
	}
	
	/**
	 * 获取：Shooting time
	 */
	public Date getPaisheshijian() {
		return paisheshijian;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：UserName
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：UserName
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：Photo description
	 */
	 
	public void setZhaopianmiaoshu(String zhaopianmiaoshu) {
		this.zhaopianmiaoshu = zhaopianmiaoshu;
	}
	
	/**
	 * 获取：Photo description
	 */
	public String getZhaopianmiaoshu() {
		return zhaopianmiaoshu;
	}
			
}
