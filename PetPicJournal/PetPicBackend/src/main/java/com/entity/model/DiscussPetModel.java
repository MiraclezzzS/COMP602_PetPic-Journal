package com.entity.model;

import com.entity.DiscussPetEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * @author 
 * @email 
 */
public class DiscussPetModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * Userid
	 */
	
	private Long userid;
		
	/**
	 * Head Sculpture
	 */
	
	private String avatarurl;
		
	/**
	 * UserName
	 */
	
	private String nickname;
		
	/**
	 * Comment content
	 */
	
	private String content;
		
	/**
	 * Reply content
	 */
	
	private String reply;
				
	
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
	 * set：Head Sculpture
	 */
	 
	public void setAvatarurl(String avatarurl) {
		this.avatarurl = avatarurl;
	}
	
	/**
	 * get：Head Sculpture
	 */
	public String getAvatarurl() {
		return avatarurl;
	}
				
	
	/**
	 * set：UserName
	 */
	 
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	/**
	 * get：UserName
	 */
	public String getNickname() {
		return nickname;
	}
				
	
	/**
	 * set：Comment content
	 */
	 
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * get：Comment content
	 */
	public String getContent() {
		return content;
	}
				
	
	/**
	 * set：Reply content
	 */
	 
	public void setReply(String reply) {
		this.reply = reply;
	}
	
	/**
	 * get：Reply content
	 */
	public String getReply() {
		return reply;
	}
			
}
