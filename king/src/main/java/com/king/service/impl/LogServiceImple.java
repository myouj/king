package com.king.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.king.entity.ArLog;
import com.king.entity.AssertLog;
import com.king.entity.LightLog;
import com.king.mapper.MyLogMapper;
import com.king.service.LogService;
import com.king.utils.ResultInfo;
import com.king.utils.ResultTool;

/** 
* @author hy
* @version 创建时间：2018年12月5日 上午15:26:00 
* Describe:
*/
@Service
public class LogServiceImple implements LogService {
	
	@Autowired
	private MyLogMapper myLogMapper;

	@Override
	public ResultInfo selectAllLightLog(int page, int rows) {
		PageHelper.startPage(page, rows);
		List<LightLog> lightLogs = myLogMapper.selectAllLightLog();
		PageInfo<LightLog> pageInfo = new PageInfo<>(lightLogs);
		return ResultTool.setResult(pageInfo, lightLogs);
	}
	
	@Override
	public ResultInfo selectAllArLog(int page, int rows) {
		PageHelper.startPage(page, rows);
		List<ArLog> ArLogs = myLogMapper.selectAllArLog();
		PageInfo<ArLog> pageInfo = new PageInfo<>(ArLogs);
		return ResultTool.setResult(pageInfo, ArLogs);
	}
	
	@Override
	public ResultInfo selectAllAssertLog(int page, int rows) {
		PageHelper.startPage(page, rows);
		List<AssertLog> AssertLogs = myLogMapper.selectAllAssertLog();
		PageInfo<AssertLog> pageInfo = new PageInfo<>(AssertLogs);
		return ResultTool.setResult(pageInfo, AssertLogs);
	}

}
