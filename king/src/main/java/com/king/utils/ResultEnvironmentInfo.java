package com.king.utils;

import java.util.List;

/**
 * @author M_youj E-mail: 18565544225@163.com
 * @version 创建时间：2018年12月5日 上午11:23:46 Describe:
 */
public class ResultEnvironmentInfo {
	private int start; // 从第几条开始查询
	private int pageSize; // 每页显示的记录数
	private int total; // 总记录数
	private List rows; // 保存查询的结果
	
	

	public ResultEnvironmentInfo(int start, int pageSize, int total, List rows) {
		super();
		this.start = start;
		this.pageSize = pageSize;
		this.total = total;
		this.rows = rows;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

}
