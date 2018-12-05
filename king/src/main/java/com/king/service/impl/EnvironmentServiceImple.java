package com.king.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.king.entity.Environment;
import com.king.mapper.EnvironmentMapper;
import com.king.service.IEnvironmentService;

/** 
* @author M_youj E-mail: 18565544225@163.com
* @version 创建时间：2018年12月5日 上午9:08:33 
* Describe:
*/
@Service
public class EnvironmentServiceImple implements IEnvironmentService {
	
	@Autowired
	private EnvironmentMapper environmentMapper;

	@Override
	public PageInfo<Environment> selectAllEnvironment(int page, int rows) {
		PageHelper.startPage(page, rows);
		List<Environment> environments = environmentMapper.selectAllEnvironment();
		PageInfo<Environment> pageInfo = new PageInfo<>(environments);
		return pageInfo;
	}

}
