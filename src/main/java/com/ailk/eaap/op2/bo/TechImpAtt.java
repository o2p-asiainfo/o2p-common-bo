package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class TechImpAtt implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer techImpAttId; 
	private Integer attrSpecId;
	private Integer techImplId;
	private String attrSpecValue;
	private Date createTime;
	private Date lastestTime;
	private String state;

	private Integer tenantId;



	public void setTechImpAttId(Integer techImpAttId){
		this.techImpAttId=techImpAttId;
	}
	public Integer getTechImpAttId(){
		return this.techImpAttId;
	}
	public void setAttrSpecId(Integer attrSpecId){
		this.attrSpecId=attrSpecId;
	}
	public Integer getAttrSpecId(){
		return this.attrSpecId;
	}
	public void setTechImplId(Integer techImplId){
		this.techImplId=techImplId;
	}
	public Integer getTechImplId(){
		return this.techImplId;
	}
	public void setAttrSpecValue(String attrSpecValue){
		this.attrSpecValue=attrSpecValue;
	}
	public String getAttrSpecValue(){
		return this.attrSpecValue;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setLastestTime(Date lastestTime){
		this.lastestTime=lastestTime;
	}
	public Date getLastestTime(){
		return this.lastestTime;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
}
