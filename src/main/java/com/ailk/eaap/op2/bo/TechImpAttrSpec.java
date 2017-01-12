package com.ailk.eaap.op2.bo;

public class TechImpAttrSpec implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Integer techImpAttrSpecId;
	private Integer attrSpecId;
	private String commProCd;
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
	public Integer getTechImpAttrSpecId() {
		return techImpAttrSpecId;
	}
	public void setTechImpAttrSpecId(Integer techImpAttrSpecId) {
		this.techImpAttrSpecId = techImpAttrSpecId;
	}
	public Integer getAttrSpecId() {
		return attrSpecId;
	}
	public void setAttrSpecId(Integer attrSpecId) {
		this.attrSpecId = attrSpecId;
	}
	public String getCommProCd() {
		return commProCd;
	}
	public void setCommProCd(String commProCd) {
		this.commProCd = commProCd;
	}
}
