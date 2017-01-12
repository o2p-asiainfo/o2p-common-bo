package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class FtpTraceLog implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer ftpTraceLogId;
	private String transactionId;
	private String fileName;
	private String fileSize;
	private Object fileCreateTime;
	private String reqOrRes;
	private String fromPath;
	private String toPath;
	private Object beginTime;
	private Object endTime;
	private String operType;
	private String status;
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
	public void setFileName(String fileName){
		this.fileName=fileName;
	}
	public String getFileName(){
		return this.fileName;
	}
	public void setFileSize(String fileSize){
		this.fileSize=fileSize;
	}
	public String getFileSize(){
		return this.fileSize;
	}
	public void setFileCreateTime(Object fileCreateTime){
		this.fileCreateTime=fileCreateTime;
	}
	public Object getFileCreateTime(){
		return this.fileCreateTime;
	}
	public void setReqOrRes(String reqOrRes){
		this.reqOrRes=reqOrRes;
	}
	public String getReqOrRes(){
		return this.reqOrRes;
	}
	public void setFromPath(String fromPath){
		this.fromPath=fromPath;
	}
	public String getFromPath(){
		return this.fromPath;
	}
	public void setToPath(String toPath){
		this.toPath=toPath;
	}
	public String getToPath(){
		return this.toPath;
	}
	public void setBeginTime(Object beginTime){
		this.beginTime=beginTime;
	}
	public Object getBeginTime(){
		return this.beginTime;
	}
	public void setEndTime(Object endTime){
		this.endTime=endTime;
	}
	public Object getEndTime(){
		return this.endTime;
	}
	public void setOperType(String operType){
		this.operType=operType;
	}
	public String getOperType(){
		return this.operType;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}
	public void setRemarks(String remarks){
		this.remarks=remarks;
	}
	public String getRemarks(){
		return this.remarks;
	}
}
