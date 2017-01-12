/** 
 * Project Name:o2p-common-bo 
 * File Name:APIBillingCycleOfDate.java 
 * Package Name:com.asiainfo.integration.o2p.billing 
 * Date:2014年12月24日下午3:45:13 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.asiainfo.integration.o2p.billing;

import java.io.Serializable;

/**
 * ClassName:APIBillingCycleOfDate 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年12月24日 下午3:45:13 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
//计费周期数据结构
public class APIBillingCycleOfDate implements Serializable {
	private static final long serialVersionUID = 1L;

	// 计费开始日期
	private long billingStartDate;
	// 计费结束日期
	private long billingEndDate;
	// 该销售品的使用单元
	private long useUnit;
	public long getBillingStartDate() {
		return billingStartDate;
	}
	public void setBillingStartDate(long billingStartDate) {
		this.billingStartDate = billingStartDate;
	}
	public long getBillingEndDate() {
		return billingEndDate;
	}
	public void setBillingEndDate(long billingEndDate) {
		this.billingEndDate = billingEndDate;
	}
	public long getUseUnit() {
		return useUnit;
	}
	public void setUseUnit(long useUnit) {
		this.useUnit = useUnit;
	}
}
