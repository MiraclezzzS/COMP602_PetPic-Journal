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
@TableName("chat")
public class ChatEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChatEntity() {
		
	}
	
	public ChatEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 *   id
	 */
	@TableId
	private Long id;
	/**
	 * Userid
	 */
					
	private Long userid;
	
	/**
	 * Adminid
	 */
					
	private Long adminid;
	
	/**
	 *   
	 */
					
	private String ask;
	
	/**
	 * Reply
	 */
					
	private String reply;
	
	/**
	 * Reply
	 */
					
	private Integer isreply;
	
	
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
	 *   ：Userid
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 *   ：Userid
	 */
	public Long getUserid() {
		return userid;
	}
	/**
	 *   ：Adminid
	 */
	public void setAdminid(Long adminid) {
		this.adminid = adminid;
	}
	/**
	 *   ：Adminid
	 */
	public Long getAdminid() {
		return adminid;
	}
	/**
	 *   ：  
	 */
	public void setAsk(String ask) {
		this.ask = ask;
	}
	/**
	 *   ：  
	 */
	public String getAsk() {
		return ask;
	}
	/**
	 *   ：Reply
	 */
	public void setReply(String reply) {
		this.reply = reply;
	}
	/**
	 *   ：Reply
	 */
	public String getReply() {
		return reply;
	}
	/**
	 *   ：  Reply
	 */
	public void setIsreply(Integer isreply) {
		this.isreply = isreply;
	}
	/**
	 *   ：  Reply
	 */
	public Integer getIsreply() {
		return isreply;
	}

}
