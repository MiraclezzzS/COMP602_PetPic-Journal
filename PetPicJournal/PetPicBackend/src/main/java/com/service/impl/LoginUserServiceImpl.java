package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LoginUserDao;
import com.entity.LoginUserEntity;
import com.service.LoginUserService;
import com.entity.vo.LoginUserVO;
import com.entity.view.LoginUserView;

@Service("yonghuService")
public class LoginUserServiceImpl extends ServiceImpl<LoginUserDao, LoginUserEntity> implements LoginUserService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LoginUserEntity> page = this.selectPage(
                new Query<LoginUserEntity>(params).getPage(),
                new EntityWrapper<LoginUserEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LoginUserEntity> wrapper) {
		  Page<LoginUserView> page =new Query<LoginUserView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LoginUserVO> selectListVO(Wrapper<LoginUserEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LoginUserVO selectVO(Wrapper<LoginUserEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LoginUserView> selectListView(Wrapper<LoginUserEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LoginUserView selectView(Wrapper<LoginUserEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
