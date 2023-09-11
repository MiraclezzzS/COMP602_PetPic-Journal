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

import com.entity.ImageClassEntity;
import com.entity.view.ImageClassView;

import com.service.ImageClassService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;

@RestController
@RequestMapping("/xiangcefenlei")
public class ImageClassController {
    @Autowired
    private ImageClassService xiangcefenleiService;

    /**
     * list
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ImageClassEntity xiangcefenlei, 
		HttpServletRequest request){
        EntityWrapper<ImageClassEntity> ew = new EntityWrapper<ImageClassEntity>();

		PageUtils page = xiangcefenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiangcefenlei), params), params));
        return R.ok().put("data", page);
    }

    /**
     * page
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ImageClassEntity xiangcefenlei, 
		HttpServletRequest request){

        EntityWrapper<ImageClassEntity> ew = new EntityWrapper<ImageClassEntity>();


		PageUtils page = xiangcefenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiangcefenlei), params), params));
        return R.ok().put("data", page);
    }
    
	/**
     * list
     */
    @RequestMapping("/lists")
    public R list( ImageClassEntity xiangcefenlei){
       	EntityWrapper<ImageClassEntity> ew = new EntityWrapper<ImageClassEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xiangcefenlei, "xiangcefenlei")); 
        return R.ok().put("data", xiangcefenleiService.selectListView(ew));
    }

	 /**
     * Search
     */
    @RequestMapping("/query")
    public R query(ImageClassEntity xiangcefenlei){
        EntityWrapper< ImageClassEntity> ew = new EntityWrapper< ImageClassEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xiangcefenlei, "xiangcefenlei")); 
		ImageClassView xiangcefenleiView =  xiangcefenleiService.selectView(ew);
		return R.ok("Successfully queried album classification").put("data", xiangcefenleiView);
    }
	
    /**
     * Details
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ImageClassEntity xiangcefenlei = xiangcefenleiService.selectById(id);
        return R.ok().put("data", xiangcefenlei);
    }

    /**
     * Details
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ImageClassEntity xiangcefenlei = xiangcefenleiService.selectById(id);
        return R.ok().put("data", xiangcefenlei);
    }

    /**
     * save
     */
    @RequestMapping("/save")
    public R save(@RequestBody ImageClassEntity xiangcefenlei, HttpServletRequest request){
    	xiangcefenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiangcefenlei);

        xiangcefenleiService.insert(xiangcefenlei);
        return R.ok();
    }
    
    /**
     * save
     */
    @RequestMapping("/add")
    public R add(@RequestBody ImageClassEntity xiangcefenlei, HttpServletRequest request){
    	xiangcefenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiangcefenlei);

        xiangcefenleiService.insert(xiangcefenlei);
        return R.ok();
    }

    /**
     * Modify
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ImageClassEntity xiangcefenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xiangcefenlei);
        xiangcefenleiService.updateById(xiangcefenlei);//All更新
        return R.ok();
    }

    /**
     * Delete
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xiangcefenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

}
