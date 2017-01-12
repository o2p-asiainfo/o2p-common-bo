package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.ailk.eaap.op2.bo.utc.DateConvertBeanImpl;
public class PricngPlanAttr implements Serializable,DateConvertBeanImpl{
private static final long serialVersionUID = 1L;
	private Integer pricingPlanAttrId;
	private BigDecimal pricingInfoId;
	private BigDecimal attrSpecId ;
	private String defaultValue ;
	private String defaultValueName ;
	private String statusCd;
	private Integer seqId;
	private String description;
	private Date createDate;
	private Date statusDate;
	private String chooseURL;
	private String pageInType;
	private String attrSpecName;
	private String attrSpecDesc;
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
	public Integer getPricingPlanAttrId() {
		return pricingPlanAttrId;
	}
	public void setPricingPlanAttrId(Integer pricingPlanAttrId) {
		this.pricingPlanAttrId = pricingPlanAttrId;
	}
	public BigDecimal getPricingInfoId() {
		return pricingInfoId;
	}
	public void setPricingInfoId(BigDecimal pricingInfoId) {
		this.pricingInfoId = pricingInfoId;
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
	public Integer getSeqId() {
		return seqId;
	}
	public void setSeqId(Integer seqId) {
		this.seqId = seqId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}
	public String getDefaultValueName() {
		return defaultValueName;
	}
	public void setDefaultValueName(String defaultValueName) {
		this.defaultValueName = defaultValueName;
	}
	public String getChooseURL() {
		return chooseURL;
	}
	public void setChooseURL(String chooseURL) {
		this.chooseURL = chooseURL;
	}
	public String getPageInType() {
		return pageInType;
	}
	public void setPageInType(String pageInType) {
		this.pageInType = pageInType;
	}
	public String getAttrSpecName() {
		return attrSpecName;
	}
	public void setAttrSpecName(String attrSpecName) {
		this.attrSpecName = attrSpecName;
	}
	public String getAttrSpecDesc() {
		return attrSpecDesc;
	}
	public void setAttrSpecDesc(String attrSpecDesc) {
		this.attrSpecDesc = attrSpecDesc;
	}
	public BigDecimal getAttrSpecId() {
		return attrSpecId;
	}
	public void setAttrSpecId(BigDecimal attrSpecId) {
		this.attrSpecId = attrSpecId;
	}
	
}
