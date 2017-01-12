package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class Api implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer apiId;
	private Integer serviceId;
	private String apiName;
	private String apiVersion;
	private Integer orgId;
	private String apiState;
	private Date apiRegTime;
	private Date apiEnableTime;
	private Date apiDisableTime;
	private String apiDesc;
	private String contractVer;
	private String serviceCode;
	private String apiMethod;
	private String isNeedUserAuth;
	private List<PriDefine> priDefines;
	private ServiceProductRela serviceProductRela;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	public ServiceProductRela getServiceProductRela() {
		return serviceProductRela;
	}

	public void setServiceProductRela(ServiceProductRela serviceProductRela) {
		this.serviceProductRela = serviceProductRela;
	}

	public void setApiId(Integer apiId) {
		this.apiId = apiId;
	}

	public Integer getApiId() {
		return this.apiId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public Integer getServiceId() {
		return this.serviceId;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getApiName() {
		return this.apiName;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}


	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getOrgId() {
		return this.orgId;
	}

	public void setApiState(String apiState) {
		this.apiState = apiState;
	}

	public String getApiState() {
		return this.apiState;
	}

	public void setApiRegTime(Date apiRegTime) {
		this.apiRegTime = apiRegTime;
	}

	public Date getApiRegTime() {
		return this.apiRegTime;
	}

	public void setApiEnableTime(Date apiEnableTime) {
		this.apiEnableTime = apiEnableTime;
	}

	public Date getApiEnableTime() {
		return this.apiEnableTime;
	}

	public void setApiDisableTime(Date apiDisableTime) {
		this.apiDisableTime = apiDisableTime;
	}

	public Date getApiDisableTime() {
		return this.apiDisableTime;
	}

	public void setApiDesc(String apiDesc) {
		this.apiDesc = apiDesc;
	}

	public String getApiDesc() {
		return this.apiDesc;
	}

	public String getContractVer() {
		return contractVer;
	}

	public String getApiMethod() {
		return apiMethod;
	}

	public void setApiMethod(String apiMethod) {
		this.apiMethod = apiMethod;
	}

	public void setContractVer(String contractVer) {
		this.contractVer = contractVer;
	}

	public List<PriDefine> getPriDefines() {
		return priDefines;
	}

	public void setPriDefines(List<PriDefine> priDefines) {
		this.priDefines = priDefines;
	}

	public String getIsNeedUserAuth() {
		return isNeedUserAuth;
	}

	public void setIsNeedUserAuth(String isNeedUserAuth) {
		this.isNeedUserAuth = isNeedUserAuth;
	}

}
