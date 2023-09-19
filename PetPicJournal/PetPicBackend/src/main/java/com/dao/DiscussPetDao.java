package com.dao;

import com.entity.DiscussPetEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussPetVO;
import com.entity.view.DiscussPetView;


/**
 * 
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
public interface DiscussPetDao extends BaseMapper<DiscussPetEntity> {
	
	List<DiscussPetVO> selectListVO(@Param("ew") Wrapper<DiscussPetEntity> wrapper);
	
	DiscussPetVO selectVO(@Param("ew") Wrapper<DiscussPetEntity> wrapper);
	
	List<DiscussPetView> selectListView(@Param("ew") Wrapper<DiscussPetEntity> wrapper);

	List<DiscussPetView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussPetEntity> wrapper);
	
	DiscussPetView selectView(@Param("ew") Wrapper<DiscussPetEntity> wrapper);
	

}
