package com.king.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.king.service.LogService;
import com.king.utils.ResultInfo;

/** 
* @author hy
* @version 创建时间：2018年12月5日 上午15:28:00 
* Describe:
*/
@RestController
public class LogController {
	
	@Autowired
	private LogService logService;
	
	@PostMapping(value="/listLightLog", produces="application/json;charset=utf-8")
	public ResultInfo selectAllLightLog(int page, int rows){
		return logService.selectAllLightLog(page, rows);
	}
	
	@PostMapping(value="/listArLog", produces="application/json;charset=utf-8")
	public ResultInfo selectAllArLog(int page, int rows){
		return logService.selectAllArLog(page, rows);
	}
	
	@PostMapping(value="/listAssertLog", produces="application/json;charset=utf-8")
	public ResultInfo selectAllAssertLog(int page, int rows){
		return logService.selectAllAssertLog(page, rows);
	}

}
