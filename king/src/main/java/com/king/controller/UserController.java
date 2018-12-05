/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.ma.springboot.controller 
 * @author: youj   
 * @date: 2018年10月19日 上午9:21:35 
 */
package com.king.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.king.entity.User;
import com.king.service.UserService;
import com.king.utils.ResultTool;

@RestController
public class UserController {

	@Autowired
	private UserService userService;


	@SuppressWarnings("rawtypes")
	@PostMapping("/login")
	public Map getUser(String name, String pass, HttpSession session) {
		User user = userService.getUser(name, pass);
		if (user != null) {
			session.setAttribute("user", user);
			return ResultTool.ajaxResult(true, "登陆成功");
		}
		return ResultTool.ajaxResult(false, "用户名或密码不正确");
	}

	@SuppressWarnings("rawtypes")
	@PostMapping("getName")
	public Map getName(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return ResultTool.ajaxResult(false, "");
		}
		return ResultTool.ajaxResult(true, user.getName());
	}
	
	
	@SuppressWarnings("rawtypes")
	@PostMapping("logout")
	public Map logout(HttpSession session) {
		session.invalidate();
		return ResultTool.ajaxResult(true, "");
	}

}
