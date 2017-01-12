package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ExceptionLogsXx implements Serializable{
private static final long serialVersionUID = 1L;
	private Long exceptionInstId;
	private String exceptionSpecId;
	private String contractInteractionId;
	private String srcTranId;
	private Date createTime;
	private String exceptionMessage;
	private String content;
	private String staffNbr;
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
	public void setExceptionInstId(Long exceptionInstId){
		this.exceptionInstId=exceptionInstId;
	}
	public Long getExceptionInstId(){
		return this.exceptionInstId;
	}
	public void setExceptionSpecId(String exceptionSpecId){
		this.exceptionSpecId=exceptionSpecId;
	}
	public String getExceptionSpecId(){
		return this.exceptionSpecId;
	}
	public void setContractInteractionId(String contractInteractionId){
		this.contractInteractionId=contractInteractionId;
	}
	public String getContractInteractionId(){
		return this.contractInteractionId;
	}
	public void setSrcTranId(String srcTranId){
		this.srcTranId=srcTranId;
	}
	public String getSrcTranId(){
		return this.srcTranId;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setExceptionMessage(String exceptionMessage){
		this.exceptionMessage=exceptionMessage;
	}
	public String getExceptionMessage(){
		return this.exceptionMessage;
	}
	public void setContent(String content){
		this.content=content;
	}
	public String getContent(){
		return this.content;
	}
	public void setStaffNbr(String staffNbr){
		this.staffNbr=staffNbr;
	}
	public String getStaffNbr(){
		return this.staffNbr;
	}
}
