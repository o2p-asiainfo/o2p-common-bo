package com.ailk.eaap.op2.bo.informationArchiving;

import java.util.Date;

public class InsOffInsUser {
  
    private Long offerUserRelatId;
    private Long offerInstId;
    private Long userId;
    private Long offerId;
    private int state;
    private Date effectiveDate;
    private Date expireDate;
    private Date createDate;
    private Date doneDate;
    private String tenantId;
	
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public Long getOfferUserRelatId() {
		return offerUserRelatId;
	}
	public void setOfferUserRelatId(Long offerUserRelatId) {
		this.offerUserRelatId = offerUserRelatId;
	}
	public Long getOfferInstId() {
		return offerInstId;
	}
	public void setOfferInstId(Long offerInstId) {
		this.offerInstId = offerInstId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getOfferId() {
		return offerId;
	}
	public void setOfferId(Long offerId) {
		this.offerId = offerId;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
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
    
}