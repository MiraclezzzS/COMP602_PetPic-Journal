package com.entity.model;

import com.entity.ChatEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * @author 
 * @email 
 */
public class ChatModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * Adminid
	 */
	
	private Long adminid;
		
	/**
	 * ask
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
				
	
	/**
	 * set：Adminid
	 */
	 
	public void setAdminid(Long adminid) {
		this.adminid = adminid;
	}
	
	/**
	 * get：Adminid
	 */
	public Long getAdminid() {
		return adminid;
	}
				
	
	/**
	 * set：setAsk
	 */
	 
	public void setAsk(String ask) {
		this.ask = ask;
	}
	
	/**
	 * get：getAsk
	 */
	public String getAsk() {
		return ask;
	}
				
	
	/**
	 * set：Reply
	 */
	 
	public void setReply(String reply) {
		this.reply = reply;
	}
	
	/**
	 * get：Reply
	 */
	public String getReply() {
		return reply;
	}
				
	
	/**
	 * set：Reply
	 */
	 
	public void setIsreply(Integer isreply) {
		this.isreply = isreply;
	}
	
	/**
	 * get：Reply
	 */
	public Integer getIsreply() {
		return isreply;
	}
			
}
