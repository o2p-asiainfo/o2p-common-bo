package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.util.Date;
public class ApacheFtpUser implements Serializable{
private static final long serialVersionUID = 1L;
	private String userIndentity;
	private Integer techImplId;
	private Integer serInvokeInsId;
	private String userPassword;
	private String lockDir;
	private Date uploadRate;
	private Date downloadRate;
	private String isRead;
	private String isWrite;
	private String isFrozon;
	private Date idealTime;
	private Integer maxLoginNum;
	private Integer maxIpNum;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public String getUserIndentity() {
		return userIndentity;
	}
	public void setUserIndentity(String userIndentity) {
		this.userIndentity = userIndentity;
	}
	public Integer getTechImplId() {
		return techImplId;
	}
	public void setTechImplId(Integer techImplId) {
		this.techImplId = techImplId;
	}
	public Integer getSerInvokeInsId() {
		return serInvokeInsId;
	}
	public void setSerInvokeInsId(Integer serInvokeInsId) {
		this.serInvokeInsId = serInvokeInsId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getLockDir() {
		return lockDir;
	}
	public void setLockDir(String lockDir) {
		this.lockDir = lockDir;
	}
	public Date getUploadRate() {
		return uploadRate;
	}
	public void setUploadRate(Date uploadRate) {
		this.uploadRate = uploadRate;
	}
	public Date getDownloadRate() {
		return downloadRate;
	}
	public void setDownloadRate(Date downloadRate) {
		this.downloadRate = downloadRate;
	}
	public String getIsRead() {
		return isRead;
	}
	public void setIsRead(String isRead) {
		this.isRead = isRead;
	}
	public String getIsWrite() {
		return isWrite;
	}
	public void setIsWrite(String isWrite) {
		this.isWrite = isWrite;
	}
	public String getIsFrozon() {
		return isFrozon;
	}
	public void setIsFrozon(String isFrozon) {
		this.isFrozon = isFrozon;
	}
	public Date getIdealTime() {
		return idealTime;
	}
	public void setIdealTime(Date idealTime) {
		this.idealTime = idealTime;
	}
	public Integer getMaxLoginNum() {
		return maxLoginNum;
	}
	public void setMaxLoginNum(Integer maxLoginNum) {
		this.maxLoginNum = maxLoginNum;
	}
	public Integer getMaxIpNum() {
		return maxIpNum;
	}
	public void setMaxIpNum(Integer maxIpNum) {
		this.maxIpNum = maxIpNum;
	}

}
