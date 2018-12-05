package com.king.service;

import com.king.utils.ResultInfo;

/** 
* @author hy
* @version 创建时间：2018年12月5日 上午15:24:00 
* Describe:
*/
public interface LogService {
	
	ResultInfo selectAllLightLog(int page, int rows);
	ResultInfo selectAllArLog(int page, int rows);
	ResultInfo selectAllAssertLog(int page, int rows);
}
