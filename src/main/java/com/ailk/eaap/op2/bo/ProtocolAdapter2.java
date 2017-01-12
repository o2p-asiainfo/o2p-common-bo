package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ProtocolAdapter2 implements Serializable{
private static final long serialVersionUID = 1L;
	private Long adapterId;
	private String inProtocol;
	private String outProtocol;
	private String adapterProcessCode;
	private String example;
	private String msgSwitchMode;
	private String inType;
	private String outType;
	private String inputChangeMode;
	private String tranIdMethod;
	private String tranIdSrcPath;
	private String state;
	private Date stateDate;
	private String remarks;
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
	public void setAdapterId(Long adapterId){
		this.adapterId=adapterId;
	}
	public Long getAdapterId(){
		return this.adapterId;
	}
	public void setInProtocol(String inProtocol){
		this.inProtocol=inProtocol;
	}
	public String getInProtocol(){
		return this.inProtocol;
	}
	public void setOutProtocol(String outProtocol){
		this.outProtocol=outProtocol;
	}
	public String getOutProtocol(){
		return this.outProtocol;
	}
	public void setAdapterProcessCode(String adapterProcessCode){
		this.adapterProcessCode=adapterProcessCode;
	}
	public String getAdapterProcessCode(){
		return this.adapterProcessCode;
	}
	public void setExample(String example){
		this.example=example;
	}
	public String getExample(){
		return this.example;
	}
	public void setMsgSwitchMode(String msgSwitchMode){
		this.msgSwitchMode=msgSwitchMode;
	}
	public String getMsgSwitchMode(){
		return this.msgSwitchMode;
	}
	public void setInType(String inType){
		this.inType=inType;
	}
	public String getInType(){
		return this.inType;
	}
	public void setOutType(String outType){
		this.outType=outType;
	}
	public String getOutType(){
		return this.outType;
	}
	public void setInputChangeMode(String inputChangeMode){
		this.inputChangeMode=inputChangeMode;
	}
	public String getInputChangeMode(){
		return this.inputChangeMode;
	}
	public void setTranIdMethod(String tranIdMethod){
		this.tranIdMethod=tranIdMethod;
	}
	public String getTranIdMethod(){
		return this.tranIdMethod;
	}
	public void setTranIdSrcPath(String tranIdSrcPath){
		this.tranIdSrcPath=tranIdSrcPath;
	}
	public String getTranIdSrcPath(){
		return this.tranIdSrcPath;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setStateDate(Date stateDate){
		this.stateDate=stateDate;
	}
	public Date getStateDate(){
		return this.stateDate;
	}
	public void setRemarks(String remarks){
		this.remarks=remarks;
	}
	public String getRemarks(){
		return this.remarks;
	}
}
