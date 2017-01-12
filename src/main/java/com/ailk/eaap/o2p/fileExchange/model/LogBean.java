package com.ailk.eaap.o2p.fileExchange.model;

import java.sql.Timestamp;
public class LogBean {
	private long ftpTraceLogId;
	private String transactionId;
	private String fileName;
	private String fileSize;
	private Timestamp fileCreateTime;
	private String reqOrRsp;
	private String fromPath;
	private String toPath;
	private Timestamp beginTime;
	private Timestamp endTime;
	private String operType;
	private String status;
	private String remarks;
	public long getFtpTraceLogId() {
		return ftpTraceLogId;
	}
	public void setFtpTraceLogId(long ftpTraceLogId) {
		this.ftpTraceLogId = ftpTraceLogId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public Timestamp getFileCreateTime() {
		return fileCreateTime;
	}
	public void setFileCreateTime(Timestamp fileCreateTime) {
		this.fileCreateTime = fileCreateTime;
	}
	public String getReqOrRsp() {
		return reqOrRsp;
	}
	public void setReqOrRsp(String reqOrRsp) {
		this.reqOrRsp = reqOrRsp;
	}
	public String getFromPath() {
		return fromPath;
	}
	public void setFromPath(String fromPath) {
		this.fromPath = fromPath;
	}
	public String getToPath() {
		return toPath;
	}
	public void setToPath(String toPath) {
		this.toPath = toPath;
	}
	public Timestamp getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Timestamp beginTime) {
		this.beginTime = beginTime;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	public String getOperType() {
		return operType;
	}
	public void setOperType(String operType) {
		this.operType = operType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
