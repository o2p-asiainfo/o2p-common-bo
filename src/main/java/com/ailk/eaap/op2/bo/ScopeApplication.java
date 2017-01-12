package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.util.List;
import java.io.Serializable;
public class ScopeApplication implements Serializable{
private static final long serialVersionUID = 1L;
	private String relId;
	private String applicType;
	private String valueMethod;
	private String valueType;
	private String valueId;
	private Date stateDate;
	private String stateCd;
	private Date createDate;
	private Date version;
    private String description;
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
    
	public String getRelId() {
		return relId;
	}
	public void setRelId(String relId) {
		this.relId = relId;
	}
	public String getApplicType() {
		return applicType;
	}
	public void setApplicType(String applicType) {
		this.applicType = applicType;
	}
	public String getValueMethod() {
		return valueMethod;
	}
	public void setValueMethod(String valueMethod) {
		this.valueMethod = valueMethod;
	}
	public String getValueType() {
		return valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}
	public String getValueId() {
		return valueId;
	}
	public void setValueId(String valueId) {
		this.valueId = valueId;
	}
	public Date getStateDate() {
		return stateDate;
	}
	public void setStateDate(Date stateDate) {
		this.stateDate = stateDate;
	}
	public String getStateCd() {
		return stateCd;
	}
	public void setStateCd(String stateCd) {
		this.stateCd = stateCd;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getVersion() {
		return version;
	}
	public void setVersion(Date version) {
		this.version = version;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
   
}
