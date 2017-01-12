package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class BaseProductAnalysisBO  implements Serializable {
	private static final long serialVersionUID = 1L;
	//产品id
	private String productId; 
	//产品名称
	private String productName;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}


	
	
}
