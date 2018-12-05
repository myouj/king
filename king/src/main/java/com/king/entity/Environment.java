package com.king.entity;

import java.sql.Date;

/**
 * @author M_youj E-mail: 18565544225@163.com
 * @version 创建时间：2018年12月5日 上午9:03:29 Describe:
 */
public class Environment {
	private String id;
	private Integer body;
	private Float humidity;
	private Integer fire;
	private Integer smoke;
	private Float temperature;
	private Integer illuminance;
	private Date createtime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getBody() {
		return body;
	}

	public void setBody(Integer body) {
		this.body = body;
	}

	public Float getHumidity() {
		return humidity;
	}

	public void setHumidity(Float humidity) {
		this.humidity = humidity;
	}

	public Integer getFire() {
		return fire;
	}

	public void setFire(Integer fire) {
		this.fire = fire;
	}

	public Integer getSmoke() {
		return smoke;
	}

	public void setSmoke(Integer smoke) {
		this.smoke = smoke;
	}

	public Float getTemperature() {
		return temperature;
	}

	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}

	public Integer getIlluminance() {
		return illuminance;
	}

	public void setIlluminance(Integer illuminance) {
		this.illuminance = illuminance;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Override
	public String toString() {
		return "Environment [id=" + id + ", body=" + body + ", humidity=" + humidity + ", fire=" + fire + ", smoke="
				+ smoke + ", temperature=" + temperature + ", illuminance=" + illuminance + ", createtime=" + createtime
				+ "]";
	}

}
