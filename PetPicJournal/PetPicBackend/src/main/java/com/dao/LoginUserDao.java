package com.dao;

import com.entity.LoginUserEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LoginUserVO;
import com.entity.view.LoginUserView;


/**
 * User
 * 
 * @author 
 * @email 
 */
public interface LoginUserDao extends BaseMapper<LoginUserEntity> {
	
	List<LoginUserVO> selectListVO(@Param("ew") Wrapper<LoginUserEntity> wrapper);
	
	LoginUserVO selectVO(@Param("ew") Wrapper<LoginUserEntity> wrapper);
	
	List<LoginUserView> selectListView(@Param("ew") Wrapper<LoginUserEntity> wrapper);

	List<LoginUserView> selectListView(Pagination page,@Param("ew") Wrapper<LoginUserEntity> wrapper);
	
	LoginUserView selectView(@Param("ew") Wrapper<LoginUserEntity> wrapper);
	

}
