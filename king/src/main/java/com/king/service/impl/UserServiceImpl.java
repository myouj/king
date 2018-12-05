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
	public User getUser(String name, String password) {
		User user = mapper.getUser(name, password);
		System.out.println(user);
				
		return user;
	}

	
	
	

}
