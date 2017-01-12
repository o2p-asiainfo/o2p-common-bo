/** 
 * Project Name:o2p-common-bo 
 * File Name:WorkTaskContion.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2015年8月26日下午3:04:21 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.bo;  

import java.util.Date;

/** 
 * ClassName:WorkTaskContion  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年8月26日 下午3:04:21  
 * @author   m 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public class WorkTaskContion {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String confId;
	private String contionKey;
	private String contionValue;
	private Date createDate;
	private String transtionId;
    private String fromId;
    private String toId;
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
    
    
	public String getFromId() {
		return fromId;
	}
	public void setFromId(String fromId) {
		this.fromId = fromId;
	}
	public String getToId() {
		return toId;
	}
	public void setToId(String toId) {
		this.toId = toId;
	}
	public String getTranstionId() {
		return transtionId;
	}
	public void setTranstionId(String transtionId) {
		this.transtionId = transtionId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getConfId() {
		return confId;
	}
	public void setConfId(String confId) {
		this.confId = confId;
	}
	public String getContionKey() {
		return contionKey;
	}
	public void setContionKey(String contionKey) {
		this.contionKey = contionKey;
	}
	public String getContionValue() {
		return contionValue;
	}
	public void setContionValue(String contionValue) {
		this.contionValue = contionValue;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
 
	
	

}
