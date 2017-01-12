/** 
 * Project Name:o2p-api-bo 
 * File Name:TransformerArray2Array.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2016年1月12日下午2:54:13 
 * Copyright (c) 2016, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.bo;  

import java.io.Serializable;
import java.util.List;

/** 
 * ClassName:TransformerArray2Array  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2016年1月12日 下午2:54:13  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public class TransformerArray2Array  implements Serializable{

	/** 
	 * serialVersionUID:TODO. 
	 * @since JDK 1.6 
	 */  
	private static final long serialVersionUID = -8089281429722960891L;
	private NodeDesc srcArrayNodeDesc;
	private NodeDesc tarArrayNodeDesc;
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
	public NodeDesc getSrcArrayNodeDesc() {
		return srcArrayNodeDesc;
	}
	public void setSrcArrayNodeDesc(NodeDesc srcArrayNodeDesc) {
		this.srcArrayNodeDesc = srcArrayNodeDesc;
	}
	public NodeDesc getTarArrayNodeDesc() {
		return tarArrayNodeDesc;
	}
	public void setTarArrayNodeDesc(NodeDesc tarArrayNodeDesc) {
		this.tarArrayNodeDesc = tarArrayNodeDesc;
	}
	public List<NodeDescMapper> getNodeDescMappers() {
		return nodeDescMappers;
	}
	public void setNodeDescMappers(List<NodeDescMapper> nodeDescMappers) {
		this.nodeDescMappers = nodeDescMappers;
	}
	
	
}
