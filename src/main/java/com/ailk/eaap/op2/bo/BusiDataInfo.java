/** 
 * Project Name:o2p-common-bo-tags 
 * File Name:BusiDataInfo.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2016年3月13日下午5:18:44 
 * Copyright (c) 2016, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.bo;  

import java.io.Serializable;
import java.util.Date;

/** 
 * ClassName:BusiDataInfo  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2016年3月13日 下午5:18:44  
 * @author   wushuzhen 
 * @version   
 * @since    JDK 1.7 
 *        
 */
public class BusiDataInfo implements Serializable{
	private static final long serialVersionUID = 1L;
    private Integer businessId;
    /**
     * 业务名称
     */
    private String businessName;
    
    /**
     * 业务值
     */
    private String businessValue;
    
    /**
     * 业务所属模块
     */
    private String businessModule;
    
    /**
     * 业务描述
     */
    private String businessDesc;
    
    /**
     * 创建时间
     */
	private Date createDate;
	
	/**
	 * 更新时间
	 */
	private Date updateDate;
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

	public Integer getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessValue() {
		return businessValue;
	}

	public void setBusinessValue(String businessValue) {
		this.businessValue = businessValue;
	}

	public String getBusinessModule() {
		return businessModule;
	}

	public void setBusinessModule(String businessModule) {
		this.businessModule = businessModule;
	}

	public String getBusinessDesc() {
		return businessDesc;
	}

	public void setBusinessDesc(String businessDesc) {
		this.businessDesc = businessDesc;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}
