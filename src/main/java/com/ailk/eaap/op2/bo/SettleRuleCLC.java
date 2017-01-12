/** 
 * Project Name:o2p-common-bo 
 * File Name:SettleRuleCLC.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2015年6月23日上午11:06:31 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.bo;  

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * ClassName:SettleRuleCLC  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年6月23日 上午11:06:31  
 * @author   m 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public class SettleRuleCLC implements Serializable{
	private static final long serialVersionUID = 1L;
	private BigDecimal clcyeId;
	private BigDecimal ruleId;
	private Integer cycleType;
	private Integer cycleCount;
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
	public BigDecimal getClcyeId() {
		return clcyeId;
	}
	public void setClcyeId(BigDecimal clcyeId) {
		this.clcyeId = clcyeId;
	}
	public BigDecimal getRuleId() {
		return ruleId;
	}
	public void setRuleId(BigDecimal ruleId) {
		this.ruleId = ruleId;
	}
	public Integer getCycleType() {
		return cycleType;
	}
	public void setCycleType(Integer cycleType) {
		this.cycleType = cycleType;
	}
	public Integer getCycleCount() {
		return cycleCount;
	}
	public void setCycleCount(Integer cycleCount) {
		this.cycleCount = cycleCount;
	}
 

}
