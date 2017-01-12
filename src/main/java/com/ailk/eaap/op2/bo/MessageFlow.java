package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
public class MessageFlow implements Serializable{
private static final long serialVersionUID = 1L;
	private int messageFlowId;
	private String messageFlowName;
	private int firstEndpointId;
	private Date createTime;
	private String state;
	private Date lastestTime;
	private String descriptor;
	private Endpoint firstEndpoint;
	private List<Endpoint> endpointList;
	private ServiceRouteConfig[]  routeConfigList;
	private RouteEndpoint firstRouteEndpoint;
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
	
	public RouteEndpoint getFirstRouteEndpoint() {
		return firstRouteEndpoint;
	}
	public void setFirstRouteEndpoint(RouteEndpoint firstRouteEndpoint) {
		this.firstRouteEndpoint = firstRouteEndpoint;
	}
	public Endpoint getFirstEndpoint() {
		return firstEndpoint;
	}
	public void setFirstEndpoint(Endpoint firstEndpoint) {
		this.firstEndpoint = firstEndpoint;
	}
	public List<Endpoint> getEndpointList() {
		return endpointList;
	}
	public void setEndpointList(List<Endpoint> endpointList) {
		this.endpointList = endpointList;
	}
	public void setMessageFlowId(int messageFlowId){
		this.messageFlowId=messageFlowId;
	}
	public int getMessageFlowId(){
		return this.messageFlowId;
	}
	public void setMessageFlowName(String messageFlowName){
		this.messageFlowName=messageFlowName;
	}
	public String getMessageFlowName(){
		return this.messageFlowName;
	}
	public void setFirstEndpointId(int firstEndpointId){
		this.firstEndpointId=firstEndpointId;
	}
	public int getFirstEndpointId(){
		return this.firstEndpointId;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setLastestTime(Date lastestTime){
		this.lastestTime=lastestTime;
	}
	public Date getLastestTime(){
		return this.lastestTime;
	}
	public void setDescriptor(String descriptor){
		this.descriptor=descriptor;
	}
	public String getDescriptor(){
		return this.descriptor;
	}
	public ServiceRouteConfig[] getRouteConfigList() {
		return routeConfigList;
	}
	public void setRouteConfigList(ServiceRouteConfig[] routeConfigList) {
		this.routeConfigList = routeConfigList;
	}
}
