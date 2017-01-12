package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class TechImplNode implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer techImplNodeId;
	private Integer techImplId;
	private String nodeHost;
	private String nodeIp;
	private String nodePort;
	private Date nodeRgeTime;
	private String nodeState;
	private Date nodeLasetestTime;
	private String routeExpr;
	
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
	public String getRouteExpr() {
		return routeExpr;
	}
	public void setRouteExpr(String routeExpr) {
		this.routeExpr = routeExpr;
	}
	public void setTechImplNodeId(Integer techImplNodeId){
		this.techImplNodeId=techImplNodeId;
	}
	public Integer getTechImplNodeId(){
		return this.techImplNodeId;
	}
	public void setTechImplId(Integer techImplId){
		this.techImplId=techImplId;
	}
	public Integer getTechImplId(){
		return this.techImplId;
	}
	public void setNodeHost(String nodeHost){
		this.nodeHost=nodeHost;
	}
	public String getNodeHost(){
		return this.nodeHost;
	}
	public void setNodeIp(String nodeIp){
		this.nodeIp=nodeIp;
	}
	public String getNodeIp(){
		return this.nodeIp;
	}
	public void setNodePort(String nodePort){
		this.nodePort=nodePort;
	}
	public String getNodePort(){
		return this.nodePort;
	}
	public void setNodeRgeTime(Date nodeRgeTime){
		this.nodeRgeTime=nodeRgeTime;
	}
	public Date getNodeRgeTime(){
		return this.nodeRgeTime;
	}
	public void setNodeState(String nodeState){
		this.nodeState=nodeState;
	}
	public String getNodeState(){
		return this.nodeState;
	}
	public void setNodeLasetestTime(Date nodeLasetestTime){
		this.nodeLasetestTime=nodeLasetestTime;
	}
	public Date getNodeLasetestTime(){
		return this.nodeLasetestTime;
	}
}
