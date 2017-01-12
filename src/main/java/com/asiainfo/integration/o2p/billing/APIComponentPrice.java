/** 
 * Project Name:o2p-common-bo 
 * File Name:APIComponentPrice.java 
 * Package Name:com.asiainfo.integration.o2p.billing 
 * Date:2014年12月24日下午3:30:53 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integration.o2p.billing;  

import java.io.Serializable;

/** 
 * ClassName:APIComponentPrice  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2014年12月24日 下午3:30:53  
 * @author   zhongming 
 * @version   
 * @since    JDK 1.6 
 *        
 */

//组合资源基类
public class APIComponentPrice implements Serializable {
	
	private static final long serialVersionUID = 1L;	
	private int componentPriceId;
	//组合类型
	private byte 	priceType;
	//生效时间
	private long 	effDate;
	//失效时间
	private long 	expDate;
	public int getComponentPriceId() {
		return componentPriceId;
	}
	public void setComponentPriceId(int componentPriceId) {
		this.componentPriceId = componentPriceId;
	}
	public byte getPriceType() {
		return priceType;
	}
	public void setPriceType(byte priceType) {
		this.priceType = priceType;
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
}
