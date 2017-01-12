package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ServiceSpecAttr implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer serviceSpecAttrRelId;
	private BigDecimal serviceId;
	private BigDecimal attrSpecId;
	private String defaultValue;
	private String statusCd;
	private Date statusDate;
	private Date createDate;
	private String mappingId;
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
	
	public String getMappingId() {
		return mappingId;
	}
	public void setMappingId(String mappingId) {
		this.mappingId = mappingId;
	}
	public Integer getServiceSpecAttrRelId() {
		return serviceSpecAttrRelId;
	}
	public void setServiceSpecAttrRelId(Integer serviceSpecAttrRelId) {
		this.serviceSpecAttrRelId = serviceSpecAttrRelId;
	}
	public BigDecimal getServiceId() {
		return serviceId;
	}
	public void setServiceId(BigDecimal serviceId) {
		this.serviceId = serviceId;
	}
	public BigDecimal getAttrSpecId() {
		return attrSpecId;
	}
	public void setAttrSpecId(BigDecimal attrSpecId) {
		this.attrSpecId = attrSpecId;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
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
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
