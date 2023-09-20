package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussPetEntity;
import com.entity.view.DiscussPetView;

import com.service.DiscussPetService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;

/**
 * Pet Album
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
@RestController
@RequestMapping("/discusschongwuxiangce")
public class DiscussPetController {
    @Autowired
    private DiscussPetService discusschongwuxiangceService;





    


    /**
     * page
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussPetEntity discusschongwuxiangce, 
		HttpServletRequest request){

        EntityWrapper<DiscussPetEntity> ew = new EntityWrapper<DiscussPetEntity>();


		PageUtils page = discusschongwuxiangceService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschongwuxiangce), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * list
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussPetEntity discusschongwuxiangce, 
		HttpServletRequest request){
        EntityWrapper<DiscussPetEntity> ew = new EntityWrapper<DiscussPetEntity>();

		PageUtils page = discusschongwuxiangceService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschongwuxiangce), params), params));
        return R.ok().put("data", page);
    }

	/**
     * list
     */
    @RequestMapping("/lists")
    public R list( DiscussPetEntity discusschongwuxiangce){
       	EntityWrapper<DiscussPetEntity> ew = new EntityWrapper<DiscussPetEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusschongwuxiangce, "discusschongwuxiangce")); 
        return R.ok().put("data", discusschongwuxiangceService.selectListView(ew));
    }

	 /**
     * Search
     */
    @RequestMapping("/query")
    public R query(DiscussPetEntity discusschongwuxiangce){
        EntityWrapper< DiscussPetEntity> ew = new EntityWrapper< DiscussPetEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusschongwuxiangce, "discusschongwuxiangce")); 
		DiscussPetView discusschongwuxiangceView =  discusschongwuxiangceService.selectView(ew);
		return R.ok("Successfully queried pet album comment table").put("data", discusschongwuxiangceView);
    }
	
    /**
     * Details
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussPetEntity discusschongwuxiangce = discusschongwuxiangceService.selectById(id);
        return R.ok().put("data", discusschongwuxiangce);
    }

    /**
     * Details
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussPetEntity discusschongwuxiangce = discusschongwuxiangceService.selectById(id);
        return R.ok().put("data", discusschongwuxiangce);
    }
    



    /**
     * save
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussPetEntity discusschongwuxiangce, HttpServletRequest request){
    	discusschongwuxiangce.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusschongwuxiangce);

        discusschongwuxiangceService.insert(discusschongwuxiangce);
        return R.ok();
    }
    
    /**
     * save
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussPetEntity discusschongwuxiangce, HttpServletRequest request){
    	discusschongwuxiangce.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusschongwuxiangce);

        discusschongwuxiangceService.insert(discusschongwuxiangce);
        return R.ok();
    }


    /**
     * Modify
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DiscussPetEntity discusschongwuxiangce, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusschongwuxiangce);
        discusschongwuxiangceService.updateById(discusschongwuxiangce);//All  
        return R.ok();
    }

    
    

    /**
     * Delete
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusschongwuxiangceService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
