/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.ma.springboot.service 
 * @author: youj   
 * @date: 2018年10月19日 上午9:17:19 
 */
package com.king.service;

import com.king.entity.User;

public interface UserService {
	
	
	public User getUser(String name, String password);
	
	void updateUser(User user);

}
