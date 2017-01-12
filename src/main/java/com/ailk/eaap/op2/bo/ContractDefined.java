package com.ailk.eaap.op2.bo;

public class ContractDefined {
	
	//协议ID
	private Integer contractId;
	//协议名称
	private String name;
	//协议编码
	private String code;
	//协议基类
	private Integer baseContractId;
	//协议基类名称
	private String baseContractName;
	//协议描述
	private String contractDescriptor;
	
	//协议版本ID
	private Integer contractVersionId;
	//协议版本
	private String version;
	//是否需要校验
	private String isNeedCheckVersion;	
	//协议版本描述
	private String contractVersionDescriptor;
	
    //文档对应协议ID
	private Integer docContrId;
	//协议文档名称
	private String docName;
	//协议文档ID
	private Integer contractDocId;
	//文档对应协议描述
	private String docContractDescriptor;
	//协议文档路径
	private String docPath;
	
	//请求协议格式ID
	private Integer reqContractFormatId;
	//请求协议格式类型
	private String reqConType;
	//请求协议格式头
	private String reqXsdHeaderFor;
	//请求协议格式体
	private String reqXsdFormat;
	//请求协议描述
	private String reqDescriptor;
	
	//请求节点格式ID
	private Integer reqNodeDescId[];
	//请求节点格式名称
	private String reqNodeDescName[];
	//请求节点路径
	private String reqNodePath[];
	//请求节点类型
	private String reqNodeType[];
	//请求节点类型约束
	private String reqNodeTypeCons[];
	//请求节点值约束类型
	private String reqNevlConsType[];
	//请求节点值约束表达式
	private String reqNevlConsValue[];
	//请求节点长度约束
	private String reqNodeLengthCons[];
	//请求节点个数约束
	private String reqNodeNumberCons[];
	//请求是否纳入签名
	private String reqIsNeedSign[];
	//是否需要校验
	private String reqIsNeedCheck[];
	//请求文件ID
	private String reqFileShareId; 

	//响应协议格式ID
	private Integer rspContractFormatId;
	//响应协议格式类型
	private String rspConType;
	//响应协议格式头
	private String rspXsdHeaderFor;
	//响应协议格式体
	private String rspXsdFormat;
	//响应协议描述
	private String rspDescriptor;
	//异常响应报文模板
	private String rspXsdException;

	//响应节点格式ID
	private Integer rspNodeDescId[];
	//响应节点格式名称
	private String rspNodeDescName[];
	//响应节点路径
	private String rspNodePath[];
	//响应节点类型
	private String rspNodeType[];
	//响应节点类型约束
	private String rspNodeTypeCons[];
	//响应节点值约束类型
	private String rspNevlConsType[];
	//响应节点值约束表达式
	private String rspNevlConsValue[];
	//响应节点长度约束
	private String rspNodeLengthCons[];
	//响应节点个数约束
	private String rspNodeNumberCons[];
	//响应是否纳入签名
	private String rspIsNeedSign[];
	//响应是否需要校验
	private String rspIsNeedCheck[];
	//响应文件ID
	private String rspFileShareId; 

	//模板定义方式
	private String templateDefMode;
	//模板头部内容
	private String templateHeader;
	//模板Body内容
	private String templateBody;


	//租户ID
	private Integer tenantId;

	
	public Integer getTenantId() {
		return tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	public Integer getContractId() {
		return contractId;
	}

	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getBaseContractId() {
		return baseContractId;
	}

	public void setBaseContractId(Integer baseContractId) {
		this.baseContractId = baseContractId;
	}

	public String getContractDescriptor() {
		return contractDescriptor;
	}

	public void setContractDescriptor(String contractDescriptor) {
		this.contractDescriptor = contractDescriptor;
	}

	public Integer getContractVersionId() {
		return contractVersionId;
	}

	public void setContractVersionId(Integer contractVersionId) {
		this.contractVersionId = contractVersionId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getIsNeedCheckVersion() {
		return isNeedCheckVersion;
	}

	public void setIsNeedCheckVersion(String isNeedCheckVersion) {
		this.isNeedCheckVersion = isNeedCheckVersion;
	}

	public String getContractVersionDescriptor() {
		return contractVersionDescriptor;
	}

	public void setContractVersionDescriptor(String contractVersionDescriptor) {
		this.contractVersionDescriptor = contractVersionDescriptor;
	}

	public Integer getDocContrId() {
		return docContrId;
	}

	public void setDocContrId(Integer docContrId) {
		this.docContrId = docContrId;
	}

	public String getDocContractDescriptor() {
		return docContractDescriptor;
	}

	public void setDocContractDescriptor(String docContractDescriptor) {
		this.docContractDescriptor = docContractDescriptor;
	}

	public Integer getReqContractFormatId() {
		return reqContractFormatId;
	}

	public void setReqContractFormatId(Integer reqContractFormatId) {
		this.reqContractFormatId = reqContractFormatId;
	}

	public String getReqConType() {
		return reqConType;
	}

	public void setReqConType(String reqConType) {
		this.reqConType = reqConType;
	}

	public String getReqXsdHeaderFor() {
		return reqXsdHeaderFor;
	}

	public void setReqXsdHeaderFor(String reqXsdHeaderFor) {
		this.reqXsdHeaderFor = reqXsdHeaderFor;
	}

	public String getReqXsdFormat() {
		return reqXsdFormat;
	}

	public void setReqXsdFormat(String reqXsdFormat) {
		this.reqXsdFormat = reqXsdFormat;
	}

	public String getReqDescriptor() {
		return reqDescriptor;
	}

	public void setReqDescriptor(String reqDescriptor) {
		this.reqDescriptor = reqDescriptor;
	}

	public Integer getRspContractFormatId() {
		return rspContractFormatId;
	}

	public void setRspContractFormatId(Integer rspContractFormatId) {
		this.rspContractFormatId = rspContractFormatId;
	}

	public String getRspConType() {
		return rspConType;
	}

	public void setRspConType(String rspConType) {
		this.rspConType = rspConType;
	}

	public String getRspXsdHeaderFor() {
		return rspXsdHeaderFor;
	}

	public void setRspXsdHeaderFor(String rspXsdHeaderFor) {
		this.rspXsdHeaderFor = rspXsdHeaderFor;
	}

	public String getRspXsdFormat() {
		return rspXsdFormat;
	}

	public void setRspXsdFormat(String rspXsdFormat) {
		this.rspXsdFormat = rspXsdFormat;
	}

	public String getRspDescriptor() {
		return rspDescriptor;
	}

	public void setRspDescriptor(String rspDescriptor) {
		this.rspDescriptor = rspDescriptor;
	}

	public Integer getContractDocId() {
		return contractDocId;
	}

	public void setContractDocId(Integer contractDocId) {
		this.contractDocId = contractDocId;
	}

	public Integer[] getReqNodeDescId() {
		return reqNodeDescId;
	}

	public void setReqNodeDescId(Integer[] reqNodeDescId) {
		this.reqNodeDescId = reqNodeDescId;
	}

	public String[] getReqNodeDescName() {
		return reqNodeDescName;
	}

	public void setReqNodeDescName(String[] reqNodeDescName) {
		this.reqNodeDescName = reqNodeDescName;
	}

	public String[] getReqNodePath() {
		return reqNodePath;
	}

	public void setReqNodePath(String[] reqNodePath) {
		this.reqNodePath = reqNodePath;
	}

	public String[] getReqNodeTypeCons() {
		return reqNodeTypeCons;
	}

	public void setReqNodeTypeCons(String[] reqNodeTypeCons) {
		this.reqNodeTypeCons = reqNodeTypeCons;
	}

	public String[] getReqNevlConsType() {
		return reqNevlConsType;
	}

	public void setReqNevlConsType(String[] reqNevlConsType) {
		this.reqNevlConsType = reqNevlConsType;
	}

	public String[] getReqNevlConsValue() {
		return reqNevlConsValue;
	}

	public void setReqNevlConsValue(String[] reqNevlConsValue) {
		this.reqNevlConsValue = reqNevlConsValue;
	}

	public Integer[] getRspNodeDescId() {
		return rspNodeDescId;
	}

	public void setRspNodeDescId(Integer[] rspNodeDescId) {
		this.rspNodeDescId = rspNodeDescId;
	}

	public String[] getRspNodeDescName() {
		return rspNodeDescName;
	}

	public void setRspNodeDescName(String[] rspNodeDescName) {
		this.rspNodeDescName = rspNodeDescName;
	}

	public String[] getRspNodePath() {
		return rspNodePath;
	}

	public void setRspNodePath(String[] rspNodePath) {
		this.rspNodePath = rspNodePath;
	}

	public String[] getRspNodeTypeCons() {
		return rspNodeTypeCons;
	}

	public void setRspNodeTypeCons(String[] rspNodeTypeCons) {
		this.rspNodeTypeCons = rspNodeTypeCons;
	}

	public String[] getRspNevlConsType() {
		return rspNevlConsType;
	}

	public void setRspNevlConsType(String[] rspNevlConsType) {
		this.rspNevlConsType = rspNevlConsType;
	}

	public String[] getRspNevlConsValue() {
		return rspNevlConsValue;
	}

	public void setRspNevlConsValue(String[] rspNevlConsValue) {
		this.rspNevlConsValue = rspNevlConsValue;
	}

	public String[] getRspNodeType() {
		return rspNodeType;
	}

	public void setRspNodeType(String[] rspNodeType) {
		this.rspNodeType = rspNodeType;
	}

	public String[] getReqNodeType() {
		return reqNodeType;
	}

	public void setReqNodeType(String[] reqNodeType) {
		this.reqNodeType = reqNodeType;
	}

	public String getBaseContractName() {
		return baseContractName;
	}

	public void setBaseContractName(String baseContractName) {
		this.baseContractName = baseContractName;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String[] getReqNodeLengthCons() {
		return reqNodeLengthCons;
	}

	public void setReqNodeLengthCons(String[] reqNodeLengthCons) {
		this.reqNodeLengthCons = reqNodeLengthCons;
	}

	public String[] getReqNodeNumberCons() {
		return reqNodeNumberCons;
	}

	public void setReqNodeNumberCons(String[] reqNodeNumberCons) {
		this.reqNodeNumberCons = reqNodeNumberCons;
	}

	public String[] getReqIsNeedSign() {
		return reqIsNeedSign;
	}

	public void setReqIsNeedSign(String[] reqIsNeedSign) {
		this.reqIsNeedSign = reqIsNeedSign;
	}

	public String[] getRspNodeLengthCons() {
		return rspNodeLengthCons;
	}

	public void setRspNodeLengthCons(String[] rspNodeLengthCons) {
		this.rspNodeLengthCons = rspNodeLengthCons;
	}

	public String[] getRspNodeNumberCons() {
		return rspNodeNumberCons;
	}

	public void setRspNodeNumberCons(String[] rspNodeNumberCons) {
		this.rspNodeNumberCons = rspNodeNumberCons;
	}

	public String[] getRspIsNeedSign() {
		return rspIsNeedSign;
	}

	public void setRspIsNeedSign(String[] rspIsNeedSign) {
		this.rspIsNeedSign = rspIsNeedSign;
	}

	public String[] getReqIsNeedCheck() {
		return reqIsNeedCheck;
	}

	public void setReqIsNeedCheck(String[] reqIsNeedCheck) {
		this.reqIsNeedCheck = reqIsNeedCheck;
	}

	public String[] getRspIsNeedCheck() {
		return rspIsNeedCheck;
	}

	public void setRspIsNeedCheck(String[] rspIsNeedCheck) {
		this.rspIsNeedCheck = rspIsNeedCheck;
	}

	public String getReqFileShareId() {
		return reqFileShareId;
	}

	public void setReqFileShareId(String reqFileShareId) {
		this.reqFileShareId = reqFileShareId;
	}

	public String getRspFileShareId() {
		return rspFileShareId;
	}

	public void setRspFileShareId(String rspFileShareId) {
		this.rspFileShareId = rspFileShareId;
	}

	public String getDocPath() {
		return docPath;
	}
	public void setDocPath(String docPath) {
		this.docPath = docPath;
	}

	public String getRspXsdException() {
		return rspXsdException;
	}
	public void setRspXsdException(String rspXsdException) {
		this.rspXsdException = rspXsdException;
	}

	public String getTemplateDefMode() {
		return templateDefMode;
	}
	public void setTemplateDefMode(String templateDefMode) {
		this.templateDefMode = templateDefMode;
	}
	public String getTemplateHeader() {
		return templateHeader;
	}
	public void setTemplateHeader(String templateHeader) {
		this.templateHeader = templateHeader;
	}
	public String getTemplateBody() {
		return templateBody;
	}
	public void setTemplateBody(String templateBody) {
		this.templateBody = templateBody;
	}


}
