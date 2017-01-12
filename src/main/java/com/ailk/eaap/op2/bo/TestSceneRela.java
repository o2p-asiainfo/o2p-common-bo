package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class TestSceneRela implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer relaId;
	private Integer sceneId;
	private Integer objId;
	private String objType;
	private Integer modId;
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
	public Integer getSceneId() {
		return sceneId;
	}
	public void setSceneId(Integer sceneId) {
		this.sceneId = sceneId;
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
	public Integer getModId() {
		return modId;
	}
	public void setModId(Integer modId) {
		this.modId = modId;
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
