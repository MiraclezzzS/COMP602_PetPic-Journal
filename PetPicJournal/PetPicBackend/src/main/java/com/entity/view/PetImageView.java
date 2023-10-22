package com.entity.view;

import com.entity.PetImageEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * Pet Album
 *               
 * （                      ）
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
@TableName("petimage")
public class PetImageView  extends PetImageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PetImageView(){
	}
 
 	public PetImageView(PetImageEntity chongwuxiangceEntity){
 	try {
			BeanUtils.copyProperties(this, chongwuxiangceEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
