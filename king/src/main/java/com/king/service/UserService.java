/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.ma.springboot.service 
 * @author: youj   
 * @date: 2018年10月19日 上午9:17:19 
 */
package com.king.service;

import java.util.List;

import com.king.entity.User;

public interface UserService {
	
	
	public int insertUser(String name, Integer age);
	
	public List<User> findByName(String name);

}
