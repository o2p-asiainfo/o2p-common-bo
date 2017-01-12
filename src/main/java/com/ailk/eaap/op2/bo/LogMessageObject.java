package com.ailk.eaap.op2.bo;

/**
 * 绫诲悕绉�br>
 * 鏃ュ織瀹㈡埛绔�鏈嶅姟绔娇鐢ㄧ殑娑堟伅瀵硅薄
 * <p>
 * @version 1.0
 * @author linfeng 2013-2-1
 * <hr>
 * 淇敼璁板綍
 * <hr>
 * 1銆佷慨鏀逛汉鍛�    淇敼鏃堕棿:<br>       
 *    淇敼鍐呭:
 * <hr>
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;




public class LogMessageObject implements Serializable,Cloneable{
	

   

	/** 
     * serialVersionUID:TODO. 
     * @since JDK 1.6 
     */  
    private static final long serialVersionUID = -5803516621268775871L;

    private Map<String,String> javaFiledMap ;
	
	private List<ContractInteraction> contractInteractionList;
	
	private List<EndpointInteraction> endpointInteractionList;
	
	private List<OriLogClob> oriLogClobList;
	
	private List<ExceptionLogs> exceptionLogsList;
	
	private List<CtgLogs> ctgLogsList;
	
	//杩欎笁涓敤浜庤矾鐢卞垽鏂殑灞炴�
	private String orgId ="";
	
	private String busCode = "";
	
	private String svcCode = "";
	
	//璁板綍鏃ュ織瀵硅薄鎻掓暟鎹簱鎿嶄綔娆℃暟
	private int insertDBTimes=0;
	
	//缁欏畾缂栧彿灏嗗璞℃斁鍏ユ寚瀹氱殑闃熷垪
	private int number;
	
	private String srcSysSign;
	
	
	private  String dataSourcekey;
	
	public String getDataSourcekey() {
		return dataSourcekey;
	}

	public void setDataSourcekey(String dataSourcekey) {
		this.dataSourcekey = dataSourcekey;
	}

	public LogMessageObject(){
		contractInteractionList = new ArrayList<ContractInteraction>();
		endpointInteractionList = new ArrayList<EndpointInteraction>();
		oriLogClobList = new ArrayList<OriLogClob>();
		exceptionLogsList = new ArrayList<ExceptionLogs>();
		ctgLogsList = new ArrayList<CtgLogs>();
	}
	
	public Object clone(){
		try{
			LogMessageObject logMessageObject=new LogMessageObject();
			List<ContractInteraction> contractInteractionCloneList = new ArrayList<ContractInteraction>();
			for(int i=0;i<contractInteractionList.size();i++){
				ContractInteraction contractInteractionSelf = (ContractInteraction)contractInteractionList.get(i);
				ContractInteraction contractInteractionClone = (ContractInteraction)contractInteractionSelf.clone();
				contractInteractionCloneList.add(contractInteractionClone);
			}
			logMessageObject.setContractInteractionList(contractInteractionCloneList);
			List<EndpointInteraction> endpointInteractionCloneList = new ArrayList<EndpointInteraction>();
			for(int i=0;i<endpointInteractionList.size();i++){
				EndpointInteraction endpointInteractionSelf = (EndpointInteraction)endpointInteractionList.get(i);
				EndpointInteraction endpointInteractionClone = (EndpointInteraction)endpointInteractionSelf.clone();
				endpointInteractionCloneList.add(endpointInteractionClone);
			}
			logMessageObject.setEndpointInteractionList(endpointInteractionCloneList);
			List<OriLogClob> oriLogClobCloneList = new ArrayList<OriLogClob>();
			for(int i=0;i<oriLogClobList.size();i++){
				OriLogClob oriLogClobSelf = (OriLogClob)oriLogClobList.get(i);
				OriLogClob OriLogClobClone = (OriLogClob)oriLogClobSelf.clone();
				oriLogClobCloneList.add(OriLogClobClone);
			}
			logMessageObject.setOriLogClobList(oriLogClobCloneList);
			List<ExceptionLogs> exceptionLogsCloneList = new ArrayList<ExceptionLogs>();
			for(int i=0;i<exceptionLogsList.size();i++){
				ExceptionLogs exceptionLogsSelf = (ExceptionLogs)exceptionLogsList.get(i);
				ExceptionLogs exceptionLogsClone = (ExceptionLogs)exceptionLogsSelf.clone();
				exceptionLogsCloneList.add(exceptionLogsClone);
			}		
			logMessageObject.setExceptionLogsList(exceptionLogsCloneList);
			List<CtgLogs> ctgLogsCloneList = new ArrayList<CtgLogs>();
			for(int i=0;i<ctgLogsList.size();i++){
				CtgLogs ctgLogsSelf = (CtgLogs)ctgLogsList.get(i);
				CtgLogs ctgLogsClone = (CtgLogs)ctgLogsSelf.clone();
				ctgLogsCloneList.add(ctgLogsClone);
			}
			logMessageObject.setCtgLogsList(ctgLogsCloneList);
			
			logMessageObject.setBusCode(busCode);
			logMessageObject.setNumber(number);
			logMessageObject.setSrcSysSign(srcSysSign);
			logMessageObject.setSvcCode(svcCode);
			logMessageObject.setOrgId(orgId);
			logMessageObject.setInsertDBTimes(insertDBTimes);
			logMessageObject.setJavaFiledMap(javaFiledMap);
			logMessageObject.setDataSourcekey(dataSourcekey);
			return logMessageObject;
		}catch (Exception e){
			return null;
		}
	}

	/**
	 * 娣诲姞鏃ュ織瀛愬璞�
	 * @param type  瀛愬璞＄被鍨�
	 * @param object 瀛愬璞�
	 * @param clearFlag 鏄惁娓呴櫎瀛愬璞ist涓殑鍘熸潵鐨勫璞�true 琛ㄧず娓呴櫎,false 涓嶆竻闄�
	 */
	public void addLogMessage(String type,Object object,boolean clearFlag){
//		if(clearFlag==true){
//			if(object instanceof ContractInteraction){
//				contractInteractionList.clear();
//			}else if(object instanceof EndpointInteraction){
//				endpointInteractionList.clear();
//			}else if(object instanceof OriLogClob){
//				oriLogClobList.clear();
//			}else if(object instanceof ExceptionLogs){
//				exceptionLogsList.clear();
//			}else if(object instanceof CtgLogs){
//				ctgLogsList.clear();
//			}				
//		}
//		addLogMessage(type,object);
	}
	
	/**
	 * 娣诲姞鏃ュ織瀛愬璞�
	 * @param type 瀛愬璞＄被鍨�
	 * @param object 瀛愬璞�
	 */
	public void addLogMessage(String type,Object object){
//		if(object instanceof ContractInteraction){
//			contractInteractionList.add(object);
//		}else if(object instanceof EndpointInteraction){
//			endpointInteractionList.add(object);
//		}else if(object instanceof OriLogClob){
//			oriLogClobList.add(object);
//		}else if(object instanceof ExceptionLogs){
//			exceptionLogsList.add(object);
//		}else if(object instanceof CtgLogs){
//			ctgLogsList.add(object);
//		}	
	}
	
	/**
	 * 缁欐棩蹇楀瓙鎵�湁瀛愬璞¤缃粺涓�殑鏍囧噯浜ゆ槗娴佹按鍙�
	 * @param contractInteractionId  鏍囧噯浜ゆ槗娴佹按鍙�浠庢暟鎹簱sequence鐢熸垚
	 */
	public void setAllContractInteractionId(String contractInteractionId){
		for (int i=0;i<contractInteractionList.size();i++){
			ContractInteraction iContractInteraction =(ContractInteraction)contractInteractionList.get(i);
			iContractInteraction.setContractInteractionId(contractInteractionId);
		}
		for (int i=0;i<endpointInteractionList.size();i++){
			EndpointInteraction iEndpointInteraction =(EndpointInteraction)endpointInteractionList.get(i);
			iEndpointInteraction.setContractInteractionId(contractInteractionId);
		}
		for (int i=0;i<oriLogClobList.size();i++){
			OriLogClob iOriLogClob =(OriLogClob)oriLogClobList.get(i);
			iOriLogClob.setContractInteractionId(contractInteractionId);
		}
		for (int i=0;i<exceptionLogsList.size();i++){
			ExceptionLogs iExceptionLogs =(ExceptionLogs)exceptionLogsList.get(i);
			iExceptionLogs.setContractInteractionId(contractInteractionId);
		}		
	}
	
	/**
	 * 缁欏璞¤缃〃鍚庣紑鍚�
	 * @param logMessageObject
	 * @param tabSuffix
	 */
	public void setDataBaseTableSuffix(String tabSuffix){
		for (int i=0;i<contractInteractionList.size();i++){
			ContractInteraction iContractInteraction =(ContractInteraction)contractInteractionList.get(i);
			iContractInteraction.setTabSuffix(tabSuffix);
		}
		for (int i=0;i<endpointInteractionList.size();i++){
			EndpointInteraction iEndpointInteraction =(EndpointInteraction)endpointInteractionList.get(i);
			iEndpointInteraction.setTabSuffix(tabSuffix);
		}
		for (int i=0;i<oriLogClobList.size();i++){
			OriLogClob iOriLogClob =(OriLogClob)oriLogClobList.get(i);
			iOriLogClob.setTabSuffix(tabSuffix);
		}
		for (int i=0;i<exceptionLogsList.size();i++){
			ExceptionLogs iExceptionLogs =(ExceptionLogs)exceptionLogsList.get(i);
			iExceptionLogs.setTabSuffix(tabSuffix);			
		}
		for (int i=0;i<ctgLogsList.size();i++){
			CtgLogs ctgLogs =(CtgLogs)ctgLogsList.get(i);
			ctgLogs.setTabSuffix(tabSuffix);			
		}		
	}
	
	/**
	 * 娓呯┖鏃ュ織瀛愭墍鏈夊瓙瀵硅薄璁剧疆缁熶竴鐨勬爣鍑嗕氦鏄撴祦姘村彿
	 */	
	public void initAllContractInteractionId(){
		setAllContractInteractionId("");
	}

	public List<ContractInteraction> getContractInteractionList() {
		return contractInteractionList;
	}

	public void setContractInteractionList(List<ContractInteraction> contractInteractionList) {
		this.contractInteractionList = contractInteractionList;
	}

	public List<EndpointInteraction> getEndpointInteractionList() {
		return endpointInteractionList;
	}

	public void setEndpointInteractionList(List<EndpointInteraction> endpointInteractionList) {
		this.endpointInteractionList = endpointInteractionList;
	}

	public List<OriLogClob> getOriLogClobList() {
		return oriLogClobList;
	}

	public void setOriLogClobList(List<OriLogClob> oriLogClobList) {
		this.oriLogClobList = oriLogClobList;
	}

	public List<ExceptionLogs> getExceptionLogsList() {
		return exceptionLogsList;
	}

	public void setExceptionLogsList(List<ExceptionLogs> exceptionLogsList) {
		this.exceptionLogsList = exceptionLogsList;
	}

	public List<CtgLogs> getCtgLogsList() {
		return ctgLogsList;
	}

	public void setCtgLogsList(List<CtgLogs> ctgLogsList) {
		this.ctgLogsList = ctgLogsList;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getBusCode() {
		return busCode;
	}

	public int getInsertDBTimes() {
		return insertDBTimes;
	}

	public void setInsertDBTimes(int insertDBTimes) {
		this.insertDBTimes = insertDBTimes;
	}

	public void setBusCode(String busCode) {
		this.busCode = busCode;
	}

	public String getSvcCode() {
		return svcCode;
	}

	public void setSvcCode(String svcCode) {
		this.svcCode = svcCode;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getSrcSysSign() {
		return srcSysSign;
	}

	public void setSrcSysSign(String srcSysSign) {
		this.srcSysSign = srcSysSign;
	}

	public Map<String, String> getJavaFiledMap() {
		return javaFiledMap;
	}

	public void setJavaFiledMap(Map<String, String> javaFiledMap) {
		this.javaFiledMap = javaFiledMap;
	}
	
}
