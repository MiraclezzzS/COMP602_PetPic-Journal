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
@TableName("discusspetimage")
public class DiscussPetEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DiscussPetEntity() {
		
	}
	
	public DiscussPetEntity(T t) {
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
	 * refid
	 */
					
	private Long refid;
	
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
	 * set：id
	 */
	public void setRefid(Long refid) {
		this.refid = refid;
	}
	/**
	 * get：id
	 */
	public Long getRefid() {
		return refid;
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
