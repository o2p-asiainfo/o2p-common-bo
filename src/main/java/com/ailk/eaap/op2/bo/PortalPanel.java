package com.ailk.eaap.op2.bo;

import java.util.Date;

public class PortalPanel implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private Integer portalPanelId;
	private Integer sysPersonId;
	private String title;
	private Integer displaySeq;
	private String path;
	private String attr;
	private String state;
	private Date stateTime;
	private Date createTime;
	private String tips;
	private String panelType;

	private Integer tenantId;

	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getStateTime() {
		return stateTime;
	}

	public void setStateTime(Date stateTime) {
		this.stateTime = stateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getPanelType() {
		return panelType;
	}

	public void setPanelType(String panelType) {
		this.panelType = panelType;
	}

	public PortalPanel(){
	}

	public Integer getPortalPanelId() {
		return portalPanelId;
	}

	public void setPortalPanelId(Integer portalPanelId) {
		this.portalPanelId = portalPanelId;
	}

	public Integer getSysPersonId() {
		return sysPersonId;
	}

	public void setSysPersonId(Integer sysPersonId) {
		this.sysPersonId = sysPersonId;
	}

	public Integer getDisplaySeq() {
		return displaySeq;
	}

	public void setDisplaySeq(Integer displaySeq) {
		this.displaySeq = displaySeq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}

	public Integer getTenantId() {
		return tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	
}
