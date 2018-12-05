package com.king.service;

import com.king.utils.ResultEnvironmentInfo;

/** 
* @author M_youj E-mail: 18565544225@163.com
* @version 创建时间：2018年12月5日 上午9:07:38 
* Describe:
*/
public interface IEnvironmentService {
	
	ResultEnvironmentInfo selectAllEnvironment(int page, int rows);

}
