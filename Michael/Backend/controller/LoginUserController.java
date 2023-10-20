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

import com.entity.LoginUserEntity;
import com.entity.view.LoginUserView;

import com.service.LoginUserService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;

/**
 * LoginUser Manager
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
@RestController
@RequestMapping("/yonghu")
public class LoginUserController {
    @Autowired
    private LoginUserService loginUserService;





    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * Login
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		LoginUserEntity u = loginUserService.selectOne(new EntityWrapper<LoginUserEntity>().eq("username", username));
		if(u==null || !u.getPassword().equals(password)) {
			return R.error("UserName or PassWord is Wrong");
		}
		request.getSession().setAttribute("userId", u.getId());
		System.out.print(request.getSession().getId()+"************"+request.getSession().getAttribute("userId"));
		String token = tokenService.generateToken(u.getId(), username,"loginuser",  "User" );
		return R.ok().put("token", token);
	}

	
	/**
     * register user
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody LoginUserEntity yonghu){
    	//ValidatorUtils.validateEntity(yonghu);
    	LoginUserEntity u = loginUserService.selectOne(new EntityWrapper<LoginUserEntity>().eq("username", yonghu.getUsername()));
		if(u!=null) {
			return R.error("UserName is already used");
		}
		Long uId = new Date().getTime();
		yonghu.setId(uId);
        loginUserService.insert(yonghu);
        return R.ok();
    }

	
	/**
	 * logout
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("Exit successfully");
	}
	
	/**
     * get User'sessionUser Information
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        LoginUserEntity u = loginUserService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * update PassWord 
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	LoginUserEntity u = loginUserService.selectOne(new EntityWrapper<LoginUserEntity>().eq("username", username));
    	if(u==null) {
    		return R.error("userName is wrong");
    	}
    	u.setPassword("123456");
        loginUserService.updateById(u);
        return R.ok("PassWord is reseted：123456");
    }
    
    /**
     * update PassWord 
     */
    @IgnoreAuth
	@RequestMapping(value = "/updatePass")
    public R updatePass(String password,Long userid,HttpServletRequest request){
    	
    	if(userid==null) {
    		return R.error("userName is wrong");
    	}
    	LoginUserEntity u = new LoginUserEntity<>();
    	u.setId(userid);
    	u.setPassword(password);
        loginUserService.updateById(u);
        return R.ok("PassWord is reseted="+password);
    }
    
    
    
    
    
    


    /**
     * user list
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LoginUserEntity yonghu, 
		HttpServletRequest request){

        EntityWrapper<LoginUserEntity> ew = new EntityWrapper<LoginUserEntity>();


		PageUtils page = loginUserService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yonghu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * pageList
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LoginUserEntity yonghu, 
		HttpServletRequest request){
        EntityWrapper<LoginUserEntity> ew = new EntityWrapper<LoginUserEntity>();

		PageUtils page = loginUserService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yonghu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * All Lists
     */
    @RequestMapping("/lists")
    public R list( LoginUserEntity yonghu){
       	EntityWrapper<LoginUserEntity> ew = new EntityWrapper<LoginUserEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yonghu, "yonghu")); 
        return R.ok().put("data", loginUserService.selectListView(ew));
    }

	 /**
     * Search
     */
    @RequestMapping("/query")
    public R query(LoginUserEntity yonghu){
        EntityWrapper< LoginUserEntity> ew = new EntityWrapper< LoginUserEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yonghu, "yonghu")); 
		LoginUserView yonghuView =  loginUserService.selectView(ew);
		return R.ok("Successfully queried user").put("data", yonghuView);
    }
	
    /**
     * User Details
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LoginUserEntity yonghu = loginUserService.selectById(id);
        return R.ok().put("data", yonghu);
    }

    /**
     *User Details
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LoginUserEntity yonghu = loginUserService.selectById(id);
        return R.ok().put("data", yonghu);
    }
    



    /**
     * User save
     */
    @RequestMapping("/save")
    public R save(@RequestBody LoginUserEntity yonghu, HttpServletRequest request){
    	yonghu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yonghu);
    	LoginUserEntity u = loginUserService.selectOne(new EntityWrapper<LoginUserEntity>().eq("username", yonghu.getUsername()));
		if(u!=null) {
			return R.error("User   ");
		}

		yonghu.setId(new Date().getTime());
        loginUserService.insert(yonghu);
        return R.ok();
    }
    
    /**
     * User save
     */
    @RequestMapping("/add")
    public R add(@RequestBody LoginUserEntity yonghu, HttpServletRequest request){
    	yonghu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yonghu);
    	LoginUserEntity u = loginUserService.selectOne(new EntityWrapper<LoginUserEntity>().eq("username", yonghu.getUsername()));
		if(u!=null) {
			return R.error("UserName is Wrong");
		}

		yonghu.setId(new Date().getTime());
        loginUserService.insert(yonghu);
        return R.ok();
    }


    /**
     * Modify
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody LoginUserEntity yonghu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yonghu);
        loginUserService.updateById(yonghu);//All  
        return R.ok();
    }

    
    

    /**
     * Delete
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        loginUserService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	


    /**
     * Delete
     */
    @RequestMapping("/deleteById")
    public R deleteById(String id){
        loginUserService.deleteBatchIds(Arrays.asList(id));
        return R.ok();
    }







}
