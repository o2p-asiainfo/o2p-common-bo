package com.ailk.eaap.o2p.fileExchange.model;

import java.io.Serializable;
import java.util.Date;

public class DirBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7000088709273095123L;
	private long dirId;
	private long parentDirId;
	private RemoteAuth remoteAuth;
	private Integer remoteAuthId;
	private String dirPath;
	private Date createTime;
	private String dirType;// 目录类型,L本地，R远程
	private String description;
	private String fullFsPath; // 冗余字段，完整的系统文件路径
	private String urlPath; //
	private String downloadRule;
	private long serInvokeInsId;

	public DirBean() {

	}

	public DirBean(long dirId, long parentDirId, Integer remoteAuthId,
			String dirPath, Date createTime, String dirType,
			String description, String urlPath) {
		super();
		this.dirId = dirId;
		this.parentDirId = parentDirId;
		this.remoteAuthId = remoteAuthId;
		this.dirPath = dirPath;
		this.createTime = createTime;
		this.dirType = dirType;
		this.description = description;
		this.urlPath = urlPath;
	}

	public long getDirId() {
		return dirId;
	}

	public void setDirId(long dirId) {
		this.dirId = dirId;
	}

	public long getParentDirId() {
		return parentDirId;
	}

	public void setParentDirId(long parentDirId) {
		this.parentDirId = parentDirId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDirType() {
		return dirType;
	}

	public void setDirType(String dirType) {
		this.dirType = dirType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getRemoteAuthId() {
		return remoteAuthId;
	}

	public void setRemoteAuthId(Integer remoteAuthId) {
		this.remoteAuthId = remoteAuthId;
	}

	public String getDirPath() {
		return dirPath;
	}

	public void setDirPath(String dirPath) {
		this.dirPath = dirPath;
	}

	public String getFullFsPath() {
		return fullFsPath;
	}

	public void setFullFsPath(String fullFsPath) {
		this.fullFsPath = fullFsPath;
	}

	public RemoteAuth getRemoteAuth() {
		return remoteAuth;
	}

	public void setRemoteAuth(RemoteAuth remoteAuth) {
		this.remoteAuth = remoteAuth;
	}

	public String getUrlPath() {
		return urlPath;
	}

	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}

	public String getDownloadRule() {
		return downloadRule;
	}

	public void setDownloadRule(String downloadRule) {
		this.downloadRule = downloadRule;
	}

	public long getSerInvokeInsId() {
		return serInvokeInsId;
	}

	public void setSerInvokeInsId(long serInvokeInsId) {
		this.serInvokeInsId = serInvokeInsId;
	}

}
