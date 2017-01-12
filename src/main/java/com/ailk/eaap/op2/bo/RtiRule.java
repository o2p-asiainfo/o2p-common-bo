/** 
 * Project Name:o2p-common-bo-trunk 
 * File Name:RtiRule.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2016年8月4日下午3:58:19 
 * Copyright (c) 2016, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.bo;  

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * ClassName:RtiRule  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2016年8月4日 下午3:58:19  
 * @author   wushuzhen 
 * @version   
 * @since    JDK 1.7 
 *        
 */
public class RtiRule  extends BaseClass implements Serializable{
		private static final long serialVersionUID = 1L;
		
		private BigDecimal rtiRuleId;
		private String eventId;
		private BigDecimal ruleId;
		private Integer partnerId;
		private String rtiRuleName;
		private String rtiRuleContent;
		private Integer operatorId;
		private String  channel;
		private String  checkStatus;
		private String workStatus;
		private Integer serInvokeInsId;
		private String state;
		private Date createDate;
		private Date doneDate;
		private Date effectiveDate;
		private Date expireDate;
		private String partnerName;
		private String operatorName;
		private String auditFlowId;
		private Integer tenantId;
		private BigDecimal prodOfferId;
		public BigDecimal getRtiRuleId() {
			return rtiRuleId;
		}
		public void setRtiRuleId(BigDecimal rtiRuleId) {
			this.rtiRuleId = rtiRuleId;
		}
		public String getEventId() {
			return eventId;
		}
		public void setEventId(String eventId) {
			this.eventId = eventId;
		}
		public BigDecimal getRuleId() {
			return ruleId;
		}
		public void setRuleId(BigDecimal ruleId) {
			this.ruleId = ruleId;
		}
		public Integer getPartnerId() {
			return partnerId;
		}
		public void setPartnerId(Integer partnerId) {
			this.partnerId = partnerId;
		}
		public String getRtiRuleName() {
			return rtiRuleName;
		}
		public void setRtiRuleName(String rtiRuleName) {
			this.rtiRuleName = rtiRuleName;
		}
		public String getRtiRuleContent() {
			return rtiRuleContent;
		}
		public void setRtiRuleContent(String rtiRuleContent) {
			this.rtiRuleContent = rtiRuleContent;
		}
		public Integer getOperatorId() {
			return operatorId;
		}
		public void setOperatorId(Integer operatorId) {
			this.operatorId = operatorId;
		}
		public String getChannel() {
			return channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public String getCheckStatus() {
			return checkStatus;
		}
		public void setCheckStatus(String checkStatus) {
			this.checkStatus = checkStatus;
		}
		public String getWorkStatus() {
			return workStatus;
		}
		public void setWorkStatus(String workStatus) {
			this.workStatus = workStatus;
		}
		public Integer getSerInvokeInsId() {
			return serInvokeInsId;
		}
		public void setSerInvokeInsId(Integer serInvokeInsId) {
			this.serInvokeInsId = serInvokeInsId;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public Date getCreateDate() {
			return createDate;
		}
		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}
		public Date getDoneDate() {
			return doneDate;
		}
		public void setDoneDate(Date doneDate) {
			this.doneDate = doneDate;
		}
		public Date getEffectiveDate() {
			return effectiveDate;
		}
		public void setEffectiveDate(Date effectiveDate) {
			this.effectiveDate = effectiveDate;
		}
		public Date getExpireDate() {
			return expireDate;
		}
		public void setExpireDate(Date expireDate) {
			this.expireDate = expireDate;
		}
		
		public String getPartnerName() {
			return partnerName;
		}
		public void setPartnerName(String partnerName) {
			this.partnerName = partnerName;
		}
		public String getOperatorName() {
			return operatorName;
		}
		public void setOperatorName(String operatorName) {
			this.operatorName = operatorName;
		}
		
		public String getAuditFlowId() {
			return auditFlowId;
		}
		public void setAuditFlowId(String auditFlowId) {
			this.auditFlowId = auditFlowId;
		}
		public Integer getTenantId() {
			return tenantId;
		}
		public void setTenantId(Integer tenantId) {
			this.tenantId = tenantId;
		}
		public BigDecimal getProdOfferId() {
			return prodOfferId;
		}
		public void setProdOfferId(BigDecimal prodOfferId) {
			this.prodOfferId = prodOfferId;
		}
		
		
}
