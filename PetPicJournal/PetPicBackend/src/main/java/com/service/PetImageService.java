package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PetImageEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PetImageVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PetImageView;


/**
 * Pet Album
 *
 * @author Jingzhao PIAO
 * @email hcb1764@autuni.ac.nz
 * @date 2023-09-14
 */
public interface PetImageService extends IService<PetImageEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PetImageVO> selectListVO(Wrapper<PetImageEntity> wrapper);
   	
   	PetImageVO selectVO(@Param("ew") Wrapper<PetImageEntity> wrapper);
   	
   	List<PetImageView> selectListView(Wrapper<PetImageEntity> wrapper);
   	
   	PetImageView selectView(@Param("ew") Wrapper<PetImageEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PetImageEntity> wrapper);
   	

}

