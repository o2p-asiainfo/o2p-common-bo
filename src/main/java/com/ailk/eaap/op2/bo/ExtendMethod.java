package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class ExtendMethod implements Serializable{
private static final long serialVersionUID = 1L;
	private Long methodId;
	private String methodType;
	private String className;
	private String beanid;
	private String methodName;
	private String segmentRealize;
	private String remarks;
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
	public void setMethodId(Long methodId){
		this.methodId=methodId;
	}
	public Long getMethodId(){
		return this.methodId;
	}
	public void setMethodType(String methodType){
		this.methodType=methodType;
	}
	public String getMethodType(){
		return this.methodType;
	}
	public void setClassName(String className){
		this.className=className;
	}
	public String getClassName(){
		return this.className;
	}
	public void setBeanid(String beanid){
		this.beanid=beanid;
	}
	public String getBeanid(){
		return this.beanid;
	}
	public void setMethodName(String methodName){
		this.methodName=methodName;
	}
	public String getMethodName(){
		return this.methodName;
	}
	public void setSegmentRealize(String segmentRealize){
		this.segmentRealize=segmentRealize;
	}
	public String getSegmentRealize(){
		return this.segmentRealize;
	}
	public void setRemarks(String remarks){
		this.remarks=remarks;
	}
	public String getRemarks(){
		return this.remarks;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
}
