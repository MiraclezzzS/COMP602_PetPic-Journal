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

import com.entity.ChatEntity;
import com.entity.view.ChatView;

import com.service.ChatService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;

/**
 * Feedback suggestions
 * @author 
 * @email 
 * @date 2023-08-26 17:38:30
 */
@RestController
@RequestMapping("/chat")
public class ChatController {
    @Autowired
    private ChatService chatService;





    


    /**
     * page
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChatEntity chat, 
		HttpServletRequest request){
    	if(!request.getSession().getAttribute("role").toString().equals("Admin")) {
    		chat.setUserid((Long)request.getSession().getAttribute("userId"));
    	}

        EntityWrapper<ChatEntity> ew = new EntityWrapper<ChatEntity>();


		PageUtils page = chatService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chat), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * list
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChatEntity chat, 
		HttpServletRequest request){
    	if(!request.getSession().getAttribute("role").toString().equals("Admin")) {
    		chat.setUserid((Long)request.getSession().getAttribute("userId"));
    	}

        EntityWrapper<ChatEntity> ew = new EntityWrapper<ChatEntity>();

		PageUtils page = chatService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chat), params), params));
        return R.ok().put("data", page);
    }

	/**
     * list
     */
    @RequestMapping("/lists")
    public R list( ChatEntity chat){
       	EntityWrapper<ChatEntity> ew = new EntityWrapper<ChatEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chat, "chat")); 
        return R.ok().put("data", chatService.selectListView(ew));
    }

	 /**
     * Search
     */
    @RequestMapping("/query")
    public R query(ChatEntity chat){
        EntityWrapper< ChatEntity> ew = new EntityWrapper< ChatEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chat, "chat")); 
		ChatView chatView =  chatService.selectView(ew);
		return R.ok("Query feedback suggestions successful").put("data", chatView);
    }
	
    /**
     * info
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChatEntity chat = chatService.selectById(id);
        return R.ok().put("data", chat);
    }

    /**
     * Details
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChatEntity chat = chatService.selectById(id);
        return R.ok().put("data", chat);
    }
    



    /**
     * save
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChatEntity chat, HttpServletRequest request){
    	chat.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chat);
    	if(StringUtils.isNotBlank(chat.getAsk())) {
			chatService.updateForSet("isreply=0", new EntityWrapper<ChatEntity>().eq("userid", request.getSession().getAttribute("userId")));
    		chat.setUserid((Long)request.getSession().getAttribute("userId"));
    		chat.setIsreply(1);
    	}
    	if(StringUtils.isNotBlank(chat.getReply())) {
    		chatService.updateForSet("isreply=0", new EntityWrapper<ChatEntity>().eq("userid", chat.getUserid()));
    		chat.setAdminid((Long)request.getSession().getAttribute("userId"));
    	}

        chatService.insert(chat);
        return R.ok();
    }
    
    /**
     * save
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChatEntity chat, HttpServletRequest request){
    	chat.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chat);
    	chat.setUserid((Long)request.getSession().getAttribute("userId"));
    	if(StringUtils.isNotBlank(chat.getAsk())) {
    		chat.setReply("We have received your feedback and the staff may contact you within 3 working days");
			chatService.updateForSet("isreply=0", new EntityWrapper<ChatEntity>().eq("userid", request.getSession().getAttribute("userId")));
    		chat.setUserid((Long)request.getSession().getAttribute("userId"));
    		chat.setIsreply(1);
    	}
    	if(StringUtils.isNotBlank(chat.getReply())) {
    		chatService.updateForSet("isreply=0", new EntityWrapper<ChatEntity>().eq("userid", chat.getUserid()));
    		chat.setAdminid((Long)request.getSession().getAttribute("userId"));
    	}
        chatService.insert(chat);
        return R.ok();
    }


    /**
     * Modify
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChatEntity chat, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chat);
        chatService.updateById(chat);//All  
        return R.ok();
    }

    
    

    /**
     * Delete
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chatService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
