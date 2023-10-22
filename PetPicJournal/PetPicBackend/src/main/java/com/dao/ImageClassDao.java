package com.dao;

import com.entity.ImageClassEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ImageClassVO;
import com.entity.view.ImageClassView;


/**
 * Album Category
 * 
 * @author 
 * @email 
 */
public interface ImageClassDao extends BaseMapper<ImageClassEntity> {
	
	List<ImageClassVO> selectListVO(@Param("ew") Wrapper<ImageClassEntity> wrapper);
	
	ImageClassVO selectVO(@Param("ew") Wrapper<ImageClassEntity> wrapper);
	
	List<ImageClassView> selectListView(@Param("ew") Wrapper<ImageClassEntity> wrapper);

	List<ImageClassView> selectListView(Pagination page,@Param("ew") Wrapper<ImageClassEntity> wrapper);
	
	ImageClassView selectView(@Param("ew") Wrapper<ImageClassEntity> wrapper);
	

}
