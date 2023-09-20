package com.entity.view;

import com.entity.ImageClassEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * Album Category
 *               
 * （                      ）
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
@TableName("imageclass")
public class ImageClassView  extends ImageClassEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ImageClassView(){
	}
 
 	public ImageClassView(ImageClassEntity imageclassEntity){
 	try {
			BeanUtils.copyProperties(this, imageclassEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
