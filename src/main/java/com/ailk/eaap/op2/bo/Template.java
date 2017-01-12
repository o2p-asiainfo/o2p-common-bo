/** 
 * Project Name:o2p-common-bo 
 * File Name:Template.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2015年8月31日上午11:10:17 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.bo;  

import java.io.Serializable;

/** 
 * ClassName:Template  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年8月31日 上午11:10:17  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public class Template  implements Serializable{

	/** 
	 * serialVersionUID:TODO. 
	 * @since JDK 1.6 
	 */  
	private static final long serialVersionUID = 1L;
	
	private Integer templateId;
	private Integer tcpCtrFId;
	private String templateBody;
	private String templateHeader;
	private String templateType;
	private String isGlobal;
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
	
	public Integer getTemplateId() {
		return templateId;
	}
	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}
	public Integer getTcpCtrFId() {
		return tcpCtrFId;
	}
	public void setTcpCtrFId(Integer tcpCtrFId) {
		this.tcpCtrFId = tcpCtrFId;
	}
	public String getTemplateBody() {
		return templateBody;
	}
	public void setTemplateBody(String templateBody) {
		this.templateBody = templateBody;
	}
	public String getTemplateHeader() {
		return templateHeader;
	}
	public void setTemplateHeader(String templateHeader) {
		this.templateHeader = templateHeader;
	}
	public String getTemplateType() {
		return templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}
	public String getIsGlobal() {
		return isGlobal;
	}
	public void setIsGlobal(String isGlobal) {
		this.isGlobal = isGlobal;
	}
	

}
