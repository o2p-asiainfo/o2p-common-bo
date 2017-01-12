package com.ailk.eaap.o2p.fileExchange.model;

import java.io.Serializable;
import java.util.Date;

public class FileEx2RouteServ implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String fdNBR;
	private String userName;
	private String remoteIp;
	private String operType;
	private int userDirId;
	private String filePath;
	private String operPath;
	private int servInvokeInstId;
	private String dealFlag;
	private Date dealDt;
	private Date createDt;
	private String remark;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFdNBR() {
		return fdNBR;
	}
	public void setFdNBR(String fdNBR) {
		this.fdNBR = fdNBR;
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
	public int getUserDirId() {
		return userDirId;
	}
	public void setUserDirId(int userDirId) {
		this.userDirId = userDirId;
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
	public int getServInvokeInstId() {
		return servInvokeInstId;
	}
	public void setServInvokeInstId(int servInvokeInstId) {
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	

}
