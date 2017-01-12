package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.util.Date;
public class ProofValues implements Serializable{
private static final long serialVersionUID = 1L;
	private int pvId;
	private int proofeId;
	private String prAtrSpecCd;
	private String attrValue;
	private Date createTime;
	private String state;
	private Date lastestTime;
	private ProofEffect proofEffect;
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
	public void setPvId(int pvId){
		this.pvId=pvId;
	}
	public int getPvId(){
		return this.pvId;
	}
	public void setProofeId(int proofeId){
		this.proofeId=proofeId;
	}
	public int getProofeId(){
		return this.proofeId;
	}
	 
	public String getPrAtrSpecCd() {
		return prAtrSpecCd;
	}
	public void setPrAtrSpecCd(String prAtrSpecCd) {
		this.prAtrSpecCd = prAtrSpecCd;
	}
	public void setAttrValue(String attrValue){
		this.attrValue=attrValue;
	}
	public String getAttrValue(){
		return this.attrValue;
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
	public ProofEffect getProofEffect() {
		return proofEffect;
	}
	public void setProofEffect(ProofEffect proofEffect) {
		this.proofEffect = proofEffect;
	}

}
