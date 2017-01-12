package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class NodePathConfig implements Serializable{
private static final long serialVersionUID = 1L;
	private Long pathId;
	private Long nodeOperId;
	private String xmlFrom;
	private String xmlPath;
	private String sortOrder;
	private String preSepChars;
	private String sufSepChars;
	private String jointType;
	private String state;
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

	public void setPathId(Long pathId){
		this.pathId=pathId;
	}
	public Long getPathId(){
		return this.pathId;
	}
	public void setNodeOperId(Long nodeOperId){
		this.nodeOperId=nodeOperId;
	}
	public Long getNodeOperId(){
		return this.nodeOperId;
	}
	public void setXmlFrom(String xmlFrom){
		this.xmlFrom=xmlFrom;
	}
	public String getXmlFrom(){
		return this.xmlFrom;
	}
	public void setXmlPath(String xmlPath){
		this.xmlPath=xmlPath;
	}
	public String getXmlPath(){
		return this.xmlPath;
	}
	public void setSortOrder(String sortOrder){
		this.sortOrder=sortOrder;
	}
	public String getSortOrder(){
		return this.sortOrder;
	}
	public void setPreSepChars(String preSepChars){
		this.preSepChars=preSepChars;
	}
	public String getPreSepChars(){
		return this.preSepChars;
	}
	public void setSufSepChars(String sufSepChars){
		this.sufSepChars=sufSepChars;
	}
	public String getSufSepChars(){
		return this.sufSepChars;
	}
	public void setJointType(String jointType){
		this.jointType=jointType;
	}
	public String getJointType(){
		return this.jointType;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
}
