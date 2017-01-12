/** 
 * Project Name:o2p-common-bo 
 * File Name:SalesOfOrg.java 
 * Package Name:com.asiainfo.integration.o2p.billing 
 * Date:2014年12月24日下午3:17:22 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.asiainfo.integration.o2p.billing;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:SalesOfOrg 销售品
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年12月24日 下午3:17:22 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */

//API销售品的数据结构
public class APISalesOfOrg implements Serializable {
	private static final long serialVersionUID = 1L;

	// 销售品ID
	private BigDecimal prodOfferId;
	// 该销售品所拥有的定价计划
	private List<APISalesOfPricing> pricingList = new ArrayList<APISalesOfPricing>();
	// 销售品的生效时间
	private long effDate;
	// 销售品的失效时间
	private long expDate;

	
	public BigDecimal getProdOfferId() {
		return prodOfferId;
	}

	public void setProdOfferId(BigDecimal prodOfferId) {
		this.prodOfferId = prodOfferId;
	}

	public long getEffDate() {
		return effDate;
	}

	public void setEffDate(long effDate) {
		this.effDate = effDate;
	}

	public long getExpDate() {
		return expDate;
	}

	public void setExpDate(long expDate) {
		this.expDate = expDate;
	}

	public List<APISalesOfPricing> getPricingList() {
		return pricingList;
	}

	public void setPricingList(List<APISalesOfPricing> pricingList) {
		this.pricingList = pricingList;
	}



}
