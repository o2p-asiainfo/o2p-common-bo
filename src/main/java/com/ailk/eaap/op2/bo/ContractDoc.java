package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ContractDoc implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer contractDocId;
	private Integer baseConDocId;
	private String docName;
	private String docVersion;
	private Date docCreateTime;
	private String state;
	private Date lastestTime;
	private String docPath;
	private String resourceAliss;
	private String docType;



	private Integer tenantId;


	
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public Integer getContractDocId() {
		return contractDocId;
	}
	public void setContractDocId(Integer contractDocId) {
		this.contractDocId = contractDocId;
	}
	public Integer getBaseConDocId() {
		return baseConDocId;
	}
	public void setBaseConDocId(Integer baseConDocId) {
		this.baseConDocId = baseConDocId;
	}
	public void setDocName(String docName){
		this.docName=docName;
	}
	public String getDocName(){
		return this.docName;
	}
	public void setDocVersion(String docVersion){
		this.docVersion=docVersion;
	}
	public String getDocVersion(){
		return this.docVersion;
	}
	public void setDocCreateTime(Date docCreateTime){
		this.docCreateTime=docCreateTime;
	}
	public Date getDocCreateTime(){
		return this.docCreateTime;
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
	public void setDocPath(String docPath){
		this.docPath=docPath;
	}
	public String getDocPath(){
		return this.docPath;
	}
	public String getResourceAliss() {
		return resourceAliss;
	}
	public void setResourceAliss(String resourceAliss) {
		this.resourceAliss = resourceAliss;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
}
