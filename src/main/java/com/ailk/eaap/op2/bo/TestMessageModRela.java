package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class TestMessageModRela implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer relaId;
	private Integer objId;
	private String objType;
	private Date createDate;
	private Integer personId;
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
	public Integer getRelaId() {
		return relaId;
	}
	public void setRelaId(Integer relaId) {
		this.relaId = relaId;
	}
	public Integer getObjId() {
		return objId;
	}
	public void setObjId(Integer objId) {
		this.objId = objId;
	}
	public String getObjType() {
		return objType;
	}
	public void setObjType(String objType) {
		this.objType = objType;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

}
