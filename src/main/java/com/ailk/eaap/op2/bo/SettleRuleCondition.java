package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**结算规则条件表*/
public class SettleRuleCondition extends BaseClass implements Serializable{
	private static final long serialVersionUID = 3210086336485325411L;
	
	private BigDecimal ruleConditionId;
	private BigDecimal ruleDetailId;
	private Integer upValue;
	private Integer downValue;
	private String baseValue = "0";
	private String ratioNumerator;
	private Integer ratioDemominator;
	private Integer orderIndex;
	private BigDecimal ruleId;
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
	
	public BigDecimal getRuleConditionId() {
		return ruleConditionId;
	}
	public void setRuleConditionId(BigDecimal ruleConditionId) {
		this.ruleConditionId = ruleConditionId;
	}
	public BigDecimal getRuleDetailId() {
		return ruleDetailId;
	}
	public void setRuleDetailId(BigDecimal ruleDetailId) {
		this.ruleDetailId = ruleDetailId;
	}
	public Integer getUpValue() {
		return upValue;
	}
	public void setUpValue(Integer upValue) {
		this.upValue = upValue;
	}
	public Integer getDownValue() {
		return downValue;
	}
	public void setDownValue(Integer downValue) {
		this.downValue = downValue;
	}
	public String getBaseValue() {
		return baseValue;
	}
	public void setBaseValue(String baseValue) {
		this.baseValue = baseValue;
	}
	public String getRatioNumerator() {
		return ratioNumerator;
	}
	public void setRatioNumerator(String ratioNumerator) {
		this.ratioNumerator = ratioNumerator;
	}
	public Integer getRatioDemominator() {
		return ratioDemominator;
	}
	public void setRatioDemominator(Integer ratioDemominator) {
		this.ratioDemominator = ratioDemominator;
	}
	public Integer getOrderIndex() {
		return orderIndex;
	}
	public void setOrderIndex(Integer orderIndex) {
		this.orderIndex = orderIndex;
	}
	public BigDecimal getRuleId() {
		return ruleId;
	}
	public void setRuleId(BigDecimal ruleId) {
		this.ruleId = ruleId;
	}
	
}
