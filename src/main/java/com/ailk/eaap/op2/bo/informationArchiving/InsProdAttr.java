package com.ailk.eaap.op2.bo.informationArchiving;

import java.util.Date;

public class InsProdAttr  {

    private Long priceAttrInstId;
    private Long relatInstId;
    private int priceInstType;
    private String priceDetailType;
    private Long priceId;
    private Long userId;
    private int attrType;
    private Long attrId;
    private String attrValue;
    private String attrText;
    private int state;
    private Date createDate;
    private Date doneDate;
    private Date effectiveDate;
    private Date expireDate;
    private String actType;
    private String tenantId;
	
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
    
	public Long getPriceAttrInstId() {
		return priceAttrInstId;
	}
	public void setPriceAttrInstId(Long priceAttrInstId) {
		this.priceAttrInstId = priceAttrInstId;
	}
	public Long getRelatInstId() {
		return relatInstId;
	}
	public void setRelatInstId(Long relatInstId) {
		this.relatInstId = relatInstId;
	}
	public  int getPriceInstType() {
		return priceInstType;
	}
	public void setPriceInstType(int priceInstType) {
		this.priceInstType = priceInstType;
	}
	public String getPriceDetailType() {
		return priceDetailType;
	}
	public void setPriceDetailType(String priceDetailType) {
		this.priceDetailType = priceDetailType;
	}
	public Long getPriceId() {
		return priceId;
	}
	public void setPriceId(Long priceId) {
		this.priceId = priceId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public int getAttrType() {
		return attrType;
	}
	public void setAttrType(int attrType) {
		this.attrType = attrType;
	}
	public Long getAttrId() {
		return attrId;
	}
	public void setAttrId(Long attrId) {
		this.attrId = attrId;
	}
	public String getAttrValue() {
		return attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}
	public String getAttrText() {
		return attrText;
	}
	public void setAttrText(String attrText) {
		this.attrText = attrText;
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
	public String getActType() {
		return actType;
	}
	public void setActType(String actType) {
		this.actType = actType;
	}
  
}