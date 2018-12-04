package com.king.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.king.entity.User;
import com.king.mapper.UserMapper;
import com.king.service.UserService;

import lombok.extern.slf4j.Slf4j;

/** 
* @author M_youj E-mail: 18565544225@163.com
* @version 创建时间：2018年12月4日 上午8:14:30 
* Describe:
*/
@Service
@Slf4j
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper mapper;

	@Override
	@Transactional
	public int insertUser(String name, Integer age) {
		int result = mapper.insert(name, age);
		int i = 1 / age;
		log.info("result:{}", result);
		return result;
	}

	@Override
	public List<User> findByName(String name) {
		List<User> user = mapper.findByName(name);
		return user;
	}
	
	

}
