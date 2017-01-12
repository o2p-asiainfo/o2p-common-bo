package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class ItemCnt implements Serializable{

	/** 
	*@Title ItcmCnt.java 
	*@description TODO 
	*@time 31 Aug 2016 11:01:13 
	*@author yangbl 
	*@version 1.0 
	**/ 
	private static final long serialVersionUID = 3493748114469572659L;
	
	private String itemCntId;
	private String itemCode;
	private String itemType;
	private Integer tenantId;
	private Integer pageView;
	private Integer collect_cnt;
	
	public String getItemCntId() {
		return itemCntId;
	}
	public void setItemCntId(String itemCntId) {
		this.itemCntId = itemCntId;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public Integer getPageView() {
		return pageView;
	}
	public void setPageView(Integer pageView) {
		this.pageView = pageView;
	}
	public Integer getCollect_cnt() {
		return collect_cnt;
	}
	public void setCollect_cnt(Integer collect_cnt) {
		this.collect_cnt = collect_cnt;
	}
	
	
}
