package com.ailk.eaap.op2.bo;

import java.util.Date;

public class FreeResource{
	private Long priceId;
	private Long freeresItem;		 			//免费资源科目
	private String freeresItemName;
	private Integer titleRoleId;
	private String cycleRefMode;			//赠送周期
	private String invalidProdUseFlag;	//无效标识
	private Integer forwardCycle;					//计费免费资源周期
	private Integer cycleUnit;
	private Integer cycleType;
	private Integer refMemberNum;
	private Long cycleNumFormula;
	private Integer doneCode;
	private Date createDate;
	private Integer opId;
	private Date doneDate;
	private Integer orgId;
	private String userState;
	private String allowanceType;
	private String amountType;
	private Integer tenantId;
	
	public Long getPriceId() {
		return priceId;
	}
	public void setPriceId(Long priceId) {
		this.priceId = priceId;
	}
	
	public Long getFreeresItem() {
		return freeresItem;
	}
	public void setFreeresItem(Long freeresItem) {
		this.freeresItem = freeresItem;
	}
	public String getFreeresItemName() {
		return freeresItemName;
	}
	public void setFreeresItemName(String freeresItemName) {
		this.freeresItemName = freeresItemName;
	}
	public String getCycleRefMode() {
		return cycleRefMode;
	}
	public void setCycleRefMode(String cycleRefMode) {
		this.cycleRefMode = cycleRefMode;
	}
	public String getInvalidProdUseFlag() {
		return invalidProdUseFlag;
	}
	public void setInvalidProdUseFlag(String invalidProdUseFlag) {
		this.invalidProdUseFlag = invalidProdUseFlag;
	}
	public Integer getForwardCycle() {
		return forwardCycle;
	}
	public void setForwardCycle(Integer forwardCycle) {
		this.forwardCycle = forwardCycle;
	}
	
	
	public Integer getTitleRoleId() {
		return titleRoleId;
	}
	public void setTitleRoleId(Integer titleRoleId) {
		this.titleRoleId = titleRoleId;
	}
	public Integer getCycleUnit() {
		return cycleUnit;
	}
	public void setCycleUnit(Integer cycleUnit) {
		this.cycleUnit = cycleUnit;
	}
	public Integer getCycleType() {
		return cycleType;
	}
	public void setCycleType(Integer cycleType) {
		this.cycleType = cycleType;
	}
	public Integer getRefMemberNum() {
		return refMemberNum;
	}
	public void setRefMemberNum(Integer refMemberNum) {
		this.refMemberNum = refMemberNum;
	}
	public Long getCycleNumFormula() {
		return cycleNumFormula;
	}
	public void setCycleNumFormula(Long cycleNumFormula) {
		this.cycleNumFormula = cycleNumFormula;
	}
	
	public Integer getDoneCode() {
		return doneCode;
	}
	public void setDoneCode(Integer doneCode) {
		this.doneCode = doneCode;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getOpId() {
		return opId;
	}
	public void setOpId(Integer opId) {
		this.opId = opId;
	}
	public Date getDoneDate() {
		return doneDate;
	}
	public void setDoneDate(Date doneDate) {
		this.doneDate = doneDate;
	}
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public String getAllowanceType() {
		return allowanceType;
	}
	public void setAllowanceType(String allowanceType) {
		this.allowanceType = allowanceType;
	}
	public String getAmountType() {
		return amountType;
	}
	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
}
