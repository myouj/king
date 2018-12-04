/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.ma.springboot.mapper 
 * @author: youj   
 * @date: 2018年10月19日 上午9:12:27 
 */
package com.king.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.king.entity.User;

public interface UserMapper {
	
	List<User> findByName(@Param("name") String name);
	
	int insert(@Param("name") String name, @Param("age") Integer age);
	
}
