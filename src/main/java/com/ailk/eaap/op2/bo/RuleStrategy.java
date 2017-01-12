package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class RuleStrategy implements Serializable{
private static final long serialVersionUID = 1L;
	private int ruleStrategyId;
	private String ruleStrategyCode;
	private String ruleStrategyName;
	private String ruleStrategyDesc;
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
	public void setRuleStrategyId(int ruleStrategyId){
		this.ruleStrategyId=ruleStrategyId;
	}
	public int getRuleStrategyId(){
		return this.ruleStrategyId;
	}
	public void setRuleStrategyCode(String ruleStrategyCode){
		this.ruleStrategyCode=ruleStrategyCode;
	}
	public String getRuleStrategyCode(){
		return this.ruleStrategyCode;
	}
	public void setRuleStrategyName(String ruleStrategyName){
		this.ruleStrategyName=ruleStrategyName;
	}
	public String getRuleStrategyName(){
		return this.ruleStrategyName;
	}
	public void setRuleStrategyDesc(String ruleStrategyDesc){
		this.ruleStrategyDesc=ruleStrategyDesc;
	}
	public String getRuleStrategyDesc(){
		return this.ruleStrategyDesc;
	}
}
