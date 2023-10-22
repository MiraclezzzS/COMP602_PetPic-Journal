package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LoginUserEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LoginUserVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LoginUserView;


/**
 * User
 *
 * @author 
 * @email 
 */
public interface LoginUserService extends IService<LoginUserEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LoginUserVO> selectListVO(Wrapper<LoginUserEntity> wrapper);
   	
   	LoginUserVO selectVO(@Param("ew") Wrapper<LoginUserEntity> wrapper);
   	
   	List<LoginUserView> selectListView(Wrapper<LoginUserEntity> wrapper);
   	
   	LoginUserView selectView(@Param("ew") Wrapper<LoginUserEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LoginUserEntity> wrapper);
   	

}

