package com.ailk.eaap.o2p.fileExchange.model;

import java.io.Serializable;
import java.util.Date;

public class FileExFailDispatch implements Serializable{
	public final static String CONST_DEAL_FLAG_INIT = "A";
	public final static String CONST_DEAL_FLAG_COMPLETE = "C";
	public final static String CONST_DEAL_FLAG_HANDLE = "D";
	public final static String CONST_DEAL_FLAG_EXCEPTION = "E";
	public final static String CONST_RECORD_CD_CHECK_FAIL = "1";
	public final static String CONST_RECORD_CD_ADAPTER_FAIL = "2";
	public final static String CONST_RECORD_CD_MOVE_FAIL = "3";
	/**
	 * 
	 */
	private static final long serialVersionUID = 7080925653678743694L;
	private Long id;
	private String fdNbr;
	private String userName;//操作员
	private String remoteIp;
	private String operType;
	private Integer dirId;
	private String filePath;
	private String operPath;
	private Integer servInvokeInstId;
	private String dealFlag;//A:未处理D:已处理E:处理异常
	private Date dealDt;
	private Date createDt;
	private String recordCd;//记录原因:1.文件校验错误2.文件适配失败3.文件搬迁失败
	private String remark;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFdNbr() {
		return fdNbr;
	}
	public void setFdNbr(String fdNbr) {
		this.fdNbr = fdNbr;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRemoteIp() {
		return remoteIp;
	}
	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
	}
	public String getOperType() {
		return operType;
	}
	public void setOperType(String operType) {
		this.operType = operType;
	}
	public Integer getDirId() {
		return dirId;
	}
	public void setDirId(Integer dirId) {
		this.dirId = dirId;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getOperPath() {
		return operPath;
	}
	public void setOperPath(String operPath) {
		this.operPath = operPath;
	}
	public Integer getServInvokeInstId() {
		return servInvokeInstId;
	}
	public void setServInvokeInstId(Integer servInvokeInstId) {
		this.servInvokeInstId = servInvokeInstId;
	}
	public String getDealFlag() {
		return dealFlag;
	}
	public void setDealFlag(String dealFlag) {
		this.dealFlag = dealFlag;
	}
	public Date getDealDt() {
		return dealDt;
	}
	public void setDealDt(Date dealDt) {
		this.dealDt = dealDt;
	}
	public Date getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}
	public String getRecordCd() {
		return recordCd;
	}
	public void setRecordCd(String recordCd) {
		this.recordCd = recordCd;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	

}
