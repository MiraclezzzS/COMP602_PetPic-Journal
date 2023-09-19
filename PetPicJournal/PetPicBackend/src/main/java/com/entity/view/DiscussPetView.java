package com.entity.view;

import com.entity.DiscussPetEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**

 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
@TableName("discusschongwuxiangce")
public class DiscussPetView  extends DiscussPetEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussPetView(){
	}
 
 	public DiscussPetView(DiscussPetEntity discusschongwuxiangceEntity){
 	try {
			BeanUtils.copyProperties(this, discusschongwuxiangceEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
