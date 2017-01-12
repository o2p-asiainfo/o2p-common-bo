package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class Area implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer areaId;
	private Integer upAreaId;
	private String zoneName;
	private String zoneNumber;
	private Date createTime;
	private String state;
	private Date stateTime;
	private String descInfo;

	private Integer tenantId;


	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	
	public Integer getUpAreaId() {
		return upAreaId;
	}
	public void setUpAreaId(Integer upAreaId) {
		this.upAreaId = upAreaId;
	}
	public void setZoneName(String zoneName){
		this.zoneName=zoneName;
	}
	public String getZoneName(){
		return this.zoneName;
	}
	public void setZoneNumber(String zoneNumber){
		this.zoneNumber=zoneNumber;
	}
	public String getZoneNumber(){
		return this.zoneNumber;
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
	public void setStateTime(Date stateTime){
		this.stateTime=stateTime;
	}
	public Date getStateTime(){
		return this.stateTime;
	}
	public void setDescInfo(String descInfo){
		this.descInfo=descInfo;
	}
	public String getDescInfo(){
		return this.descInfo;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
}
