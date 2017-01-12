/** 
 * Project Name:o2p-common-bo 
 * File Name:APIPricingCase.java 
 * Package Name:com.asiainfo.integration.o2p.billing 
 * Date:2015年2月2日下午5:18:02 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integration.o2p.billing;  

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * ClassName:APIPricingCase  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年2月2日 下午5:18:02  
 * @author   wushuzhen 
 * @version   
 * @since    JDK 1.7 
 *        
 */
public class APIPricingCase implements Serializable{
	//计划实例ID
	private int pricingCaseId;
	//订购关系ID
	private int offerApiRelaId;
	//销售品ID
	private BigDecimal prodOfferId;
	//定价标识
	private int pricingInfoId;
	//生效时间
	private Date effTime;
	//失效时间
	private Date expTime;
	public int getPricingCaseId() {
		return pricingCaseId;
	}
	public void setPricingCaseId(int pricingCaseId) {
		this.pricingCaseId = pricingCaseId;
	}
	public int getOfferApiRelaId() {
		return offerApiRelaId;
	}
	public void setOfferApiRelaId(int offerApiRelaId) {
		this.offerApiRelaId = offerApiRelaId;
	}
 
	public BigDecimal getProdOfferId() {
		return prodOfferId;
	}
	public void setProdOfferId(BigDecimal prodOfferId) {
		this.prodOfferId = prodOfferId;
	}
	public int getPricingInfoId() {
		return pricingInfoId;
	}
	public void setPricingInfoId(int pricingInfoId) {
		this.pricingInfoId = pricingInfoId;
	}
	public Date getEffTime() {
		return effTime;
	}
	public void setEffTime(Date effTime) {
		this.effTime = effTime;
	}
	public Date getExpTime() {
		return expTime;
	}
	public void setExpTime(Date expTime) {
		this.expTime = expTime;
	}
	
}
