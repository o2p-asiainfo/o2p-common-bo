package com.ailk.eaap.op2.bo;

import java.io.Serializable;
public class Channel implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer channelId;
	private String channelName;
	private String channelMainType;
	private String channelLevelCd;
	private String channelTypeCd;
	private String channelSubTypeCd;
	private String statusCd;
	private Integer parentChannelId;
	private Integer orgId;
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
	
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getChannelMainType() {
		return channelMainType;
	}
	public void setChannelMainType(String channelMainType) {
		this.channelMainType = channelMainType;
	}
	public String getChannelLevelCd() {
		return channelLevelCd;
	}
	public void setChannelLevelCd(String channelLevelCd) {
		this.channelLevelCd = channelLevelCd;
	}
	public String getChannelTypeCd() {
		return channelTypeCd;
	}
	public void setChannelTypeCd(String channelTypeCd) {
		this.channelTypeCd = channelTypeCd;
	}
	public String getChannelSubTypeCd() {
		return channelSubTypeCd;
	}
	public void setChannelSubTypeCd(String channelSubTypeCd) {
		this.channelSubTypeCd = channelSubTypeCd;
	}
	public String getStatusCd() {
		return statusCd;
	}
	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}
	public Integer getParentChannelId() {
		return parentChannelId;
	}
	public void setParentChannelId(Integer parentChannelId) {
		this.parentChannelId = parentChannelId;
	}
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
