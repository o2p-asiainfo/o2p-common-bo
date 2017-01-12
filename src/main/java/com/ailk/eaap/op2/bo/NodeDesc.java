package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class NodeDesc implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer nodeDescId;
	private Integer tcpCtrFId;
	private Integer parentNodeId;
	private String nodeName;
	private String nodeCode;
	private String nodePath;
	private String nodeType;
	private String nodeLengthCons;
	private String nodeTypeCons;
	private String nodeNumberCons;
	private String nevlConsType;
	private String nevlConsValue;
	private String nevlConsDesc;
	private String isNeedCheck;
	private String isNeedSign;
	private String state;
	private Date createTime;
	private Date lastestTime;
	private String description;
	private String javaField;
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
	public Integer getNodeDescId() {
		return nodeDescId;
	}
	public String getIsNeedSign() {
		return isNeedSign;
	}
	public void setIsNeedSign(String isNeedSign) {
		this.isNeedSign = isNeedSign;
	}
	public void setNodeDescId(Integer nodeDescId) {
		this.nodeDescId = nodeDescId;
	}
	public Integer getTcpCtrFId() {
		return tcpCtrFId;
	}
	public void setTcpCtrFId(Integer tcpCtrFId) {
		this.tcpCtrFId = tcpCtrFId;
	}
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	public String getNodeCode() {
		return nodeCode;
	}
	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}
	public String getNodePath() {
		return nodePath;
	}
	public void setNodePath(String nodePath) {
		this.nodePath = nodePath;
	}
	public String getNodeType() {
		return nodeType;
	}
	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}
	public String getNodeLengthCons() {
		return nodeLengthCons;
	}
	public void setNodeLengthCons(String nodeLengthCons) {
		this.nodeLengthCons = nodeLengthCons;
	}
	public String getNodeTypeCons() {
		return nodeTypeCons;
	}
	public void setNodeTypeCons(String nodeTypeCons) {
		this.nodeTypeCons = nodeTypeCons;
	}
	public String getNodeNumberCons() {
		return nodeNumberCons;
	}
	public void setNodeNumberCons(String nodeNumberCons) {
		this.nodeNumberCons = nodeNumberCons;
	}
	public String getNevlConsType() {
		return nevlConsType;
	}
	public void setNevlConsType(String nevlConsType) {
		this.nevlConsType = nevlConsType;
	}
	public String getNevlConsValue() {
		return nevlConsValue;
	}
	public void setNevlConsValue(String nevlConsValue) {
		this.nevlConsValue = nevlConsValue;
	}
	public String getIsNeedCheck() {
		return isNeedCheck;
	}
	public void setIsNeedCheck(String isNeedCheck) {
		this.isNeedCheck = isNeedCheck;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastestTime() {
		return lastestTime;
	}
	public void setLastestTime(Date lastestTime) {
		this.lastestTime = lastestTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNevlConsDesc() {
		return nevlConsDesc;
	}
	public void setNevlConsDesc(String nevlConsDesc) {
		this.nevlConsDesc = nevlConsDesc;
	}
	public String getJavaField() {
		return javaField;
	}
	public void setJavaField(String javaField) {
		this.javaField = javaField;
	}
	public Integer getParentNodeId() {
		return parentNodeId;
	}
	public void setParentNodeId(Integer parentNodeId) {
		this.parentNodeId = parentNodeId;
	}
    
}
