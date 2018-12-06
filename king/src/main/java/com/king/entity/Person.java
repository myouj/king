package com.king.entity;

/**
 * @author M_youj E-mail: 18565544225@163.com
 * @version 创建时间：2018年12月6日 上午9:18:33 Describe:
 */
public class Person {

	private String id;
	private String name;
	private String number;
	private String rfid;
	private boolean status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getRfid() {
		return rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", number=" + number + ", rfid=" + rfid + ", status=" + status
				+ "]";
	}

}
