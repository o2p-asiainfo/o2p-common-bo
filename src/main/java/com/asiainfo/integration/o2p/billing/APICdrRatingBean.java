/** 
 * Project Name:o2p-common-bo 
 * File Name:APICdrRatingBean.java 
 * Package Name:com.asiainfo.integration.o2p.billing 
 * Date:2015年2月4日下午2:51:10 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integration.o2p.billing;  

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
 * ClassName:APICdrRatingBean  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年2月4日 下午2:51:10  
 * @author   wushuzhen 
 * @version   
 * @since    JDK 1.7 
 *        
 */
public class APICdrRatingBean implements Serializable{
	private static final long serialVersionUID = 7998800811606518102L;
	//交易批号
	private String batchNumber;
	//交易流水号
	private String trassId;
	//交易次数
	private int transCount;
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
	//定价计划ID
	private int pricingPlanId;
	//组合资源ID 
	private int componentPriceId;
	//call 时间 也是入库时间
	private String callTime;
	//物理表的后缀名	
	private String tabSuffix;
	private Integer tenantId;
	//每条交易流水号对应的基础资费的梯度区间
	private Map<Integer,List<String>> transBaseTariffBillInfoMap = new HashMap<Integer,List<String>>();

	public String getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}
	public String getTrassId() {
		return trassId;
	}
	public void setTrassId(String trassId) {
		this.trassId = trassId;
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
	public byte getMessageType() {
		return messageType;
	}
	public void setMessageType(byte messageType) {
		this.messageType = messageType;
	}
	public long getFlow() {
		return flow;
	}
	public void setFlow(long flow) {
		this.flow = flow;
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
	public String getCallTime() {
		return callTime;
	}
	public void setCallTime(String callTime) {
		this.callTime = callTime;
	}
	public String getTabSuffix() {
		return tabSuffix;
	}
	public void setTabSuffix(String tabSuffix) {
		this.tabSuffix = tabSuffix;
	}
	public Map<Integer, List<String>> getTransBaseTariffBillInfoMap() {
		return transBaseTariffBillInfoMap;
	}
	public void setTransBaseTariffBillInfoMap(
			Map<Integer, List<String>> transBaseTariffBillInfoMap) {
		this.transBaseTariffBillInfoMap = transBaseTariffBillInfoMap;
	}
	public void addBaseTariffBillInfoMap(Integer BaseTariffBillInfoID,String transID) {
		
		if(transBaseTariffBillInfoMap.containsKey(BaseTariffBillInfoID))
		{
			transBaseTariffBillInfoMap.get(BaseTariffBillInfoID).add(transID);
		}else{
			
			List<String> arrayList = new ArrayList<String>();
			arrayList.add(transID);
			transBaseTariffBillInfoMap.put(BaseTariffBillInfoID, arrayList);
			
		}	
		
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
	
}
