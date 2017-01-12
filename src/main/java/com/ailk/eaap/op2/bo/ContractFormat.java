package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.util.List;
import java.io.Serializable;
public class ContractFormat implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer tcpCtrFId;
	private Integer contractVersionId;
	private String reqRsp;
	private String conType;
	private String xsdHeaderFor;
	private String xsdFormat;
	private String xsdDemo;
	private Date createTime;
	private String state;
	private Date lastestTime;
	private String descriptor;
	private List<NodeDesc> nodeDescs;
	private List<Contract2AttrSpec> contract2AttrSpecs;
	private String xsdException;
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
	public void setTcpCtrFId(Integer tcpCtrFId){
		this.tcpCtrFId=tcpCtrFId;
	}
	public Integer getTcpCtrFId(){
		return this.tcpCtrFId;
	}
	public void setContractVersionId(Integer contractVersionId){
		this.contractVersionId=contractVersionId;
	}
	public Integer getContractVersionId(){
		return this.contractVersionId;
	}
	public void setReqRsp(String reqRsp){
		this.reqRsp=reqRsp;
	}
	public String getReqRsp(){
		return this.reqRsp;
	}
	public List<NodeDesc> getNodeDescs() {
		return nodeDescs;
	}
	public void setNodeDescs(List<NodeDesc> nodeDescs) {
		this.nodeDescs = nodeDescs;
	}
	public void setConType(String conType){
		this.conType=conType;
	}
	public String getConType(){
		return this.conType;
	}
	public void setXsdHeaderFor(String xsdHeaderFor){
		this.xsdHeaderFor=xsdHeaderFor;
	}
	public String getXsdHeaderFor(){
		return this.xsdHeaderFor;
	}
	public void setXsdFormat(String xsdFormat){
		this.xsdFormat=xsdFormat;
	}
	public String getXsdFormat(){
		return this.xsdFormat;
	}
	public void setXsdDemo(String xsdDemo){
		this.xsdDemo=xsdDemo;
	}
	public String getXsdDemo(){
		return this.xsdDemo;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setLastestTime(Date lastestTime){
		this.lastestTime=lastestTime;
	}
	public Date getLastestTime(){
		return this.lastestTime;
	}
	public void setDescriptor(String descriptor){
		this.descriptor=descriptor;
	}
	public String getDescriptor(){
		return this.descriptor;
	}
	public List<Contract2AttrSpec> getContract2AttrSpecs() {
		return contract2AttrSpecs;
	}
	public void setContract2AttrSpecs(List<Contract2AttrSpec> contract2AttrSpecs) {
		this.contract2AttrSpecs = contract2AttrSpecs;
	}
	public String getXsdException() {
		return xsdException;
	}
	public void setXsdException(String xsdException) {
		this.xsdException = xsdException;
	}
	
}
