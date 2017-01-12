/** 
 * Project Name:o2p-api-bo 
 * File Name:TransformerObj2Array.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2016年1月12日下午3:51:16 
 * Copyright (c) 2016, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.bo;  

import java.io.Serializable;
import java.util.List;

/** 
 * ClassName:TransformerObj2Array  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2016年1月12日 下午3:51:16  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public class TransformerObj2Array  implements Serializable{

	/** 
	 * serialVersionUID:TODO. 
	 * @since JDK 1.6 
	 */  
	private static final long serialVersionUID = -3321634942758606810L;
	private NodeDesc arrayNodeDesc;
	private List<NodeDescMapper> nodeDescMappers;
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
	public NodeDesc getArrayNodeDesc() {
		return arrayNodeDesc;
	}
	public void setArrayNodeDesc(NodeDesc arrayNodeDesc) {
		this.arrayNodeDesc = arrayNodeDesc;
	}
	public List<NodeDescMapper> getNodeDescMappers() {
		return nodeDescMappers;
	}
	public void setNodeDescMappers(List<NodeDescMapper> nodeDescMappers) {
		this.nodeDescMappers = nodeDescMappers;
	}
	
	
}
