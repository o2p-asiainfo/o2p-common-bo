package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class AdapterMapValueConfig implements Serializable{
private static final long serialVersionUID = 1L;
	private Long mapId;
	private Long adapterId;
	private String mapType;
	private String primaryValue;
	private String mapValue;
	private String state;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	public void setMapId(Long mapId){
		this.mapId=mapId;
	}
	public Long getMapId(){
		return this.mapId;
	}
	public void setAdapterId(Long adapterId){
		this.adapterId=adapterId;
	}
	public Long getAdapterId(){
		return this.adapterId;
	}
	public void setMapType(String mapType){
		this.mapType=mapType;
	}
	public String getMapType(){
		return this.mapType;
	}
	public void setPrimaryValue(String primaryValue){
		this.primaryValue=primaryValue;
	}
	public String getPrimaryValue(){
		return this.primaryValue;
	}
	public void setMapValue(String mapValue){
		this.mapValue=mapValue;
	}
	public String getMapValue(){
		return this.mapValue;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
}
