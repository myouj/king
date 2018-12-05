package com.king.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.king.entity.User;
import com.king.mapper.UserMapper;
import com.king.service.UserService;

/** 
* @author M_youj E-mail: 18565544225@163.com
* @version 创建时间：2018年12月4日 上午8:14:30 
* Describe:
*/
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper mapper;

	@Override
	@Transactional
	public int insertUser(String name, Integer age) {
		int result = mapper.insert(name, age);
		return result;
	}

	@Override
	public PageInfo<User> findByName(String name) {
		PageHelper.startPage(1, 5);
		List<User> users = mapper.findByName(name);
		PageInfo<User> pageInfo = new PageInfo<>(users);
		return pageInfo;
	}
	
	

}
