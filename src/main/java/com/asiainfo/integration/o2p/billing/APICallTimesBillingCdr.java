package com.asiainfo.integration.o2p.billing;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class APICallTimesBillingCdr implements Serializable{

	private static final long serialVersionUID = 7111058432179712737L;
	//计费批号
	private String batchNumber;
	//生成计费批号时间 用于超时判断
	private long createBatchTime;
	//计费批号的当天标识 超过该标识 重新生成计费批号
	private long createBatchDay;
	//交易流水列表
	private List<String>  transList = new LinkedList<String>();	
	//交易流水数量
	private int transCount = 0;
	//机构ID
	private int orgId;
	//APP ID
	private int appId;
	//销售品ID
	private BigDecimal prodOfferId;
	//API函数ID
	private int apiId;
	//API 调用的流量值
	private long flow;	
	//定价计划ID
	private int pricingPlanId;
	//组合资源ID 
	private int componentPriceId;	
	private Integer tenantId;

	public List<String> getTransList() {
		return transList;
	}
	public void setTransList(List<String> transList) {
		this.transList = transList;
	}
	
	public long getFlow() {
		return flow;
	}
	public void setFlow(long flow) {
		this.flow = flow;
	}
	public String getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}
	public long getCreateBatchTime() {
		return createBatchTime;
	}
	public void setCreateBatchTime(long createBatchTime) {
		this.createBatchTime = createBatchTime;
	}
	public long getCreateBatchDay() {
		return createBatchDay;
	}
	public void setCreateBatchDay(long createBatchDay) {
		this.createBatchDay = createBatchDay;
	}
	public int getTransCount() {
		return transCount;
	}
	public void setTransCount(int transCount) {
		this.transCount = transCount;
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
	public int getPricingPlanId() {
		return pricingPlanId;
	}
	public void setPricingPlanId(int pricingPlanId) {
		this.pricingPlanId = pricingPlanId;
	}
	public int getComponentPriceId() {
		return componentPriceId;
	}
	public void setComponentPriceId(int componentPriceId) {
		this.componentPriceId = componentPriceId;
	}
	
	public void addTrans(String transNum) {
		this.transList.add(transNum);
		this.transCount++;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
	
}
