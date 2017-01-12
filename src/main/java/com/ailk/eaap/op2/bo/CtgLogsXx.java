package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class CtgLogsXx implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer logsSeq;
	private String contractInteractionId;
	private String errCode;
	private String funName;
	private Object createDate;
	private String errorMsg;
	private String descriptor;
	private String status;
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
	public void setLogsSeq(Integer logsSeq){
		this.logsSeq=logsSeq;
	}
	public Integer getLogsSeq(){
		return this.logsSeq;
	}
	public void setContractInteractionId(String contractInteractionId){
		this.contractInteractionId=contractInteractionId;
	}
	public String getContractInteractionId(){
		return this.contractInteractionId;
	}
	public void setErrCode(String errCode){
		this.errCode=errCode;
	}
	public String getErrCode(){
		return this.errCode;
	}
	public void setFunName(String funName){
		this.funName=funName;
	}
	public String getFunName(){
		return this.funName;
	}
	public void setCreateDate(Object createDate){
		this.createDate=createDate;
	}
	public Object getCreateDate(){
		return this.createDate;
	}
	public void setErrorMsg(String errorMsg){
		this.errorMsg=errorMsg;
	}
	public String getErrorMsg(){
		return this.errorMsg;
	}
	public void setDescriptor(String descriptor){
		this.descriptor=descriptor;
	}
	public String getDescriptor(){
		return this.descriptor;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}
}
