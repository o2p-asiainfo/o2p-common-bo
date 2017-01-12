package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
public class TechImpl implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer techImplId;
	private String techImplName;
	private Integer techImpConPoId;
	private String componentId;
	private String componentCode;
	private String commProCd;
	private Date regTime;
	private String usealbeState;
	private Date laestTime;
	private Map<String,String> attrMap = new Hashtable<String,String>();
	private List<CtlCounterms2Comp> ctls;
	private TechImpContralPo tico;
	private Integer SerTechId;
	private Integer ServiceId;
	private String serviceCode;
	private String serviceVersion;
	private String serTechStatus;
	private Service service;
	private String exceptionCode;
	private List<TechImplNode> TechImplNode;
	private List<ProofEffect> proofEffectList;
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
	

	public List<TechImplNode> getTechImplNode() {
		return TechImplNode;
	}
	public void setTechImplNode(List<TechImplNode> techImplNode) {
		TechImplNode = techImplNode;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceVersion() {
		return serviceVersion;
	}
	public String getExceptionCode() {
		return exceptionCode;
	}
	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}
	public Integer getSerTechId() {
		return SerTechId;
	}
	public void setSerTechId(Integer serTechId) {
		SerTechId = serTechId;
	}
	public Integer getServiceId() {
		return ServiceId;
	}
	public void setServiceId(Integer serviceId) {
		ServiceId = serviceId;
	}
	public TechImpContralPo getTico() {
		return tico;
	}
	public void setTico(TechImpContralPo tico) {
		this.tico = tico;
	}
	public Map<String, String> getAttrMap() {
		return attrMap;
	}
	public void setAttrMap(Map<String, String> attrMap) {
		this.attrMap = attrMap;
	}
	public void setTechImplName(String techImplName){
		this.techImplName=techImplName;
	}
	public String getTechImplName(){
		return this.techImplName;
	}

	public String getComponentCode() {
		return componentCode;
	}
	public void setComponentCode(String componentCode) {
		this.componentCode = componentCode;
	}
	public String getSerTechStatus() {
		return serTechStatus;
	}
	public void setSerTechStatus(String serTechStatus) {
		this.serTechStatus = serTechStatus;
	}
	public Integer getTechImplId() {
		return techImplId;
	}
	public void setTechImplId(Integer techImplId) {
		this.techImplId = techImplId;
	}
	public Integer getTechImpConPoId() {
		return techImpConPoId;
	}
	public void setTechImpConPoId(Integer techImpConPoId) {
		this.techImpConPoId = techImpConPoId;
	}
	public void setComponentId(String componentId){
		this.componentId=componentId;
	}
	public String getComponentId(){
		return this.componentId;
	}
	public void setCommProCd(String commProCd){
		this.commProCd=commProCd;
	}
	public String getCommProCd(){
		return this.commProCd;
	}
	public void setRegTime(Date regTime){
		this.regTime=regTime;
	}
	public Date getRegTime(){
		return this.regTime;
	}
	public void setUsealbeState(String usealbeState){
		this.usealbeState=usealbeState;
	}
	public String getUsealbeState(){
		return this.usealbeState;
	}
	public void setLaestTime(Date laestTime){
		this.laestTime=laestTime;
	}
	public Date getLaestTime(){
		return this.laestTime;
	}
	public List<CtlCounterms2Comp> getCtls() {
		return ctls;
	}
	public void setCtls(List<CtlCounterms2Comp> ctls) {
		this.ctls = ctls;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public List<ProofEffect> getProofEffectList() {
		return proofEffectList;
	}
	public void setProofEffectList(List<ProofEffect> proofEffectList) {
		this.proofEffectList = proofEffectList;
	}
}
