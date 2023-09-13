package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussPetEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussPetVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussPetView;


/**
 * Pet Album评论表
 *
 * @author Hang Xu
 * @email kvf7328@autuni.ac.nz
 * @date 13/9/2023
 */
public interface DiscussPetService extends IService<DiscussPetEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussPetVO> selectListVO(Wrapper<DiscussPetEntity> wrapper);
   	
   	DiscussPetVO selectVO(@Param("ew") Wrapper<DiscussPetEntity> wrapper);
   	
   	List<DiscussPetView> selectListView(Wrapper<DiscussPetEntity> wrapper);
   	
   	DiscussPetView selectView(@Param("ew") Wrapper<DiscussPetEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussPetEntity> wrapper);
   	

}

