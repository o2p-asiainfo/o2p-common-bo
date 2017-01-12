package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**结算对象规则明细-一次性费用*/
public class SettleRuleOTC implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private BigDecimal ruleDetailId;
	private BigDecimal ruleId;
	private Integer billStatus;
	private Integer serviceStatus;
	private Date userTime;
	private String fUserTime;
	
	private Integer accumType;
	public Integer getAccumType() {
		return accumType;
	}
	public void setAccumType(Integer accumType) {
		this.accumType = accumType;
	}
	public String getAttrSpecId() {
		return attrSpecId;
	}
	public void setAttrSpecId(String attrSpecId) {
		this.attrSpecId = attrSpecId;
	}
	private String attrSpecId;
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
	public BigDecimal getRuleDetailId() {
		return ruleDetailId;
	}
	public void setRuleDetailId(BigDecimal ruleDetailId) {
		this.ruleDetailId = ruleDetailId;
	}
	public BigDecimal getRuleId() {
		return ruleId;
	}
	public void setRuleId(BigDecimal ruleId) {
		this.ruleId = ruleId;
	}
	public Integer getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(Integer billStatus) {
		this.billStatus = billStatus;
	}
	public Integer getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(Integer serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	public Date getUserTime() {
		return userTime;
	}
	public void setUserTime(Date userTime) {
		this.userTime = userTime;
	}
	public String getfUserTime() {
		return fUserTime;
	}
	public void setfUserTime(String fUserTime) {
		this.fUserTime = fUserTime;
	}
	
	
	
}
