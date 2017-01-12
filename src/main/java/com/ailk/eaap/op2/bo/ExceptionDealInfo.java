package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.sql.Timestamp;


public class ExceptionDealInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7562247137417613696L;
	
	//初始异常需要人工处理未执行
	public static final String TRY_STATUS_W = "W";
	//准备调度
	public static final String TRY_STATUS_R = "R";
	//调度中
	public static final String TRY_STATUS_D = "D";
	//调度完成（成功）
	public static final String TRY_STATUS_C = "C";
	//调度完成（失败）
	public static final String TRY_STATUS_E = "E";
	//异常调度作废
	public static final String TRY_STATUS_X = "X";
	//系统异常自动调度中(未超过系统重试最大次数时的状态，不需要回写数据库更新执行结果,不会出现在数据库中)
	public static final String TRY_STATUS_T = "T";
	
	private Integer exceptionId;
	private Integer serInvokeInsId;
	private Integer serviceId;
	private String componentId;
	private Integer messageFlowId;
	private Integer endPointId;
	private byte[] messageBoByte;
	private Integer tryNum;
	private Timestamp updateDate;
	private Timestamp createDate;
	private String exceptionCode;
	private String tryStatus;
	private String exceptionStack;
	
	private String serInvokeInsName;
	private String serviceName;
	private String componentName;
	private String messageFlowName;
	private String endPointName;
	
	private String tranId;
	private String exceptionQueueName;



	private Integer tenantId;
	

	//重试结果时间记录
	private Timestamp reTryResultDate;
	
	public Integer getExceptionId() {
		return exceptionId;
	}
	public void setExceptionId(Integer exceptionId) {
		this.exceptionId = exceptionId;
	}
	public Integer getSerInvokeInsId() {
		return serInvokeInsId;
	}
	public void setSerInvokeInsId(Integer serInvokeInsId) {
		this.serInvokeInsId = serInvokeInsId;
	}
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public String getComponentId() {
		return componentId;
	}
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}
	public Integer getMessageFlowId() {
		return messageFlowId;
	}
	public void setMessageFlowId(Integer messageFlowId) {
		this.messageFlowId = messageFlowId;
	}
	public byte[] getMessageBoByte() {
		return messageBoByte;
	}
	public void setMessageBoByte(byte[] messageBoByte) {
		this.messageBoByte = messageBoByte;
	}
	public Integer getTryNum() {
		return tryNum;
	}
	public void setTryNum(Integer tryNum) {
		this.tryNum = tryNum;
	}
	public Timestamp getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public String getExceptionCode() {
		return exceptionCode;
	}
	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
	public String getTryStatus() {
		return tryStatus;
	}
	public void setTryStatus(String tryStatus) {
		this.tryStatus = tryStatus;
	}
	public String getExceptionStack() {
		return exceptionStack;
	}
	public void setExceptionStack(String exceptionStack) {
		this.exceptionStack = exceptionStack;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integer getEndPointId() {
		return endPointId;
	}
	public void setEndPointId(Integer endPointId) {
		this.endPointId = endPointId;
	}
	public String getSerInvokeInsName() {
		return serInvokeInsName;
	}
	public void setSerInvokeInsName(String serInvokeInsName) {
		this.serInvokeInsName = serInvokeInsName;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getComponentName() {
		return componentName;
	}
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	public String getMessageFlowName() {
		return messageFlowName;
	}
	public void setMessageFlowName(String messageFlowName) {
		this.messageFlowName = messageFlowName;
	}
	public String getEndPointName() {
		return endPointName;
	}
	public void setEndPointName(String endPointName) {
		this.endPointName = endPointName;
	}
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getExceptionQueueName() {
		return exceptionQueueName;
	}
	public void setExceptionQueueName(String exceptionQueueName) {
		this.exceptionQueueName = exceptionQueueName;
	}
	public Timestamp getReTryResultDate() {
		return reTryResultDate;
	}
	public void setReTryResultDate(Timestamp reTryResultDate) {
		this.reTryResultDate = reTryResultDate;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
}
