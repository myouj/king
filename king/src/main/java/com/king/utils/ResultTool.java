package com.king.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;

/** 
* @author M_youj E-mail: 18565544225@163.com
* @version 创建时间：2018年12月5日 上午11:35:04 
* Describe:
*/
public final class ResultTool {
	
	@SuppressWarnings("rawtypes")
	public static ResultInfo setResult(PageInfo pageInfo, List list) {
		return new ResultInfo(pageInfo.getStartRow(), pageInfo.getPageSize(), (int)pageInfo.getTotal(), list);
	}
	
	public static Map<String, Object> ajaxResult(boolean status, String message) {
		Map<String, Object> map = new HashMap<>();
		map.put("status", status);
		map.put("message", message);
		return map;
	}

}
