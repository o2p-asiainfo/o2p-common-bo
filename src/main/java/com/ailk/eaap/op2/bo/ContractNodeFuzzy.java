/** 
 * Project Name:o2p-common-bo 
 * File Name:ContractNodeFuzzy.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2015年3月12日下午4:17:57 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.sql.Date;

/**
 * ClassName:ContractNodeFuzzy 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2015年3月12日 下午4:17:57 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public class ContractNodeFuzzy implements Serializable {
	private static final long serialVersionUID = 1L;

	private int contractNodeFuzzyId;
	private int tcpCtrFId;
	private int nodeDescId;
	private int fuzzyEncryptionId;
	private String scope;
	private String state;
	private Date createDate;
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
	public int getContractNodeFuzzyId() {
		return contractNodeFuzzyId;
	}

	public void setContractNodeFuzzyId(int contractNodeFuzzyId) {
		this.contractNodeFuzzyId = contractNodeFuzzyId;
	}

	public int getTcpCtrFId() {
		return tcpCtrFId;
	}

	public void setTcpCtrFId(int tcpCtrFId) {
		this.tcpCtrFId = tcpCtrFId;
	}

	public int getNodeDescId() {
		return nodeDescId;
	}

	public void setNodeDescId(int nodeDescId) {
		this.nodeDescId = nodeDescId;
	}

	public int getFuzzyEncryptionId() {
		return fuzzyEncryptionId;
	}

	public void setFuzzyEncryptionId(int fuzzyEncryptionId) {
		this.fuzzyEncryptionId = fuzzyEncryptionId;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
