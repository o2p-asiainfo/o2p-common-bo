package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
public class TimeSegDtl implements Serializable{
private static final long serialVersionUID = 1L;
	
    private Integer timeSegDtlId;
	private BigDecimal segId;
	private String startDate = "1";
	private String startTime = "00";
	private String endDate = "1";
	private String endTime = "59";
	private String statusCd;
	private Date createDate;
	private Date version;
	private Date statusDate;
	/**
	 * 租户ID
	 */
	private Integer tenantId;
	private String operateCode;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getStatusCd() {
		return statusCd;
	}
	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
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
	public Date getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}
	public BigDecimal getSegId() {
		return segId;
	}
	public void setSegId(BigDecimal segId) {
		this.segId = segId;
	}
	public Integer getTimeSegDtlId() {
		return timeSegDtlId;
	}
	public void setTimeSegDtlId(Integer timeSegDtlId) {
		this.timeSegDtlId = timeSegDtlId;
	}
	public String getOperateCode() {
		return operateCode;
	}
	public void setOperateCode(String operateCode) {
		this.operateCode = operateCode;
	}
}
