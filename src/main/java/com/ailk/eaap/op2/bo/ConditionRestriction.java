package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class ConditionRestriction implements Serializable{
private static final long serialVersionUID = 1L;
	private Long restrictionId;
	private String relationNodePath;
	private String relationNodeTime;
	private String nodeFrom;
	private String effect;
	private String doornot;
	private String state;
	private String remarks;
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
	public void setRestrictionId(Long restrictionId){
		this.restrictionId=restrictionId;
	}
	public Long getRestrictionId(){
		return this.restrictionId;
	}
	public void setRelationNodePath(String relationNodePath){
		this.relationNodePath=relationNodePath;
	}
	public String getRelationNodePath(){
		return this.relationNodePath;
	}
	public void setRelationNodeTime(String relationNodeTime){
		this.relationNodeTime=relationNodeTime;
	}
	public String getRelationNodeTime(){
		return this.relationNodeTime;
	}
	public void setNodeFrom(String nodeFrom){
		this.nodeFrom=nodeFrom;
	}
	public String getNodeFrom(){
		return this.nodeFrom;
	}
	public void setEffect(String effect){
		this.effect=effect;
	}
	public String getEffect(){
		return this.effect;
	}
	public void setDoornot(String doornot){
		this.doornot=doornot;
	}
	public String getDoornot(){
		return this.doornot;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setRemarks(String remarks){
		this.remarks=remarks;
	}
	public String getRemarks(){
		return this.remarks;
	}
}
