/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.ma.springboot.controller 
 * @author: youj   
 * @date: 2018年10月19日 上午9:21:35 
 */
package com.king.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.king.entity.User;
import com.king.service.UserService;
import com.king.utils.ResultTool;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@SuppressWarnings("rawtypes")
	@PostMapping("/login")
	public Map getUser(String name, String pass) {
		
		// 第一步：创建令牌
		UsernamePasswordToken token = new UsernamePasswordToken(name, pass);
		
		// 第二步：获取Subject对象，该对象封装了一系列的操作
		Subject subject = SecurityUtils.getSubject();
		// 第三步：执行认证
		try {
			subject.login(token);
			return ResultTool.ajaxResult(true, "登录成功！");
		} catch (AuthenticationException e) {
			e.printStackTrace();
		}
		return ResultTool.ajaxResult(false, "登陆失败！");

	}

	@SuppressWarnings("rawtypes")
	@PostMapping("getName")
	public Map getName(HttpSession session) {
		Subject subject = SecurityUtils.getSubject();
		User user = (User) subject.getPrincipal();
		if (user == null) {
			return ResultTool.ajaxResult(false, "");
		}
		return ResultTool.ajaxResult(true, user.getName());
	}

	@SuppressWarnings("rawtypes")
	@PostMapping("logout")
	public Map logout(HttpSession session) {
//		session.invalidate();
		SecurityUtils.getSubject().logout();
		return ResultTool.ajaxResult(true, "");
	}

	@PostMapping("updatePassword")
	public String updatePassword(String newPassword, HttpSession session) {
//		User user = (User) session.getAttribute("user");
		Subject subject = SecurityUtils.getSubject();
		User user = (User) subject.getPrincipal();
		user.setPass(newPassword);
		userService.updateUser(user);

		return user.getPass();

	}

}
