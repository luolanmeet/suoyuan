package com.sy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cck.User;
import com.object.resp.BaseResp;
import com.sy.service.IUserService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author cck
 */
@Slf4j
@RestController
public class UserController extends BaseController {
	
	@Reference
    private IUserService userService;
	
	@RequestMapping(value = "/register")
	public BaseResp register(String email, String pwd, String nickname) {
		
	    userService.register(email, pwd, nickname);
		return success();
	}
	
	@RequestMapping(value = "/login")
	public BaseResp login(String email, String pwd) {
		
		User user = userService.login(email, pwd);
		log.info("{}", user);
		return success(user);
	}
	
	@RequestMapping(value = "/update")
	public BaseResp update(User user) {
		
		userService.update(user);
		return success(user);
	}
	
}
