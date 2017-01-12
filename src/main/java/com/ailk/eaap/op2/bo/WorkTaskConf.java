/** 
 * Project Name:o2p-common-bo 
 * File Name:WorkTaskConf.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2015年8月26日下午2:57:52 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.bo;  

import java.math.BigDecimal;
import java.util.Date;

/** 
 * ClassName:WorkTaskConf  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年8月26日 下午2:57:52  
 * @author   m 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public class WorkTaskConf {
    private static final long serialVersionUID = 1L;
	
	private String id;
	private String modelId;
	private String businessId;
	private String tacheId;
	private String tacheName;
	private String fromTacheId;
	private String taskType;
	private String invokeApi;
	private Integer apiParamMode;
	private String description;
	private Date createTime;
	private String apiParamInId;
	private String apiParamOutId;
	private String messageFlowId;
	private String serInvokeInsId;
	private Integer isSchedule;
	private Integer expressId;
	private Integer scheduleCount;
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
	 
	public Integer getScheduleCount() {
		return scheduleCount;
	}
	public void setScheduleCount(Integer scheduleCount) {
		this.scheduleCount = scheduleCount;
	}
	public Integer getIsSchedule() {
		return isSchedule;
	}
	public void setIsSchedule(Integer isSchedule) {
		this.isSchedule = isSchedule;
	}
	public Integer getExpressId() {
		return expressId;
	}
	public void setExpressId(Integer expressId) {
		this.expressId = expressId;
	}
	public String getSerInvokeInsId() {
		return serInvokeInsId;
	}
	public void setSerInvokeInsId(String serInvokeInsId) {
		this.serInvokeInsId = serInvokeInsId;
	}
	public String getMessageFlowId() {
		return messageFlowId;
	}
	public void setMessageFlowId(String messageFlowId) {
		this.messageFlowId = messageFlowId;
	}
	public String getApiParamInId() {
		return apiParamInId;
	}
	public void setApiParamInId(String apiParamInId) {
		this.apiParamInId = apiParamInId;
	}
	public String getApiParamOutId() {
		return apiParamOutId;
	}
	public void setApiParamOutId(String apiParamOutId) {
		this.apiParamOutId = apiParamOutId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getModelId() {
		return modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getTacheId() {
		return tacheId;
	}
	public void setTacheId(String tacheId) {
		this.tacheId = tacheId;
	}
	public String getTacheName() {
		return tacheName;
	}
	public void setTacheName(String tacheName) {
		this.tacheName = tacheName;
	}
	public String getFromTacheId() {
		return fromTacheId;
	}
	public void setFromTacheId(String fromTacheId) {
		this.fromTacheId = fromTacheId;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public String getInvokeApi() {
		return invokeApi;
	}
	public void setInvokeApi(String invokeApi) {
		this.invokeApi = invokeApi;
	}
 
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getApiParamMode() {
		return apiParamMode;
	}
	public void setApiParamMode(Integer apiParamMode) {
		this.apiParamMode = apiParamMode;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
 
 

}
