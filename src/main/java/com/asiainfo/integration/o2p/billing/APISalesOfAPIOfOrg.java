/** 
 * Project Name:o2p-common-bo 
 * File Name:SalesOfAPIOfOrg.java 
 * Package Name:com.asiainfo.integration.o2p.billing 
 * Date:2014年12月24日下午3:09:17 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.asiainfo.integration.o2p.billing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:SalesOfAPIOfOrg API与销售品
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年12月24日 下午3:09:17 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */

//API所属销售品的数据结构
public class APISalesOfAPIOfOrg implements Serializable {
	private static final long serialVersionUID = 1L;

	private int orgId;
	private int appId;
	private int apiId;
	private List<APISalesOfOrg> salesOfOrgList = new ArrayList<APISalesOfOrg>();


	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public int getApiId() {
		return apiId;
	}

	public void setApiId(int apiId) {
		this.apiId = apiId;
	}

	public List<APISalesOfOrg> getSalesOfOrgList() {
		return salesOfOrgList;
	}

	public void setSalesOfOrgList(List<APISalesOfOrg> salesOfOrgList) {
		this.salesOfOrgList = salesOfOrgList;
	}

}
