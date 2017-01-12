package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.util.Date;
import java.util.Hashtable;
import java.util.Map;
public class ProofEffect implements Serializable{
private static final long serialVersionUID = 1L;
	private int proofeId;
	private int ptCd;
	private int serInvokeInsId;
	private Date createTime;
	private String status;
	private Date datetime;
	private ProofType proofType;
	private String proofCode;
	private Map<String,Object> atts = new Hashtable();
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
	
	public void setProofeId(int proofeId){
		this.proofeId=proofeId;
	}
	public int getProofeId(){
		return this.proofeId;
	}
	public void setPtCd(int ptCd){
		this.ptCd=ptCd;
	}
	public int getPtCd(){
		return this.ptCd;
	}
	public void setSerInvokeInsId(int serInvokeInsId){
		this.serInvokeInsId=serInvokeInsId;
	}
	public int getSerInvokeInsId(){
		return this.serInvokeInsId;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setDatetime(Date datetime){
		this.datetime=datetime;
	}
	public Date getDatetime(){
		return this.datetime;
	}
	public ProofType getProofType() {
		return proofType;
	}
	public void setProofType(ProofType proofType) {
		this.proofType = proofType;
	}
	public Map<String, Object> getAtts() {
		return atts;
	}
	public void setAtts(Map<String, Object> atts) {
		this.atts = atts;
	}
	public String getProofCode() {
		return proofCode;
	}
	public void setProofCode(String proofCode) {
		this.proofCode = proofCode;
	}


}
