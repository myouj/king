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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.king.entity.User;
import com.king.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/insert")
	public Integer insert(String name, Integer age){
		
		return userService.insertUser(name, age);
	}
	
	@RequestMapping("/findByName")
	public Map<String, List<User>> findByName(String name){
		Map<String, List<User>> map = new HashMap<>();
		List<User> users = userService.findByName(name);
		map.put("users", users);
		return map;
	}

}
