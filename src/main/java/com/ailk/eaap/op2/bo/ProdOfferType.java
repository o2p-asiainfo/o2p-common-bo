package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ProdOfferType implements Serializable{
private static final long serialVersionUID = 1L;
	private String cd;
	private String name;
	private String explain;
	private String statusCd;
	private Date statusDate;
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
	public void setStatusDate(Date statusDate){
		this.statusDate=statusDate;
	}
	public Date getStatusDate(){
		return this.statusDate;
	}
	public void setStatusCd(String statusCd){
		this.statusCd=statusCd;
	}
	public String getStatusCd(){
		return this.statusCd;
	}
	public String getCd() {
		return cd;
	}
	public void setCd(String cd) {
		this.cd = cd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
}
