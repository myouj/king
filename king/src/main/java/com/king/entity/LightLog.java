package com.king.entity;

import java.sql.Date;

/** 
* @author hy
* @version 创建时间：2018年12月5日 上午15:50:00 
* Describe:
*/
public class LightLog {
	
	private String id;
	private Integer operation;
	private Date createtime;
	private Integer deviceno;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getOperation() {
		return operation;
	}
	public void setOperation(Integer operation) {
		this.operation = operation;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Integer getDeviceno() {
		return deviceno;
	}
	public void setDeviceno(Integer deviceno) {
		this.deviceno = deviceno;
	}
	@Override
	public String toString() {
		return "LightLog [id=" + id + ", operation=" + operation + ", createtime=" + createtime + ", deviceno="
				+ deviceno + "]";
	}
}
