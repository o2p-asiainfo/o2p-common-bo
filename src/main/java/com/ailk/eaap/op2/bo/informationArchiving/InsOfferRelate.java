package com.ailk.eaap.op2.bo.informationArchiving;

import java.util.Date;

public class InsOfferRelate  {
	private Long relatId;
    private Long userId;
    private Long offerInstId;
    private Long relatedOfferInstId;
    private Long relatRoleId;
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
	public Long getRelatId() {
		return relatId;
	}
	public void setRelatId(Long relatId) {
		this.relatId = relatId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getOfferInstId() {
		return offerInstId;
	}
	public void setOfferInstId(Long offerInstId) {
		this.offerInstId = offerInstId;
	}
	public Long getRelatedOfferInstId() {
		return relatedOfferInstId;
	}
	public void setRelatedOfferInstId(Long relatedOfferInstId) {
		this.relatedOfferInstId = relatedOfferInstId;
	}
	public Long getRelatRoleId() {
		return relatRoleId;
	}
	public void setRelatRoleId(Long relatRoleId) {
		this.relatRoleId = relatRoleId;
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