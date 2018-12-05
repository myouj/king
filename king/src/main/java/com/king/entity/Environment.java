package com.king.entity;

import java.sql.Date;

import lombok.Data;
import lombok.ToString;

/** 
* @author M_youj E-mail: 18565544225@163.com
* @version 创建时间：2018年12月5日 上午9:03:29 
* Describe:
*/
@Data
@ToString
public class Environment {
	private String id;
	private Integer body;
	private Float humidity;
	private Integer fire;
	private Integer smoke;
	private Float temperature;
	private Integer illuminance;
	private Date createtime;

}
