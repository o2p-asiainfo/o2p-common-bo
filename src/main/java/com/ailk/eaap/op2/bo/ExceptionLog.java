/** 
 * Project Name:o2p-workflow-pro 
 * File Name:ProductOrOfferException.java 
 * Package Name:com.ailk.o2p.workflow.bean 
 * Date:2016年1月25日上午10:07:23 
 * Copyright (c) 2016, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.bo;  

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * ClassName:ProductOrOfferException  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2016年1月25日 上午10:07:23  
 * @author   wushuzhen 
 * @version   
 * @since    JDK 1.7 
 *        
 */
public class ExceptionLog implements Serializable{
	private static final long serialVersionUID = 1L;
    private Integer exceptionLogId;
    /**
     * 异常类型，如产品、销售品、服务、结算
     */
    private String exceptionType;
    /**
     * 异常对象名字
     */
    private String businessObjName;
    /**
     * 异常对象id,如产品id、销售品id、服务id、结算id
     */
    private BigDecimal objectId;
    private String destination;
    private String result;
    private String exceptionDetails;
    /**
     * 当前活动任务id
     */
    private String activitiId;
	private Date createDate;
	private Integer tenantId;
	/**
	 * 版本
	 */
	private String version;

	
	public Integer getExceptionLogId() {
		return exceptionLogId;
	}
	public void setExceptionLogId(Integer exceptionLogId) {
		this.exceptionLogId = exceptionLogId;
	}
	public String getExceptionType() {
		return exceptionType;
	}
	public void setExceptionType(String exceptionType) {
		this.exceptionType = exceptionType;
	}
	public String getBusinessObjName() {
		return businessObjName;
	}
	public void setBusinessObjName(String businessObjName) {
		this.businessObjName = businessObjName;
	}
	public BigDecimal getObjectId() {
		return objectId;
	}
	public void setObjectId(BigDecimal objectId) {
		this.objectId = objectId;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getExceptionDetails() {
		return exceptionDetails;
	}
	public void setExceptionDetails(String exceptionDetails) {
		this.exceptionDetails = exceptionDetails;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
    public String getActivitiId() {
		return activitiId;
	}
	public void setActivitiId(String activitiId) {
		this.activitiId = activitiId;
	}
	
}
