package com.king.entity;

import java.sql.Date;

/** 
* @author hy
* @version 创建时间：2018年12月5日 上午16:16:00 
* Describe:
*/
public class ArLog {

	private String id;
	private Integer oxygen;
	private Integer humidification;
	private Integer heating;
	private Integer aeration;
	private Integer sleeping;
	private Integer timer;
	private Integer freshness;
	private Integer temperature;
	private Integer deviceno;
	private Date createtime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getOxygen() {
		return oxygen;
	}

	public void setOxygen(Integer oxygen) {
		this.oxygen = oxygen;
	}

	public Integer getHumidification() {
		return humidification;
	}

	public void setHumidification(Integer humidification) {
		this.humidification = humidification;
	}

	public Integer getHeating() {
		return heating;
	}

	public void setHeating(Integer heating) {
		this.heating = heating;
	}

	public Integer getAeration() {
		return aeration;
	}

	public void setAeration(Integer aeration) {
		this.aeration = aeration;
	}

	public Integer getSleeping() {
		return sleeping;
	}

	public void setSleeping(Integer sleeping) {
		this.sleeping = sleeping;
	}

	public Integer getTimer() {
		return timer;
	}

	public void setTimer(Integer timer) {
		this.timer = timer;
	}

	public Integer getFreshness() {
		return freshness;
	}

	public void setFreshness(Integer freshness) {
		this.freshness = freshness;
	}

	public Integer getTemperature() {
		return temperature;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}

	public Integer getDeviceno() {
		return deviceno;
	}

	public void setDeviceno(Integer deviceno) {
		this.deviceno = deviceno;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
}
