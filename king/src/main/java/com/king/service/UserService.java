/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.ma.springboot.service 
 * @author: youj   
 * @date: 2018年10月19日 上午9:17:19 
 */
package com.king.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.king.entity.User;
import com.king.mapper.UserMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserMapper mapper;
	
	@Transactional
	public int insertUser(String name, Integer age){
		int result = mapper.insert(name, age);
		int i = 1 / age;
		log.info("result:{}", result);
		return result;
	}
	
	public User findByName(String name) {
		User user = mapper.findByName(name);
		return user;
	}

}
