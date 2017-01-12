/** 
 * Project Name:o2p-common-bo 
 * File Name:ServiceProductRela.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2014年12月15日下午4:52:41 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ClassName:ServiceProductRela 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年12月15日 下午4:52:41 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public class ServiceProductRela implements Serializable {

	private static final long serialVersionUID = 1L;

	private int serviceProductId;
	private BigDecimal productId;
	private int serviceId;
	private Product product;
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

	public int getServiceProductId() {
		return serviceProductId;
	}

	public void setServiceProductId(int serviceProductId) {
		this.serviceProductId = serviceProductId;
	}

	public BigDecimal getProductId() {
		return productId;
	}

	public void setProductId(BigDecimal productId) {
		this.productId = productId;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
