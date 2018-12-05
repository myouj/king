package com.king.mapper;

import java.util.List;

import com.king.entity.ArLog;
import com.king.entity.AssertLog;
import com.king.entity.LightLog;

/** 
* @author hy
* @version 创建时间：2018年12月5日 上午15:22:00 
* Describe:
*/
public interface MyArLogMapper {
	
	List<ArLog> selectAllArLog();
}
