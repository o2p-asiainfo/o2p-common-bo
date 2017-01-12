package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ModelOpHis implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer modelOpHisId;
	private Integer modelTableId;
	private String priKeyValue;
	private Integer fieldListId;
	private Integer attrSpecId;
	private String fieldOldValue;
	private String fieldNewValue;
	private String opExpr;
	private String opPerson;
	private String opSrcIp;
	private Date opTime;
	private String opResult;
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

	public void setModelOpHisId(Integer modelOpHisId){
		this.modelOpHisId=modelOpHisId;
	}
	public Integer getModelOpHisId(){
		return this.modelOpHisId;
	}
	public void setModelTableId(Integer modelTableId){
		this.modelTableId=modelTableId;
	}
	public Integer getModelTableId(){
		return this.modelTableId;
	}
	public void setPriKeyValue(String priKeyValue){
		this.priKeyValue=priKeyValue;
	}
	public String getPriKeyValue(){
		return this.priKeyValue;
	}
	public void setFieldListId(Integer fieldListId){
		this.fieldListId=fieldListId;
	}
	public Integer getFieldListId(){
		return this.fieldListId;
	}
	public void setAttrSpecId(Integer attrSpecId){
		this.attrSpecId=attrSpecId;
	}
	public Integer getAttrSpecId(){
		return this.attrSpecId;
	}
	public void setFieldOldValue(String fieldOldValue){
		this.fieldOldValue=fieldOldValue;
	}
	public String getFieldOldValue(){
		return this.fieldOldValue;
	}
	public void setFieldNewValue(String fieldNewValue){
		this.fieldNewValue=fieldNewValue;
	}
	public String getFieldNewValue(){
		return this.fieldNewValue;
	}
	public void setOpExpr(String opExpr){
		this.opExpr=opExpr;
	}
	public String getOpExpr(){
		return this.opExpr;
	}
	public void setOpPerson(String opPerson){
		this.opPerson=opPerson;
	}
	public String getOpPerson(){
		return this.opPerson;
	}
	public void setOpSrcIp(String opSrcIp){
		this.opSrcIp=opSrcIp;
	}
	public String getOpSrcIp(){
		return this.opSrcIp;
	}
	public void setOpTime(Date opTime){
		this.opTime=opTime;
	}
	public Date getOpTime(){
		return this.opTime;
	}
	public void setOpResult(String opResult){
		this.opResult=opResult;
	}
	public String getOpResult(){
		return this.opResult;
	}
}
