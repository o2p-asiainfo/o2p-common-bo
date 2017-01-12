package com.ailk.eaap.op2.bo;

import java.io.Serializable;


public class QueryBean implements Serializable{
	
	
	/**
	 * QueryBeanx修改需要通知前台
	 */
	private static final long serialVersionUID = 6829840669040932920L;
	
	private String dataSourceId;
	private String contractInteractionId;
	private String responseCode;
	private String status;
	private String startSrcReqTime;
	private String endSrcReqTime;
	private String jfTransactionID;//javafield字段 srcTranId--> jfTransactionID
	private String contractVersion;
	private String jfSrcSysCode;//javafield字段srcSysCode --> jfSrcSysCode
	private String dstSysCode;
	private String table;
	
	//javafield新增属性部分 2014.12.5
	public static String jfapiname;
	public static String jfAppKey;
	public static String jfDstSysID;
	public static String jfFormat;
	public static String jfMethod;
	public static String jfBusiCode;
	public static String jfAccessToken;
	public static String jfServiceContractVer;
	public static String jfip;
	public static String jfSign;
	
	//ctg表查询条件
	private String logSeq;
	private String funName;
	private String startCreateDate;
	private String endCreateDate;
	private String errCode;



	private Integer tenantId;
	
	
	public String getDataSourceId() {
		return dataSourceId;
	}
	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	public String getContractVersion() {
		return contractVersion;
	}
	public void setContractVersion(String contractVersion) {
		this.contractVersion = contractVersion;
	}
	
	public String getDstSysCode() {
		return dstSysCode;
	}
	public void setDstSysCode(String dstSysCode) {
		this.dstSysCode = dstSysCode;
	}
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	public String getStartSrcReqTime() {
		return startSrcReqTime;
	}
	public void setStartSrcReqTime(String startSrcReqTime) {
		this.startSrcReqTime = startSrcReqTime;
	}
	public String getEndSrcReqTime() {
		return endSrcReqTime;
	}
	public void setEndSrcReqTime(String endSrcReqTime) {
		this.endSrcReqTime = endSrcReqTime;
	}
	public String getContractInteractionId() {
		return contractInteractionId;
	}
	public void setContractInteractionId(String contractInteractionId) {
		this.contractInteractionId = contractInteractionId;
	}
	public String getJfTransactionID() {
		return jfTransactionID;
	}
	public void setJfTransactionID(String jfTransactionID) {
		this.jfTransactionID = jfTransactionID;
	}
	public String getJfSrcSysCode() {
		return jfSrcSysCode;
	}
	public void setJfSrcSysCode(String jfSrcSysCode) {
		this.jfSrcSysCode = jfSrcSysCode;
	}
	public static String getJfapiname() {
		return jfapiname;
	}
	public static void setJfapiname(String jfapiname) {
		QueryBean.jfapiname = jfapiname;
	}
	public static String getJfAppKey() {
		return jfAppKey;
	}
	public static void setJfAppKey(String jfAppKey) {
		QueryBean.jfAppKey = jfAppKey;
	}
	public static String getJfDstSysID() {
		return jfDstSysID;
	}
	public static void setJfDstSysID(String jfDstSysID) {
		QueryBean.jfDstSysID = jfDstSysID;
	}
	public static String getJfFormat() {
		return jfFormat;
	}
	public static void setJfFormat(String jfFormat) {
		QueryBean.jfFormat = jfFormat;
	}
	public static String getJfMethod() {
		return jfMethod;
	}
	public static void setJfMethod(String jfMethod) {
		QueryBean.jfMethod = jfMethod;
	}
	public static String getJfBusiCode() {
		return jfBusiCode;
	}
	public static void setJfBusiCode(String jfBusiCode) {
		QueryBean.jfBusiCode = jfBusiCode;
	}
	public static String getJfAccessToken() {
		return jfAccessToken;
	}
	public static void setJfAccessToken(String jfAccessToken) {
		QueryBean.jfAccessToken = jfAccessToken;
	}
	public static String getJfServiceContractVer() {
		return jfServiceContractVer;
	}
	public static void setJfServiceContractVer(String jfServiceContractVer) {
		QueryBean.jfServiceContractVer = jfServiceContractVer;
	}
	public static String getJfip() {
		return jfip;
	}
	public static void setJfip(String jfip) {
		QueryBean.jfip = jfip;
	}
	public static String getJfSign() {
		return jfSign;
	}
	public static void setJfSign(String jfSign) {
		QueryBean.jfSign = jfSign;
	}
	public String getLogSeq() {
		return logSeq;
	}
	public void setLogSeq(String logSeq) {
		this.logSeq = logSeq;
	}
	public String getFunName() {
		return funName;
	}
	public void setFunName(String funName) {
		this.funName = funName;
	}
	public String getStartCreateDate() {
		return startCreateDate;
	}
	public void setStartCreateDate(String startCreateDate) {
		this.startCreateDate = startCreateDate;
	}
	public String getEndCreateDate() {
		return endCreateDate;
	}
	public void setEndCreateDate(String endCreateDate) {
		this.endCreateDate = endCreateDate;
	}
	public String getErrCode() {
		return errCode;
	}
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
	
}
