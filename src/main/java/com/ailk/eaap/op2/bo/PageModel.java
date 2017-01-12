package com.ailk.eaap.op2.bo;

import java.util.List;

public class PageModel {
	private Object recordsTotal;
	private Object recordsFiltered;
	private Object draw;
	private List data;
	
	public Object getRecordsTotal() {
		return recordsTotal;
	}
	public void setTotalSize(Object totalSize) {
		this.recordsTotal = totalSize;
	}
	public List getData() {
		return data;
	}
	public void setData(List data) {
		this.data = data;
	}
	public Object getRecordsFiltered() {
		return recordsFiltered;
	}
	public void setRecordsFiltered(Object recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}
	public Object getDraw() {
		return draw;
	}
	public void setDraw(Object draw) {
		this.draw = draw;
	}
	public void setRecordsTotal(Object recordsTotal) {
		this.recordsTotal = recordsTotal;
	}
	
}
