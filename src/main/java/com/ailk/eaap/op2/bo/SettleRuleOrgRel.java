/** 
 * Project Name:o2p-common-bo-trunk 
 * File Name:SettleRuleOrgRel.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2016年4月14日下午9:20:09 
 * Copyright (c) 2016, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.bo;  

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * ClassName:SettleRuleOrgRel  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2016年4月14日 下午9:20:09  
 * @author   wushuzhen 
 * @version   
 * @since    JDK 1.7 
 *        
 */
public class SettleRuleOrgRel  implements Serializable{
	private static final long serialVersionUID = 1L;
	private BigDecimal ruleId;
	private Integer orgId;
	private Date createDate;
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
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
}
