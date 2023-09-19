package com.entity.vo;

import com.entity.ChatEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * Feedback suggestions
 *              
 * （              ）
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
public class ChatVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 *   Reply
	 */
	
	private Integer isreply;
				
	
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
