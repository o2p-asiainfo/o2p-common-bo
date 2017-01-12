package com.ailk.eaap.o2p.fileExchange.model;

import java.io.Serializable;
import java.util.Date;

public class FileMoveSerInst implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer serInvokeInstId;
	private DirBean dirBean;
	private String isBatch;
	private String reqOrResp;
	private String isSrcRm;
	private Date createDt;
	private String state;
	private String fileFilterExp;
	private String suffixFmt;
	private String isFileCheck;
	private String fileAlg;
	private String fileFormats;

	public String getFileFormats() {
		return fileFormats;
	}

	public void setFileFormats(String fileFormats) {
		this.fileFormats = fileFormats;
	}

	public String getSuffixFmt() {
		return suffixFmt;
	}

	public void setSuffixFmt(String suffixFmt) {
		this.suffixFmt = suffixFmt;
	}

	public String getIsFileCheck() {
		return isFileCheck;
	}

	public void setIsFileCheck(String isFileCheck) {
		this.isFileCheck = isFileCheck;
	}

	public String getFileAlg() {
		return fileAlg;
	}

	public void setFileAlg(String fileAlg) {
		this.fileAlg = fileAlg;
	}

	public Integer getSerInvokeInstId() {
		return serInvokeInstId;
	}

	public void setSerInvokeInstId(Integer serInvokeInstId) {
		this.serInvokeInstId = serInvokeInstId;
	}

	public DirBean getDirBean() {
		return dirBean;
	}

	public void setDirBean(DirBean dirBean) {
		this.dirBean = dirBean;
	}

	public String getIsBatch() {
		return isBatch;
	}

	public void setIsBatch(String isBatch) {
		this.isBatch = isBatch;
	}

	public String getReqOrResp() {
		return reqOrResp;
	}

	public void setReqOrResp(String reqOrResp) {
		this.reqOrResp = reqOrResp;
	}

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public String getState() {
		return state;
	}

	public String getFileFilterExp() {
		return fileFilterExp;
	}

	public void setFileFilterExp(String fileFilterExp) {
		this.fileFilterExp = fileFilterExp;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIsSrcRm() {
		return isSrcRm;
	}

	public void setIsSrcRm(String isSrcRm) {
		this.isSrcRm = isSrcRm;
	}

}
