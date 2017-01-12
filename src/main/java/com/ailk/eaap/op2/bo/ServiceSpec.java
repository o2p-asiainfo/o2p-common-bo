package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;



import com.ailk.eaap.op2.bo.utc.DateConvertBeanImpl;
import com.ailk.eaap.op2.bo.utc.DateConvertField;

public class ServiceSpec implements Serializable, DateConvertBeanImpl {
	private static final long serialVersionUID = 1L;
	private BigDecimal serviceId;
	private String serviceCode;
	private String serviceName;
	private String serviceDesc;
	private String manageGrade;
	private String serviceType;
	private Integer serviceProviderId;
	private String statusCd;
	private Date statusDate;
	@DateConvertField
	private Date effDate;
	@DateConvertField
	private Date expDate;
	private Date createDate;
	private String cooperationType;
	private String auditFlowId;
	private String formatEffDate = DefaultVlueUtils.getNowDate(0);
	private String formatExpDate = DefaultVlueUtils.DEFAULT_VALUE_FOR_EXP;
	private String servicePublisher;
	private String sFileId;
	
	/**
	 * 租户ID
	 */
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	public String getsFileId() {
		return sFileId;
	}
	public void setsFileId(String sFileId) {
		this.sFileId = sFileId;
	}

	public BigDecimal getServiceId() {
		return serviceId;
	}
	public void setServiceId(BigDecimal serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceDesc() {
		return serviceDesc;
	}
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}
	public String getManageGrade() {
		return manageGrade;
	}
	public void setManageGrade(String manageGrade) {
		this.manageGrade = manageGrade;
	}
	public Integer getServiceProviderId() {
		return serviceProviderId;
	}
	public void setServiceProviderId(Integer serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}
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
	public Date getEffDate() {
		return effDate;
	}
	public void setEffDate(Date effDate) {
		this.effDate = effDate;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCooperationType() {
		return cooperationType;
	}
	public void setCooperationType(String cooperationType) {
		this.cooperationType = cooperationType;
	}
	public String getAuditFlowId() {
		return auditFlowId;
	}
	public void setAuditFlowId(String auditFlowId) {
		this.auditFlowId = auditFlowId;
	}
	public String getFormatEffDate() {
		return formatEffDate;
	}
	public void setFormatEffDate(String formatEffDate) {
		this.formatEffDate = formatEffDate;
	}
	public String getFormatExpDate() {
		return formatExpDate;
	}
	public void setFormatExpDate(String formatExpDate) {
		this.formatExpDate = formatExpDate;
	}
	public String getServicePublisher() {
		return servicePublisher;
	}
	public void setServicePublisher(String servicePublisher) {
		this.servicePublisher = servicePublisher;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getNowDate(Integer num) {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		if (num == -2) {
			return c.getTimeInMillis() + "";
		}
		StringBuffer sb = new StringBuffer();
		sb.append(c.get(Calendar.YEAR) + num).append("-")
				.append(c.get(Calendar.MONTH) + 1).append("-")
				.append(c.get(Calendar.DAY_OF_MONTH));
		if (num == -1) {
			sb.append(" " + c.get(Calendar.HOUR_OF_DAY)).append(":")
					.append(c.get(Calendar.MINUTE)).append(":")
					.append(c.get(Calendar.SECOND));
		}
		return sb.toString();
	}
}
