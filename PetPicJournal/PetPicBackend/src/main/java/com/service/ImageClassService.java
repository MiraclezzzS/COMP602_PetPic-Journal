package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ImageClassEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ImageClassVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ImageClassView;


/**
 * Album Category
 *
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
public interface ImageClassService extends IService<ImageClassEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ImageClassVO> selectListVO(Wrapper<ImageClassEntity> wrapper);
   	
   	ImageClassVO selectVO(@Param("ew") Wrapper<ImageClassEntity> wrapper);
   	
   	List<ImageClassView> selectListView(Wrapper<ImageClassEntity> wrapper);
   	
   	ImageClassView selectView(@Param("ew") Wrapper<ImageClassEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ImageClassEntity> wrapper);
   	

}

