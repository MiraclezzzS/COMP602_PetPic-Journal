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
import com.dao.DiscussPetDao;
import com.entity.DiscussPetEntity;
import com.service.DiscussPetService;
import com.entity.vo.DiscussPetVO;
import com.entity.view.DiscussPetView;

@Service("discusschongwuxiangceService")
public class DiscussPetServiceImpl extends ServiceImpl<DiscussPetDao, DiscussPetEntity> implements DiscussPetService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussPetEntity> page = this.selectPage(
                new Query<DiscussPetEntity>(params).getPage(),
                new EntityWrapper<DiscussPetEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussPetEntity> wrapper) {
		  Page<DiscussPetView> page =new Query<DiscussPetView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussPetVO> selectListVO(Wrapper<DiscussPetEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussPetVO selectVO(Wrapper<DiscussPetEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussPetView> selectListView(Wrapper<DiscussPetEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussPetView selectView(Wrapper<DiscussPetEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
