package com.asiainfo.integration.o2p.billing;

import java.io.Serializable;
import java.math.BigDecimal;

public class APICdrDBBean implements Serializable{
	
	private static final long serialVersionUID = 7998800811606518102L;
	//交易流水号
	private String trassId;
	//机构ID(发起方)
	private int orgId;
	//APP应用ID
	private int appId;	
	//销售品ID
	private BigDecimal prodOfferId;
	//API函数ID
	private int apiId;
	//本话单所属的类型 1.一般话单 2.文件话单
	private byte messageType;
	//API 调用的流量值
	private long flow;	
	//call 时间 话单入库时间
	private String callTime;
	//写库时间
	private String writeTime;
	//物理表的后缀名	
	private String tabSuffix;
	private Integer tenantId;

	public APICdrDBBean(){
		this.prodOfferId =new BigDecimal(0);	
	}
	
	public String getTrassId() {
		return trassId;
	}

	public void setTrassId(String trassId) {
		this.trassId = trassId;
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

 

	public BigDecimal getProdOfferId() {
		return prodOfferId;
	}

	public void setProdOfferId(BigDecimal prodOfferId) {
		this.prodOfferId = prodOfferId;
	}

	public int getApiId() {
		return apiId;
	}

	public void setApiId(int apiId) {
		this.apiId = apiId;
	}

	public byte getMessageType() {
		return messageType;
	}

	public void setMessageType(byte messageType) {
		this.messageType = messageType;
	}

	public String getCallTime() {
		return callTime;
	}

	public void setCallTime(String callTime) {
		this.callTime = callTime;
	}

	public long getFlow() {
		return flow;
	}
	public void setFlow(long flow) {
		this.flow = flow;
	}

	public String getWriteTime() {
		return writeTime;
	}

	public void setWriteTime(String writeTime) {
		this.writeTime = writeTime;
	}

	public String getTabSuffix() {
		return tabSuffix;
	}

	public void setTabSuffix(String tabSuffix) {
		this.tabSuffix = tabSuffix;
	}

	public Integer getTenantId() {
		return tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}	
	
	
}
