package com.king.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.king.service.IEnvironmentService;
import com.king.utils.ResultEnvironmentInfo;

/** 
* @author M_youj E-mail: 18565544225@163.com
* @version 创建时间：2018年12月5日 上午9:16:57 
* Describe:
*/
@RestController
public class EnvironmentController {
	
	@Autowired
	private IEnvironmentService environmentService;
	
	@PostMapping(value="/selectAllEnvironment", produces="application/json;charset=utf-8")
	public ResultEnvironmentInfo selectAllEnvironment(int page, int rows){
		return environmentService.selectAllEnvironment(page, rows);
	}

}
