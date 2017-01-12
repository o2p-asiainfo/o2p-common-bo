package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class HNumber implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer hNumberId;
	private Integer areaId;
	private Integer lanSignId;
	private Integer orgId;
	private String operatorSing;
	private String hBefore3;
	private String hAgert4;
	private Date createTime;
	private String state;
	private Date stateTime;
	private String descInfo;
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
	public void sethNumberId(Integer hNumberId){
		this.hNumberId=hNumberId;
	}
	public Integer gethNumberId(){
		return this.hNumberId;
	}
	public void setAreaId(Integer areaId){
		this.areaId=areaId;
	}
	public Integer getAreaId(){
		return this.areaId;
	}
	public void setLanSignId(Integer lanSignId){
		this.lanSignId=lanSignId;
	}
	public Integer getLanSignId(){
		return this.lanSignId;
	}
	public void setOrgId(Integer orgId){
		this.orgId=orgId;
	}
	public Integer getOrgId(){
		return this.orgId;
	}
	public void setOperatorSing(String operatorSing){
		this.operatorSing=operatorSing;
	}
	public String getOperatorSing(){
		return this.operatorSing;
	}
	public void sethBefore3(String hBefore3){
		this.hBefore3=hBefore3;
	}
	public String gethBefore3(){
		return this.hBefore3;
	}
	public void sethAgert4(String hAgert4){
		this.hAgert4=hAgert4;
	}
	public String gethAgert4(){
		return this.hAgert4;
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
}
