package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class TransformerRule implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4407210599514160114L;
	private Integer id;
	private String name;
	private ContractFormat srcContractFormat;
	private ContractFormat tarContractFormat;
	private ContractFormatEx tarContractFormatEx;
	private Integer transformerType;
	private String scriptContent;
	private String state;
	private List<NodeDescMapper> nodeDescMappers;
	private List<ParamVarMap> paramVarMaps;
    private List<ContractAdapter2AttrSpec> contractAdapter2AttrSpecs;
    private List<ContractAdapterEndpoint> replaceListContractAdapterEndpoint;
    private List<ContractAdapterEndpoint> transListContractAdapterEndpoint;
    private Map<Integer, Integer> nodeDescToEndpointMap;
    private Map<Integer, ContractFormatEx> nodeDescToContractFormatMap;
    private List<Object> rootNodeDescList;
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
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ContractFormat getSrcContractFormat() {
		return srcContractFormat;
	}
	public void setSrcContractFormat(ContractFormat srcContractFormat) {
		this.srcContractFormat = srcContractFormat;
	}
	public ContractFormat getTarContractFormat() {
		return tarContractFormat;
	}
	public void setTarContractFormat(ContractFormat tarContractFormat) {
		this.tarContractFormat = tarContractFormat;
	}
	public Integer getTransformerType() {
		return transformerType;
	}
	public void setTransformerType(Integer transformerType) {
		this.transformerType = transformerType;
	}
	public String getScriptContent() {
		return scriptContent;
	}
	public void setScriptContent(String scriptContent) {
		this.scriptContent = scriptContent;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public List<NodeDescMapper> getNodeDescMappers() {
		return nodeDescMappers;
	}
	public void setNodeDescMappers(List<NodeDescMapper> nodeDescMappers) {
		this.nodeDescMappers = nodeDescMappers;
	}
	public List<ParamVarMap> getParamVarMaps() {
		return paramVarMaps;
	}
	public void setParamVarMaps(List<ParamVarMap> paramVarMaps) {
		this.paramVarMaps = paramVarMaps;
	}

    public List<ContractAdapter2AttrSpec> getContractAdapter2AttrSpecs() {
        return contractAdapter2AttrSpecs;
    }

    public void setContractAdapter2AttrSpecs(List<ContractAdapter2AttrSpec> contractAdapter2AttrSpecs) {
        this.contractAdapter2AttrSpecs = contractAdapter2AttrSpecs;
    }
	public List<ContractAdapterEndpoint> getReplaceListContractAdapterEndpoint() {
		return replaceListContractAdapterEndpoint;
	}
	public void setReplaceListContractAdapterEndpoint(
			List<ContractAdapterEndpoint> replaceListContractAdapterEndpoint) {
		this.replaceListContractAdapterEndpoint = replaceListContractAdapterEndpoint;
	}
	public List<ContractAdapterEndpoint> getTransListContractAdapterEndpoint() {
		return transListContractAdapterEndpoint;
	}
	public void setTransListContractAdapterEndpoint(
			List<ContractAdapterEndpoint> transListContractAdapterEndpoint) {
		this.transListContractAdapterEndpoint = transListContractAdapterEndpoint;
	}
	public Map<Integer, Integer> getNodeDescToEndpointMap() {
		return nodeDescToEndpointMap;
	}
	public void setNodeDescToEndpointMap(Map<Integer, Integer> nodeDescToEndpointMap) {
		this.nodeDescToEndpointMap = nodeDescToEndpointMap;
	}
	public Map<Integer, ContractFormatEx> getNodeDescToContractFormatMap() {
		return nodeDescToContractFormatMap;
	}
	public void setNodeDescToContractFormatMap(
			Map<Integer, ContractFormatEx> nodeDescToContractFormatMap) {
		this.nodeDescToContractFormatMap = nodeDescToContractFormatMap;
	}
	public ContractFormatEx getTarContractFormatEx() {
		return tarContractFormatEx;
	}
	public void setTarContractFormatEx(ContractFormatEx tarContractFormatEx) {
		this.tarContractFormatEx = tarContractFormatEx;
	}
	public List<Object> getRootNodeDescList() {
		return rootNodeDescList;
	}
	public void setRootNodeDescList(List<Object> rootNodeDescList) {
		this.rootNodeDescList = rootNodeDescList;
	}
    
}
