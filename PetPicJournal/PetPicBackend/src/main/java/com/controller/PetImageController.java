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

import com.entity.PetImageEntity;
import com.entity.view.PetImageView;

import com.service.PetImageService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * Pet Album
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
@RestController
@RequestMapping("/petimage")
public class PetImageController {
    @Autowired
    private PetImageService petImageService;



    @Autowired
    private StoreupService storeupService;


    


    
    
    /**
     * list
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PetImageEntity chongwuxiangce, 
		HttpServletRequest request){
        EntityWrapper<PetImageEntity> ew = new EntityWrapper<PetImageEntity>();

		PageUtils page = petImageService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwuxiangce), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * page
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PetImageEntity petImageEntity, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("loginuser")) {
			petImageEntity.setUsername((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<PetImageEntity> ew = new EntityWrapper<PetImageEntity>();


		PageUtils page = petImageService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, petImageEntity), params), params));
        return R.ok().put("data", page);
    }

	/**
     * list
     */
    @RequestMapping("/lists")
    public R list( PetImageEntity chongwuxiangce){
       	EntityWrapper<PetImageEntity> ew = new EntityWrapper<PetImageEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwuxiangce, "chongwuxiangce")); 
        return R.ok().put("data", petImageService.selectListView(ew));
    }

	 /**
     * Search
     */
    @RequestMapping("/query")
    public R query(PetImageEntity chongwuxiangce){
        EntityWrapper< PetImageEntity> ew = new EntityWrapper< PetImageEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwuxiangce, "chongwuxiangce")); 
		PetImageView chongwuxiangceView =  petImageService.selectView(ew);
		return R.ok("Successfully searched pet album").put("data", chongwuxiangceView);
    }
	
    /**
     * Details
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PetImageEntity chongwuxiangce = petImageService.selectById(id);
        return R.ok().put("data", chongwuxiangce);
    }

    /**
     * Details
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PetImageEntity chongwuxiangce = petImageService.selectById(id);
        return R.ok().put("data", chongwuxiangce);
    }
    



    /**
     * save
     */
    @RequestMapping("/save")
    public R save(@RequestBody PetImageEntity chongwuxiangce, HttpServletRequest request){
    	chongwuxiangce.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwuxiangce);

        petImageService.insert(chongwuxiangce);
        return R.ok();
    }
    
    /**
     * save
     */
    @RequestMapping("/add")
    public R add(@RequestBody PetImageEntity chongwuxiangce, HttpServletRequest request){
    	chongwuxiangce.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwuxiangce);

        petImageService.insert(chongwuxiangce);
        return R.ok();
    }


    /**
     * Modify
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody PetImageEntity chongwuxiangce, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwuxiangce);
        petImageService.updateById(chongwuxiangce);//All  
        return R.ok();
    }

    
    

    /**
     * Delete
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        petImageService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
