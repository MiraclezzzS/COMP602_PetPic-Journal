package com.entity.view;

import com.entity.PetImageEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * Pet Album
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * 
 * 
 * @author Jingzhao PIAO
 * @email hcb1764@autuni.ac.nz
 * @date 2023-09-15
 */
@TableName("chongwuxiangce")
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
