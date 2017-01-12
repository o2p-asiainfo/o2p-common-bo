/** 
 * Project Name:o2p-common-bo 
 * File Name:ContractAdapterEndpoint.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2015年4月10日下午12:07:45 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.sql.Date;

/**
 * ClassName:ContractAdapterEndpoint 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2015年4月10日 下午12:07:45 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public class ContractAdapterEndpoint implements Serializable {
	private static final long serialVersionUID = 1L;

	private int contractAdapterEndpointId;
	private int contractAdapterId;
	private int endpointId;
	private Endpoint endpoint;
	private ContractFormatEx contractFormat;
	private String actionType;
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
	public int getContractAdapterEndpointId() {
		return contractAdapterEndpointId;
	}

	public void setContractAdapterEndpointId(int contractAdapterEndpointId) {
		this.contractAdapterEndpointId = contractAdapterEndpointId;
	}

	public int getContractAdapterId() {
		return contractAdapterId;
	}

	public void setContractAdapterId(int contractAdapterId) {
		this.contractAdapterId = contractAdapterId;
	}

	public Endpoint getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(Endpoint endpoint) {
		this.endpoint = endpoint;
	}

	public ContractFormatEx getContractFormat() {
		return contractFormat;
	}

	public void setContractFormat(ContractFormatEx contractFormat) {
		this.contractFormat = contractFormat;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getEndpointId() {
		return endpointId;
	}

	public void setEndpointId(int endpointId) {
		this.endpointId = endpointId;
	}

}
