package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
/**结算对象规则表*/
public class SettleRule extends BaseClass implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private BigDecimal ruleId;
	private String partnerCode;
	private String busiCode;
	private String servCode;
	private String ruleName;
	private Integer ruleType;
	private Integer ruleType2Num;
	private Integer chargeDir;
	private Integer moneyUnit;
	private Integer priority = DefaultVlueUtils.DEFAULT_VALUE_FOR_PRIORITY;
	private String description;
	private Date effDate;
	private Date expDate;
	private String forEffDate = DefaultVlueUtils.getNowDate(0);
	private String forExpDate = DefaultVlueUtils.DEFAULT_VALUE_FOR_EXP;
	private Integer syncFlag;
	private Integer raiseFlag;
	/**
	 * 结算分类
	 */
	private String ruleKind;
	/**
	 * 话单来源
	 */
	private String billSource;
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
	
	public BigDecimal getRuleId() {
		return ruleId;
	}
	public void setRuleId(BigDecimal ruleId) {
		this.ruleId = ruleId;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public Integer getRuleType() {
		return ruleType;
	}
	public void setRuleType(Integer ruleType) {
		this.ruleType = ruleType;
	}
	public Integer getChargeDir() {
		return chargeDir;
	}
	public void setChargeDir(Integer chargeDir) {
		this.chargeDir = chargeDir;
	}
	public Integer getMoneyUnit() {
		return moneyUnit;
	}
	public void setMoneyUnit(Integer moneyUnit) {
		this.moneyUnit = moneyUnit;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
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
	public Integer getRuleType2Num() {
		return ruleType2Num;
	}
	public void setRuleType2Num(Integer ruleType2Num) {
		this.ruleType2Num = ruleType2Num;
	}
	public Integer getRaiseFlag() {
		return raiseFlag;
	}
	public void setRaiseFlag(Integer raiseFlag) {
		this.raiseFlag = raiseFlag;
	}
	public String getRuleKind() {
		return ruleKind;
	}
	public void setRuleKind(String ruleKind) {
		this.ruleKind = ruleKind;
	}
	public String getBillSource() {
		return billSource;
	}
	public void setBillSource(String billSource) {
		this.billSource = billSource;
	}
	
	
}
