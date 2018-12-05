package com.king.entity;

import java.sql.Date;

/** 
* @author hy
* @version 创建时间：2018年12月5日 上午16:15:00 
* Describe:
*/
public class AssertLog {

	private String id;
	private String rfid;
	private Date createTime;
	private Integer status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRfid() {
		return rfid;
	}
	public void setRfid(String rfid) {
		this.rfid = rfid;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}
