package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class FtpErrLog implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer ftpErrLogId;
	private Integer ftpTraceLogId;
	private String transactionId;
	private String filePath;
	private Integer errSpecId;
	private String errMsg;
	private Object createTime;
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
	public void setFtpErrLogId(Integer ftpErrLogId){
		this.ftpErrLogId=ftpErrLogId;
	}
	public Integer getFtpErrLogId(){
		return this.ftpErrLogId;
	}
	public void setFtpTraceLogId(Integer ftpTraceLogId){
		this.ftpTraceLogId=ftpTraceLogId;
	}
	public Integer getFtpTraceLogId(){
		return this.ftpTraceLogId;
	}
	public void setTransactionId(String transactionId){
		this.transactionId=transactionId;
	}
	public String getTransactionId(){
		return this.transactionId;
	}
	public void setFilePath(String filePath){
		this.filePath=filePath;
	}
	public String getFilePath(){
		return this.filePath;
	}
	public void setErrSpecId(Integer errSpecId){
		this.errSpecId=errSpecId;
	}
	public Integer getErrSpecId(){
		return this.errSpecId;
	}
	public void setErrMsg(String errMsg){
		this.errMsg=errMsg;
	}
	public String getErrMsg(){
		return this.errMsg;
	}
	public void setCreateTime(Object createTime){
		this.createTime=createTime;
	}
	public Object getCreateTime(){
		return this.createTime;
	}
}
