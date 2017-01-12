package com.ailk.eaap.op2.bo.informationArchiving;

import java.util.Date;

public class InsUserExt {
    private Long insUserExtId;
    private Long userId;
    private Integer attrCode;
    private String attrValue;
    private int state;
    private Date createDate;
    private Date doneDate;
    private Date effectiveDate;
    private Date expireDate;
    private String tenantId;
	
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public Long getInsUserExtId() {
		return insUserExtId;
	}
	public void setInsUserExtId(Long insUserExtId) {
		this.insUserExtId = insUserExtId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Integer getAttrCode() {
		return attrCode;
	}
	public void setAttrCode(Integer attrCode) {
		this.attrCode = attrCode;
	}
	public String getAttrValue() {
		return attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getDoneDate() {
		return doneDate;
	}
	public void setDoneDate(Date doneDate) {
		this.doneDate = doneDate;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
    
}