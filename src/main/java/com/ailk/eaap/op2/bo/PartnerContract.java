package com.ailk.eaap.op2.bo;

import java.util.Date;

import com.ailk.eaap.op2.bo.utc.DateConvertBeanImpl;
import com.ailk.eaap.op2.bo.utc.DateConvertField;

public class PartnerContract implements java.io.Serializable,DateConvertBeanImpl{
	private static final long serialVersionUID = 1L;
	private Integer contractId;
	private String contractNo;
	private String contractName;
	private Integer orgId;
	private String contractType; 
	@DateConvertField
	private Date signTime;
	@DateConvertField
	private Date effectDate;
	@DateConvertField
	private Date expireDate;
	@DateConvertField
	private Date updateDate;
	private String operator;
	private String operatorTel;
	private String description;
	private String statusCd;
	private Date statusDate;
	private String formatSignTime;
	private String formatEffectDate;
	private String formatExpireDate;
	private String formatUpdateDate;
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
	public String getFormatUpdateDate() {
		return formatUpdateDate;
	}
	public void setFormatUpdateDate(String formatUpdateDate) {
		this.formatUpdateDate = formatUpdateDate;
	}
	public String getFormatSignTime() {
		return formatSignTime;
	}
	public void setFormatSignTime(String formatSignTime) {
		this.formatSignTime = formatSignTime;
	}
	public String getFormatEffectDate() {
		return formatEffectDate;
	}
	public void setFormatEffectDate(String formatEffectDate) {
		this.formatEffectDate = formatEffectDate;
	}
	public String getFormatExpireDate() {
		return formatExpireDate;
	}
	public void setFormatExpireDate(String formatExpireDate) {
		this.formatExpireDate = formatExpireDate;
	}
	public Integer getContractId() {
		return contractId;
	}
	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}
	public String getContractNo() {
		return contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getContractName() {
		return contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public Date getSignTime() {
		return signTime;
	}
	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}
	
	public Date getEffectDate() {
		return effectDate;
	}
	public void setEffectDate(Date effectDate) {
		this.effectDate = effectDate;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getOperatorTel() {
		return operatorTel;
	}
	public void setOperatorTel(String operatorTel) {
		this.operatorTel = operatorTel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
}
