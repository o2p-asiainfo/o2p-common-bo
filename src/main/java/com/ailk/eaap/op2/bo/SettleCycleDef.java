package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
public class SettleCycleDef extends BaseClass implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private BigDecimal cycleDefId;
	private String partnerCode;
	private String busiCode;
	private Integer cycleType;
	private Integer cycleCount;
	private Integer acctType;
	private Integer runHour;
	private String billEndDate;
	private String cycleSeqment;
	private Integer priority = DefaultVlueUtils.DEFAULT_VALUE_FOR_PRIORITY;
	private String description;
	private Date effDate;
	private Date expDate;
	private String fEffDate;
	private String fExpDate;
	private Integer syncFlag;
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
	
	public BigDecimal getCycleDefId() {
		return cycleDefId;
	}
	public void setCycleDefId(BigDecimal cycleDefId) {
		this.cycleDefId = cycleDefId;
	}
	public String getPartnerCode() {
		return partnerCode;
	}
	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}
	public String getBusiCode() {
		return busiCode;
	}
	public void setBusiCode(String busiCode) {
		this.busiCode = busiCode;
	}
	public Integer getCycleType() {
		return cycleType;
	}
	public void setCycleType(Integer cycleType) {
		this.cycleType = cycleType;
	}
	public Integer getCycleCount() {
		return cycleCount;
	}
	public void setCycleCount(Integer cycleCount) {
		this.cycleCount = cycleCount;
	}
	public Integer getAcctType() {
		return acctType;
	}
	public void setAcctType(Integer acctType) {
		this.acctType = acctType;
	}
	public Integer getRunHour() {
		return runHour;
	}
	public void setRunHour(Integer runHour) {
		this.runHour = runHour;
	}
	public String getBillEndDate() {
		return billEndDate;
	}
	public void setBillEndDate(String billEndDate) {
		this.billEndDate = billEndDate;
	}
	public String getCycleSeqment() {
		return cycleSeqment;
	}
	public void setCycleSeqment(String cycleSeqment) {
		this.cycleSeqment = cycleSeqment;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getSyncFlag() {
		return syncFlag;
	}
	public void setSyncFlag(Integer syncFlag) {
		this.syncFlag = syncFlag;
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
	public String getFEffDate() {
		return fEffDate;
	}
	public void setFEffDate(String fEffDate) {
		this.fEffDate = fEffDate;
	}
	public String getFExpDate() {
		return fExpDate;
	}
	public void setFExpDate(String fExpDate) {
		this.fExpDate = fExpDate;
	}
	
}
