package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**结算对象规则表*/
public class SettleRuleRC implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private BigDecimal ruleDetailId;
	private BigDecimal ruleId;
	private Integer accumType;
	private Integer accumDateType;
	private Integer accumDateOffset;
	private Integer reduceRes = DefaultVlueUtils.DEFAULT_VALUE_FOR_REDUCERES;
	private Date startUserTime;
	private String fStartUserTime;
	private String attrSpecId;
	
	public String getAttrSpecId() {
		return attrSpecId;
	}
	public void setAttrSpecId(String attrSpecId) {
		this.attrSpecId = attrSpecId;
	}
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
	public Integer getAccumType() {
		return accumType;
	}
	public void setAccumType(Integer accumType) {
		this.accumType = accumType;
	}
	public Integer getAccumDateType() {
		return accumDateType;
	}
	public void setAccumDateType(Integer accumDateType) {
		this.accumDateType = accumDateType;
	}
	public Integer getAccumDateOffset() {
		return accumDateOffset;
	}
	public void setAccumDateOffset(Integer accumDateOffset) {
		this.accumDateOffset = accumDateOffset;
	}
	public Integer getReduceRes() {
		return reduceRes;
	}
	public void setReduceRes(Integer reduceRes) {
		this.reduceRes = reduceRes;
	}
	public Date getStartUserTime() {
		return startUserTime;
	}
	public void setStartUserTime(Date startUserTime) {
		this.startUserTime = startUserTime;
	}
	public String getfStartUserTime() {
		return fStartUserTime;
	}
	public void setfStartUserTime(String fStartUserTime) {
		this.fStartUserTime = fStartUserTime;
	}
	
	
}
