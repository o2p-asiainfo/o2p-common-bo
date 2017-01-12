package com.ailk.eaap.op2.bo;

import java.util.Date;

import com.ailk.eaap.op2.bo.utc.DateConvertBeanImpl;
import com.ailk.eaap.op2.bo.utc.DateConvertField;

public class BaseClass implements DateConvertBeanImpl {

	@DateConvertField
	private Date statusDate;
	private String formatStatusDate;
	@DateConvertField
	private Date createDate;
	private String formatCreateDate;
	@DateConvertField
	private Date version;
	private String statusCd;
	private Integer begin = 0;
	private Integer end = 9;
	
	public String getStatusCd() {
		return statusCd;
	}
	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}
	public Date getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getVersion() {
		return version;
	}
	public void setVersion(Date version) {
		this.version = version;
	}
	public String getFormatStatusDate() {
		return formatStatusDate;
	}
	public void setFormatStatusDate(String formatStatusDate) {
		this.formatStatusDate = formatStatusDate;
	}
	public String getFormatCreateDate() {
		return formatCreateDate;
	}
	public void setFormatCreateDate(String formatCreateDate) {
		this.formatCreateDate = formatCreateDate;
	}
	public Integer getBegin() {
		return begin;
	}
	public void setBegin(Integer begin) {
		this.begin = begin;
	}
	public Integer getEnd() {
		return end;
	}
	public void setEnd(Integer end) {
		this.end = end;
	}
	
	
}
