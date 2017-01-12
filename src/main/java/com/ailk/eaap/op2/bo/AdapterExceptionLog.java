package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class AdapterExceptionLog implements Serializable{
private static final long serialVersionUID = 1L;
	private Long logId;
	private Long adapterId;
	private String tranId;
	private String exceptionType;
	private String exceptionCode;
	private String exceptionDesc;
	private String srcMessage;
	private String adapterMessage;
	private String adapteringMessage;
	private Object recordTime;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public void setLogId(Long logId){
		this.logId=logId;
	}
	public Long getLogId(){
		return this.logId;
	}
	public void setAdapterId(Long adapterId){
		this.adapterId=adapterId;
	}
	public Long getAdapterId(){
		return this.adapterId;
	}
	public void setTranId(String tranId){
		this.tranId=tranId;
	}
	public String getTranId(){
		return this.tranId;
	}
	public void setExceptionType(String exceptionType){
		this.exceptionType=exceptionType;
	}
	public String getExceptionType(){
		return this.exceptionType;
	}
	public void setExceptionCode(String exceptionCode){
		this.exceptionCode=exceptionCode;
	}
	public String getExceptionCode(){
		return this.exceptionCode;
	}
	public void setExceptionDesc(String exceptionDesc){
		this.exceptionDesc=exceptionDesc;
	}
	public String getExceptionDesc(){
		return this.exceptionDesc;
	}
	public void setSrcMessage(String srcMessage){
		this.srcMessage=srcMessage;
	}
	public String getSrcMessage(){
		return this.srcMessage;
	}
	public void setAdapterMessage(String adapterMessage){
		this.adapterMessage=adapterMessage;
	}
	public String getAdapterMessage(){
		return this.adapterMessage;
	}
	public void setAdapteringMessage(String adapteringMessage){
		this.adapteringMessage=adapteringMessage;
	}
	public String getAdapteringMessage(){
		return this.adapteringMessage;
	}
	public void setRecordTime(Object recordTime){
		this.recordTime=recordTime;
	}
	public Object getRecordTime(){
		return this.recordTime;
	}
}
