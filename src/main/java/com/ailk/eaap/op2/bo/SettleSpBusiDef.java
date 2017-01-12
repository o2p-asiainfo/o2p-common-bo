package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**结算对象信息表*/
public class SettleSpBusiDef extends BaseClass implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private BigDecimal busiId;
	private String partnerCode;
	private String busiCode;
	private String servCode;
	private String busiName;
	private Integer busiType;
	private Integer filterFlag;
	private Integer palType;
	private String accArea;
	private Integer servRange;
	private Integer commFreeValue;
	private String description;
	private Date effDate;
	private Date expDate;
	private String forEffDate = DefaultVlueUtils.getNowDate(0);
	private String forExpDate = DefaultVlueUtils.DEFAULT_VALUE_FOR_EXP;
	private Integer syncFlag;

	private Date createDate;
	private Date version;
	private Date statusDate;
	private String statusCd;
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
	
	
	public BigDecimal getBusiId() {
		return busiId;
	}
	public void setBusiId(BigDecimal busiId) {
		this.busiId = busiId;
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
	public String getServId() {
		return servCode;
	}
	public void setServId(String servCode) {
		this.servCode = servCode;
	}
	public String getBusiName() {
		return busiName;
	}
	public void setBusiName(String busiName) {
		this.busiName = busiName;
	}
	public Integer getBusiType() {
		return busiType;
	}
	public void setBusiType(Integer busiType) {
		this.busiType = busiType;
	}
	public Integer getFilterFlag() {
		return filterFlag;
	}
	public void setFilterFlag(Integer filterFlag) {
		this.filterFlag = filterFlag;
	}
	public Integer getPalType() {
		return palType;
	}
	public void setPalType(Integer palType) {
		this.palType = palType;
	}
	public String getAccArea() {
		return accArea;
	}
	public void setAccArea(String accArea) {
		this.accArea = accArea;
	}
	public Integer getServRange() {
		return servRange;
	}
	public void setServRange(Integer servRange) {
		this.servRange = servRange;
	}
	public Integer getCommFreeValue() {
		return commFreeValue;
	}
	public void setCommFreeValue(Integer commFreeValue) {
		this.commFreeValue = commFreeValue;
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
	public String getServCode() {
		return servCode;
	}
	public void setServCode(String servCode) {
		this.servCode = servCode;
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
	public String getForEffDate() {
		return forEffDate;
	}
	public void setForEffDate(String forEffDate) {
		this.forEffDate = forEffDate;
	}
	public String getForExpDate() {
		return forExpDate;
	}
	public void setForExpDate(String forExpDate) {
		this.forExpDate = forExpDate;
	}
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getVersion() {
		return version;
	}
	public void setVersion(Date version) {
		this.version = version;
	}
	public Date getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}
	public String getStatusCd() {
		return statusCd;
	}
	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}
	
}
