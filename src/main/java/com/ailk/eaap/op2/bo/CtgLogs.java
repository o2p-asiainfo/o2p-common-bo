/*
 * @(#)CtgLogs.java        2013-2-3
 *
 * Copyright (c) 2013 asiainfo-linkage
 * All rights reserved.
 *
 */

package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.sql.Timestamp;
/**
 * 类名称<br>
 * 这里是类的描述区域，概括出该的主要功能或者类的使用范围、注意事项等
 * <p>
 * @version 1.0
 * @author Administrator 2013-2-3
 * <hr>
 * 修改记录
 * <hr>
 * 1、修改人员:    修改时间:<br>       
 *    修改内容:
 * <hr>
 */

public class CtgLogs implements Serializable,Cloneable{
	private static final long serialVersionUID = 1L;
	//private Long logsSeq;
	private String logsSeq;
	private String contractInteractionId;
	private String errCode;
	private String funName;
	private Timestamp createDate;
	private String errorMsg;
	private String descriptor;
	private String status;
	private String tabSuffix;
	private int tenantId;
	
	
	//来源实例标识
	private String srcSysSign;
	
	
	
	public int getTenantId() {
        return tenantId;
    }
    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }
    public String getSrcSysSign() {
		return srcSysSign;
	}
	public void setSrcSysSign(String srcSysSign) {
		this.srcSysSign = srcSysSign;
	}
	
	public Object clone(){
		try{
			return super.clone();
		}catch (Exception e){
			return null;
		}
	}	

	public String getLogsSeq() {
		return logsSeq;
	}


	public void setLogsSeq(String logsSeq) {
		this.logsSeq = logsSeq;
	}


	public void setContractInteractionId(String contractInteractionId) {
		this.contractInteractionId = contractInteractionId;
	}

	public String getContractInteractionId() {
		return this.contractInteractionId;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setFunName(String funName) {
		this.funName = funName;
	}

	public String getFunName() {
		return this.funName;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
	}

	public String getDescriptor() {
		return this.descriptor;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public String getTabSuffix() {
		return tabSuffix;
	}

	public void setTabSuffix(String tabSuffix) {
		this.tabSuffix = tabSuffix;
	}
	
}
