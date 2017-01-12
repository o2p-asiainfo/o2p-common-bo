package com.ailk.eaap.op2.bo;

public class UserDefined {
	//业务名称
	private String bizName;	
	//服务名称
	private String serviceName;	
	//目录Id
	private String directoryId;
	//请求地址
	private String attrSpecValue;
	//协议请求格式
	private String conType;
	//通讯协议
	private String commProcd;
	//协议结构
	private String xsdFormat;
	//协议样例
	private String xsdDemo;		
	//介绍
	private String descriptor;	
	//组件ID
	private String componentId;
	
	private String techImpAttId;
	
	private String techImpId;
	
	private String tcpCtrFid;
	//协议ID
	private String contractId;	
	//协议版本ID
	private String contractVersionId;
	
	private String dirSerlistId;
	//服务ID
	private String serviceId;
	//协议编码
	private String contractCode;
	//协议版本编码
	private String contractVersionCode;
	//请求或者响应
	private String reqRsp;
	
	private String fileShareId; 
	
	private String isNeedCheck[];
	
	private String nodeLength[];
	
	private String nodeNumber[];
	
	private String nevlConsType[];
	
	private String nelConsValue[];
	
	private String nevlConsDesc[];
	
	private String nodeDescId[];	
	
	private String nodeTypeCons[];
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
	
	public String getBizName() {
		return bizName;
	}
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getAttrSpecValue() {
		return attrSpecValue;
	}
	public void setAttrSpecValue(String attrSpecValue) {
		this.attrSpecValue = attrSpecValue;
	}
	public String getConType() {
		return conType;
	}
	public void setConType(String conType) {
		this.conType = conType;
	}
	public String getCommProcd() {
		return commProcd;
	}
	public void setCommProcd(String commProcd) {
		this.commProcd = commProcd;
	}
	public String getXsdFormat() {
		return xsdFormat;
	}
	public void setXsdFormat(String xsdFormat) {
		this.xsdFormat = xsdFormat;
	}
	public String getXsdDemo() {
		return xsdDemo;
	}
	public void setXsdDemo(String xsdDemo) {
		this.xsdDemo = xsdDemo;
	}
	public String getDirectoryId() {
		return directoryId;
	}
	public void setDirectoryId(String directoryId) {
		this.directoryId = directoryId;
	}
	public String getDescriptor() {
		return descriptor;
	}
	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
	}
	public String getComponentId() {
		return componentId;
	}
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}
	public String[] getNodeLength() {
		return nodeLength;
	}
	public void setNodeLength(String[] nodeLength) {
		this.nodeLength = nodeLength;
	}
	public String[] getNodeNumber() {
		return nodeNumber;
	}
	public void setNodeNumber(String[] nodeNumber) {
		this.nodeNumber = nodeNumber;
	}
	public String[] getNevlConsType() {
		return nevlConsType;
	}
	public void setNevlConsType(String[] nevlConsType) {
		this.nevlConsType = nevlConsType;
	}
	public String[] getNelConsValue() {
		return nelConsValue;
	}
	public void setNelConsValue(String[] nelConsValue) {
		this.nelConsValue = nelConsValue;
	}
	public String[] getNevlConsDesc() {
		return nevlConsDesc;
	}
	public void setNevlConsDesc(String[] nevlConsDesc) {
		this.nevlConsDesc = nevlConsDesc;
	}
	public String[] getNodeDescId() {
		return nodeDescId;
	}
	public void setNodeDescId(String[] nodeDescId) {
		this.nodeDescId = nodeDescId;
	}
	public String getTechImpAttId() {
		return techImpAttId;
	}
	public void setTechImpAttId(String techImpAttId) {
		this.techImpAttId = techImpAttId;
	}
	public String getTcpCtrFid() {
		return tcpCtrFid;
	}
	public void setTcpCtrFid(String tcpCtrFid) {
		this.tcpCtrFid = tcpCtrFid;
	}
	public String getContractId() {
		return contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	public String getDirSerlistId() {
		return dirSerlistId;
	}
	public void setDirSerlistId(String dirSerlistId) {
		this.dirSerlistId = dirSerlistId;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String[] getIsNeedCheck() {
		return isNeedCheck;
	}
	public void setIsNeedCheck(String[] isNeedCheck) {
		this.isNeedCheck = isNeedCheck;
	}
	public String[] getNodeTypeCons() {
		return nodeTypeCons;
	}
	public void setNodeTypeCons(String[] nodeTypeCons) {
		this.nodeTypeCons = nodeTypeCons;
	}
	public String getContractCode() {
		return contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}
	public String getReqRsp() {
		return reqRsp;
	}
	public void setReqRsp(String reqRsp) {
		this.reqRsp = reqRsp;
	}
	public String getContractVersionId() {
		return contractVersionId;
	}
	public void setContractVersionId(String contractVersionId) {
		this.contractVersionId = contractVersionId;
	}
	public String getTechImpId() {
		return techImpId;
	}
	public void setTechImpId(String techImpId) {
		this.techImpId = techImpId;
	}
	public String getContractVersionCode() {
		return contractVersionCode;
	}
	public void setContractVersionCode(String contractVersionCode) {
		this.contractVersionCode = contractVersionCode;
	}
	public String getFileShareId() {
		return fileShareId;
	}
	public void setFileShareId(String fileShareId) {
		this.fileShareId = fileShareId;
	}
	
}
