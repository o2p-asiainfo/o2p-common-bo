package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class BaseProvinceAnalysisBO  implements Serializable {
	private static final long serialVersionUID = 1L;
	//省份id
	private String provinceId; 
	//省份名称
	private String provinceName;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public String getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}


	
	
}
