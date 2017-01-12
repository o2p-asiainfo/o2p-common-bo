package com.ailk.eaap.op2.bo;

public class ApplyInfoDetail implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Integer applyDetailId;
	private Integer applyId;
	private Integer resTypeId;
	private String priovince;
	private String city;
	private Integer amount;
	private String isContinuous;
	private String numberSegment;
	private String resultResTypeId ;
	private String resultAmount ;
	
	
	private String resProductTypeName ;
	private String add ;
	private String uimid ;
	private String ndc ;
	private String gline ;
	private String imgId ;
	private String fileName ;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getNumberSegment() {
		return numberSegment;
	}
	public void setNumberSegment(String numberSegment) {
		this.numberSegment = numberSegment;
	}
	public Integer getApplyDetailId() {
		return applyDetailId;
	}
	public void setApplyDetailId(Integer applyDetailId) {
		this.applyDetailId = applyDetailId;
	}
	public Integer getApplyId() {
		return applyId;
	}
	public void setApplyId(Integer applyId) {
		this.applyId = applyId;
	}
	public Integer getResTypeId() {
		return resTypeId;
	}
	public void setResTypeId(Integer resTypeId) {
		this.resTypeId = resTypeId;
	}
	public String getPriovince() {
		return priovince;
	}
	public void setPriovince(String priovince) {
		this.priovince = priovince;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getIsContinuous() {
		return isContinuous;
	}
	public void setIsContinuous(String isContinuous) {
		this.isContinuous = isContinuous;
	}
	public String getResultResTypeId() {
		return resultResTypeId;
	}
	public void setResultResTypeId(String resultResTypeId) {
		this.resultResTypeId = resultResTypeId;
	}
	public String getResultAmount() {
		return resultAmount;
	}
	public void setResultAmount(String resultAmount) {
		this.resultAmount = resultAmount;
	}
	public String getResProductTypeName() {
		return resProductTypeName;
	}
	public void setResProductTypeName(String resProductTypeName) {
		this.resProductTypeName = resProductTypeName;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getUimid() {
		return uimid;
	}
	public void setUimid(String uimid) {
		this.uimid = uimid;
	}
	public String getNdc() {
		return ndc;
	}
	public void setNdc(String ndc) {
		this.ndc = ndc;
	}
	public String getGline() {
		return gline;
	}
	public void setGline(String gline) {
		this.gline = gline;
	}
	public String getImgId() {
		return imgId;
	}
	public void setImgId(String imgId) {
		this.imgId = imgId;
	} 

}
