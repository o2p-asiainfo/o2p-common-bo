package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**结算对象规则明细-总量批价*/
public class SettleRuleAggregation implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private BigDecimal ruleDetailId;
	private BigDecimal ruleId;
	private Integer aggregationItem;
	private String ruleDetailInfo;
	private String subject;
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
	public BigDecimal getRuleDetailId() {
		return ruleDetailId;
	}
	public void setRuleDetailId(BigDecimal ruleDetailId) {
		this.ruleDetailId = ruleDetailId;
	}
	public BigDecimal getRuleId() {
		return ruleId;
	}
	public void setRuleId(BigDecimal ruleId) {
		this.ruleId = ruleId;
	}
	public Integer getAggregationItem() {
		return aggregationItem;
	}
	public void setAggregationItem(Integer aggregationItem) {
		this.aggregationItem = aggregationItem;
	}
	public String getRuleDetailInfo() {
		return ruleDetailInfo;
	}
	public void setRuleDetailInfo(String ruleDetailInfo) {
		this.ruleDetailInfo = ruleDetailInfo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
