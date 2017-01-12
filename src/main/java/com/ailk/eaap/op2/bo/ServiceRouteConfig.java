package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ServiceRouteConfig implements Serializable{
private static final long serialVersionUID = 1L;

	public final static int ROOT_LEVEL = 1;
	public final static String EXECUTOR_FLAG = "TO_ENDPOINT_EXECUTOR";
	public final static String EXECUTOR_CSB = "CSB";
	public final static String EXECUTOR_ESB = "ESB";
	public final static String EXECUTOR_FROM_ENDPOINT = "FROM_ENDPOINT";

	private int routeId;
	private int routePolicyId;
	private int fromEndpointId;
	private int toEndpointId;
	private int messageFlowId;
	private String synAsyn;
	private String state;
	private Date createDate;
	private Date lastestDate;
	private Integer Level;
	private Endpoint fromEndpoint;
	private Endpoint toEndpoint;
	private RoutePolicy routePolicy;
	private String toEndpointExecutor;
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
	
	public String getToEndpointExecutor() {
		return toEndpointExecutor;
	}
	public void setToEndpointExecutor(String toEndpointExecutor) {
		this.toEndpointExecutor = toEndpointExecutor;
	}
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public void setRouteId(int routeId){
		this.routeId=routeId;
	}
	public int getRouteId(){
		return this.routeId;
	}
	public RoutePolicy getRoutePolicy() {
		return routePolicy;
	}
	public void setRoutePolicy(RoutePolicy routePolicy) {
		this.routePolicy = routePolicy;
	}
	public void setRoutePolicyId(int routePolicyId){
		this.routePolicyId=routePolicyId;
	}
	public int getRoutePolicyId(){
		return this.routePolicyId;
	}
	public void setFromEndpointId(int fromEndpointId){
		this.fromEndpointId=fromEndpointId;
	}
	public int getFromEndpointId(){
		return this.fromEndpointId;
	}
	public void setToEndpointId(int toEndpointId){
		this.toEndpointId=toEndpointId;
	}
	public int getToEndpointId(){
		return this.toEndpointId;
	}
	public void setMessageFlowId(int messageFlowId){
		this.messageFlowId=messageFlowId;
	}
	public int getMessageFlowId(){
		return this.messageFlowId;
	}
	public void setSynAsyn(String synAsyn){
		this.synAsyn=synAsyn;
	}
	public String getSynAsyn(){
		return this.synAsyn;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setCreateDate(Date createDate){
		this.createDate=createDate;
	}
	public Date getCreateDate(){
		return this.createDate;
	}
	public void setLastestDate(Date lastestDate){
		this.lastestDate=lastestDate;
	}
	public Date getLastestDate(){
		return this.lastestDate;
	}

	public Integer getLevel() {
		return Level;
	}
	public void setLevel(Integer level) {
		Level = level;
	}
	public Endpoint getFromEndpoint() {
		return fromEndpoint;
	}
	public void setFromEndpoint(Endpoint fromEndpoint) {
		this.fromEndpoint = fromEndpoint;
	}
	public Endpoint getToEndpoint() {
		return toEndpoint;
	}
	public void setToEndpoint(Endpoint toEndpoint) {
		this.toEndpoint = toEndpoint;
	}

}
