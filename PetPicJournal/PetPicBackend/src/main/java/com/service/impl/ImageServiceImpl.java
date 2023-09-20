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


import com.dao.ImageClassDao;
import com.entity.ImageClassEntity;
import com.service.ImageClassService;
import com.entity.vo.ImageClassVO;
import com.entity.view.ImageClassView;

@Service("xiangcefenleiService")
public class ImageClassServiceImpl extends ServiceImpl<ImageClassDao, ImageClassEntity> implements ImageClassService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ImageClassEntity> page = this.selectPage(
                new Query<ImageClassEntity>(params).getPage(),
                new EntityWrapper<ImageClassEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ImageClassEntity> wrapper) {
		  Page<ImageClassView> page =new Query<ImageClassView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ImageClassVO> selectListVO(Wrapper<ImageClassEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ImageClassVO selectVO(Wrapper<ImageClassEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ImageClassView> selectListView(Wrapper<ImageClassEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ImageClassView selectView(Wrapper<ImageClassEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
