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


import com.dao.PetImageDao;
import com.entity.PetImageEntity;
import com.service.PetImageService;
import com.entity.vo.PetImageVO;
import com.entity.view.PetImageView;

@Service("chongwuxiangceService")
public class PetImageServiceImpl extends ServiceImpl<PetImageDao, PetImageEntity> implements PetImageService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PetImageEntity> page = this.selectPage(
                new Query<PetImageEntity>(params).getPage(),
                new EntityWrapper<PetImageEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PetImageEntity> wrapper) {
		  Page<PetImageView> page =new Query<PetImageView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PetImageVO> selectListVO(Wrapper<PetImageEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PetImageVO selectVO(Wrapper<PetImageEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PetImageView> selectListView(Wrapper<PetImageEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PetImageView selectView(Wrapper<PetImageEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
