package com.entity.view;

import com.entity.LoginUserEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * User
 * Login User View Entity
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
@TableName("yonghu")
public class LoginUserView  extends LoginUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LoginUserView(){
	}
 
 	public LoginUserView(LoginUserEntity yonghuEntity){
 	try {
			BeanUtils.copyProperties(this, yonghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
