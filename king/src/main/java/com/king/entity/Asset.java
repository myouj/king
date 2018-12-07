package com.king.entity;

public class Asset {
	private String id;
	private String name;
	private String number;
	private String rfid;
	private Boolean status;

	public Asset() {
		super();
	}

	public Asset(String id, String name, String number, String rfid, Boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.rfid = rfid;
		this.status = status;
	}

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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Asset [id=" + id + ", name=" + name + ", number=" + number + ", rfid=" + rfid + ", status=" + status
				+ "]";
	}

}
