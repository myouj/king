/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.ma.springboot 
 * @author: youj   
 * @date: 2018年10月19日 上午9:24:18 
 */
package com.king;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"com.ma.springboot.mapper"})
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
