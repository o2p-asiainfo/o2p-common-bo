package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
public class SerInvokeIns implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer serInvokeInsId;
	private Integer messageFlowId;
	private String componentId;
	private Integer serviceId;
	private String serInvokeInsName;
	private Date createDate;
	private String state;
	private Date lastestDate;
	private String serInvokeInsDesc;
	private Service service;
	private MessageFlow messageFlow;
	private List<Auth> auths;
	private String componentCode;
	private String taskStyle;
	private String logLevel;
	private String authExpress;
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
	
	public MessageFlow getMessageFlow() {
		return messageFlow;
	}
	public void setMessageFlow(MessageFlow messageFlow) {
		this.messageFlow = messageFlow;
	}
	public void setSerInvokeInsId(Integer serInvokeInsId){
		this.serInvokeInsId=serInvokeInsId;
	}
	public Integer getSerInvokeInsId(){
		return this.serInvokeInsId;
	}
	public List<Auth> getAuths() {
		return auths;
	}
	public void setAuths(List<Auth> auths) {
		this.auths = auths;
	}
	public void setMessageFlowId(Integer messageFlowId){
		this.messageFlowId=messageFlowId;
	}
	public Integer getMessageFlowId(){
		return this.messageFlowId;
	}
	public void setComponentId(String componentId){
		this.componentId=componentId;
	}
	public String getComponentCode() {
		return componentCode;
	}
	public void setComponentCode(String componentCode) {
		this.componentCode = componentCode;
	}
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public String getComponentId(){
		return this.componentId;
	}
	public void setServiceId(Integer serviceId){
		this.serviceId=serviceId;
	}
	public Integer getServiceId(){
		return this.serviceId;
	}
	public void setSerInvokeInsName(String serInvokeInsName){
		this.serInvokeInsName=serInvokeInsName;
	}
	public String getSerInvokeInsName(){
		return this.serInvokeInsName;
	}
	public void setCreateDate(Date createDate){
		this.createDate=createDate;
	}
	public Date getCreateDate(){
		return this.createDate;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setLastestDate(Date lastestDate){
		this.lastestDate=lastestDate;
	}
	public Date getLastestDate(){
		return this.lastestDate;
	}
	public void setSerInvokeInsDesc(String serInvokeInsDesc){
		this.serInvokeInsDesc=serInvokeInsDesc;
	}
	public String getSerInvokeInsDesc(){
		return this.serInvokeInsDesc;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public String getTaskStyle() {
		return taskStyle;
	}
	public void setTaskStyle(String taskStyle) {
		this.taskStyle = taskStyle;
	}
	public String getLogLevel() {
		return logLevel;
	}
	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}
	public String getAuthExpress() {
		return authExpress;
	}
	public void setAuthExpress(String authExpress) {
		this.authExpress = authExpress;
	}
	
}
