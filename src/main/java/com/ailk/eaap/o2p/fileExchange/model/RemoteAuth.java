package com.ailk.eaap.o2p.fileExchange.model;

import java.io.Serializable;
import java.util.Date;

public class RemoteAuth implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1161547728769444503L;
	private Integer id;
	private Integer hostConfId;
	private String userName;
	private String password;
	private String authFilePath;
	private String passphrase;
	private String desc;
	private String hostName;
	private String hostIp;
	private String ftpType;
	private Integer ftpPort;
	private Date createDt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getHostConfId() {
		return hostConfId;
	}
	public void setHostConfId(Integer hostConfId) {
		this.hostConfId = hostConfId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAuthFilePath() {
		return authFilePath;
	}
	public void setAuthFilePath(String authFilePath) {
		this.authFilePath = authFilePath;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public String getHostIp() {
		return hostIp;
	}
	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}
	public String getFtpType() {
		return ftpType;
	}
	public void setFtpType(String ftpType) {
		this.ftpType = ftpType;
	}
	public Integer getFtpPort() {
		return ftpPort;
	}
	public void setFtpPort(Integer ftpPort) {
		this.ftpPort = ftpPort;
	}
	public String getPassphrase() {
		return passphrase;
	}
	public void setPassphrase(String passphrase) {
		this.passphrase = passphrase;
	}
	
}
