package com.entity.view;

import com.entity.ImageClassEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 
@TableName("xiangcefenlei")
public class ImageClassView  extends ImageClassEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ImageClassView(){
	}
 
 	public ImageClassView(ImageClassEntity xiangcefenleiEntity){
 	try {
			BeanUtils.copyProperties(this, xiangcefenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
