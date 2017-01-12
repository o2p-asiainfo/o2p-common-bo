package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class EndpointAttr implements Serializable{

	/**
	* @Fields serialVersionUID : TODO
	*/
	private static final long serialVersionUID = 1L;
	//锟剿碉拷锟斤拷锟皆癸拷锟斤拷锟斤拷
	public final static String ADDRESS = "address";
	public final static String SERVICE_CLASS = "serviceClass";
	public final static String WSDL_URL = "wsdlURL";
	public final static String CLASS_NAME = "className";
	public final static String SPRING_BEAN_ID = "beanId";
	public final static String METHOD_NAME = "method";
	public final static String PARAM_TYPE_LIST = "paramTypes";
	
	public final static String RETURN_PARAM_TYPE_LIST = "returnparamTypes";
	
	public final static String DELAY_TIME = "delayTime";
	public final static String TIMEOUT = "timeout";
	public final static String CONCURRENTS =  "concurrents";
	public final static String CAPACITY = "capacity";
	public final static String IP_ADDRESS = "ipAddress";
	public final static String PROXY_IP = "proxyIp";
	public final static String PROXY_PORT = "proxyPort";
	public final static String LDAP_DN_OU = "ldap_dn_ou";
	public final static String MAC_ADDRESS = "macAddress";
	public final static String PORT = "port";
	public final static String FTP_PATH = "ftpPath";
	public final static String LOCAL_PATH = "localPath";
	public final static String USER_NAME = "username";
	public final static String PASSWORD = "password";
	public final static String DESTINATIONNAME = "destinationName";
	public final static String DESTINATIONTYPE = "destinationType";
	public final static String DESTINATIONTYPE_QUEUE = "queue";
	public final static String DESTINATIONTYPE_TOPIC = "topic";
	
	public final static String FTP_TYPE = "ftpType";
	public final static String FLAG = "flag";
	public final static String FILE_TYPE = "fileType";
	public final static String FROM_PATH = "fromPath";
	public final static String TO_PATH = "toPaths";
	public final static String TEMPLETE = "template";
	public final static String TEMPLETE_PATH = "templatePath";
	public final static String TRANSFORMER_CODE = "transformerCode";
	public final static String DATASOURCE = "dataSource";
	public final static String JDBCTEMPLATE = "jdbctemplate";
	public final static String INPARAMNAMETYPES = "inParamNameTypes";
	public final static String OUTPARAMNAMETYPES = "outParamNameTypes";
	public final static String SQL = "SQL";
	public final static String JNFI = "java.naming.factory.initial" ;
	public final static String JNPU = "java.naming.provider.url" ;
	public final static String JNDINAME = "jndiName" ;
	public final static String HOMECLASS = "homeClass" ;
	public final static String OOCO = "org.omg.CORBA.ORBClass" ;
	public final static String reqorrsp = "reqorrsp" ;//锟斤拷锟斤拷应锟斤拷锟绞�
	public final static String contractVersion = "contractVersion" ;
	public final static String ERRORCONTINUE = "errorcontinue";//锟角凤拷锟届常锟斤拷锟斤拷
	public final static String RESPSENDNEXT = "respsendnext";//锟角否返回达拷锟斤拷
	
	public final static String TIMEOUTNUM = "timeoutnum";//锟斤拷时锟斤拷锟斤拷
	public final static String TIMEOUTRESP = "timeoutresp";//锟斤拷时应锟斤拷
	public final static String CYCLE = "cycle";//锟斤拷锟斤拷
	public final static String Path = "path";//路锟斤拷
	public final static String express = "express";//取值表达式
	public final static String ServiceTechId = "servicetechid";//锟斤拷锟斤拷锟斤拷实锟斤拷ID
	
	public final static String statusCodeNotThrowOgnl = "statusCodeNotThrowOgnl";
	public final static String needBreakOgnl = "needBreakOgnl";
	
	public final static String BusinessExceptionCode = "BusinessExceptionCode";
	public final static String BusinessExceptionDesc = "BusinessExceptionDesc";
	
	public final static String ORDER_DEAL_BEAN = "orderDealBean";// 锟斤拷锟斤拷锟斤拷路锟斤拷
	public final static String DEAL_METHOD = "dealMethod";// 锟斤拷锟斤拷锟斤拷路锟斤拷
	//锟斤拷锟斤拷锟斤拷锟斤拷IBM MQ MB
	//public final static String HOST_NAME = "hostName";
	public final static String MQ_TYPE = "mqType";
	public final static String CHANNEL = "channel";
	public final static String CCSID = "CCSID";
	public final static String WRITE_QUEUE_NAME = "sendQueueName";
	public final static String READ_QUEUE_NAME = "recvQueueName";
	public final static String MSG_EXCHANGE_MODE = "msgExchangeMode";
	//public final static String MSG_ID = "msgID";
	public final static String MQ_QUEUE_MANAGER = "qManager";  //锟斤拷锟叫癸拷锟斤拷锟斤拷
	public final static String YN_CONVERT_MSG_TO_INNER_XML = "convertMsgToInnerXML";   //锟角凤拷转锟斤拷锟斤拷锟节诧拷XML锟斤拷式锟斤拷
	public final static String PRIORITY = "priority"; 
	
	public final static String HTTP_REQUEST_HEAD_NAME = "httpReqHeadName";
	public final static String encrtyptType = "encrtyptType";//锟斤拷锟杰凤拷式
	public final static String encryptkey = "encryptkey";//锟斤拷锟斤拷锟斤拷钥
	public final static String appkey = "appKey";
	public final static String charset = "charset";//锟街凤拷
	public final static String returnparam = "returnparam";//锟斤拷锟截诧拷锟斤拷锟斤拷锟�
	public final static String tokenpath = "tokenpath";//token锟斤拷锟铰凤拷锟�
	public final static String regularexpression = "regularexpression";//锟斤拷锟斤拷锟斤拷式
	public final static String prooftype = "prooftype";//锟斤拷证锟斤拷锟斤拷
	
	
	
	public final static String subLength = "sublength";//锟街凤拷锟斤拷锟斤拷
	public final static String range = "range";//锟街凤拷锟斤拷锟斤拷
	public final static String character = "character";//模锟斤拷锟芥换锟街凤拷
	public final static String targetcontractversion = "targetcontractversion";//目锟斤拷协锟斤拷姹�
	public final static String origincontractversion = "origincontractversion";//源协锟斤拷姹�
	
	public final static String namespace = "namespace";//锟斤拷锟斤拷占锟�
	public final static String methodnamespace = "methodnamespace";//锟斤拷锟斤拷占锟�
	public final static String header = "header";//锟斤拷锟斤拷占锟�
	public final static String inparamname = "inparamname";//锟斤拷锟斤拷锟斤拷
	public final static String inparamnamespace = "inparamnamespace";//锟斤拷锟斤拷锟斤拷锟秸硷拷
	
	
	public final static String needCDATA = "needCDATA";//锟斤拷锟斤拷锟斤拷锟秸硷拷
	
	public final static String inMsg = "inMsg";//锟斤拷锟饺≈�
	public final static String key = "key";//锟斤拷钥
	public final static String encryptContract = "encryptContract";//锟斤拷钥
	public final static String tuxedosessionname = "tuxedosessionname";//tuxedo session锟斤拷锟�
	public final static String keyValue = "keyvalue";//map锟斤拷key锟斤拷value
	public final static String rspType = "rsptype";//锟斤拷应锟斤拷锟斤拷
	public final static String rspCode = "rspcode";//锟斤拷应锟斤拷锟斤拷
	public final static String rspDesc = "rspdesc";//锟斤拷应锟斤拷锟斤拷
	public final static String messagetemplate = "messagetemplate";//锟斤拷息模锟斤拷
	public final static String Content_type = "Content-type";//锟斤拷息模锟斤拷
	public final static String Media_Type = "Media-Type";//锟斤拷息模锟斤拷
	public final static String SOAPAction = "SOAPAction";//锟斤拷息模锟斤拷
	public static final String IS_USE_SSL = "isUseSsl";
	public static final String TEXT_CODEC = "textCodec";
	public static final String TRUST_STORE = "trustStore";
	public static final String TRUST_STORE_PASSWORD = "trustStorePassword";
	public static final String TRANSFORMER_RULE_ID = "transformer_rule_id";
	public final static String Ignore_Exception = "Ignore";//锟斤拷息模锟斤拷
	
	public final static String restResource = "restResource";
	public final static String restAction = "restAction";
	
	public final static String FTP_USERNAME = "ftpUsername";
	public final static String FTP_PASSWORD = "ftpPassword";
	public final static String FTP_SERVERIP = "ftpServerIp";
	public final static String FTP_PORT = "ftpPort";
	
	public final static String SFTP_USERNAME = "sftpUsername";
	public final static String SFTP_PASSWORD = "sftpPassword";
	public final static String SFTP_SERVERIP = "sftpServerIp";
	public final static String SFTP_PORT = "sftpPort";
	public final static String SFTP_AUTH_FILE_PATH = "sftpAuthFilePath";
	public final static String SFTP_PASSPHRASE = "sftpPassphrase ";
	
	public final static String LINK_FILE_DIR = "File_Dir";
	public final static String MESSAGE_RULE = "File_Name_Pattern";
	public final static String FILE_TEMP_DIR = "File_Temp_Dir";
	
	
	public final static String NEED_MOVE_DIR = "Need_Move_Dir";
	
	public final static String BACKUP_FILE_DIR = "Backup_File_Dir";
	public final static String THREAD_NUM = "Thread_Num";
	public static final String ATTR_SPEC_CODE_POST_READ_ACTION = "POST_READ_ACTION";
	
	public final static String FILE_FORMATS = "File_Formats";
	public final static String FILE_DIR_TYPE = "File_Dir_Type";
	public final static String FILE_SORT_TYPE = "File_Sort";
	
	public final static String FILE_DOWNLOAD_LIMIT_NUM = "File_Download_Limit_Num";
	public final static String THREAD_NUM_LIMIT = "Thread_Num_Limit";
	/*
	 * JDBC ENDPOINT Configuration
	 */
	public static final String JDBC_SQL = "jdbcSql";
	public static final String START_LINE_INDEX = "startLineIndex";
	public static final String LIMIT = "limit";
	public static final String DATASOURCE_ID = "dataSourceId";
	public static final String EXPORT_CSV = "exportCsv";
	public static final String CSV_TEMPLATE_ID = "csvTemplateId";
	
	
	public static final String PLUGINS_CALL_ENDPOINT_URL = "PLUGINS_CALL_ENDPOINT_URL";
	
	public static final String REMOTE_CALL_URL_ID = "REMOTE_CALL_URL_ID";
	
	public static final String REAL_FILE_DIR = "REAL_FILE_DIR";
	
	public static final String DEFAULT_MQ="activeMQ";
	
	public static final String ACTIVEMQ="activeMQ";
	
	public static final String IBMMQ="ibmMQ";
	
	/*tibco jms*/
	public static final String TIBCOJMS="tibco";
	public static final String INITIAL_CONTEXT_FACTORY="INITIAL_CONTEXT_FACTORY";
	public static final String ES_QUEUE_CONNECTION_FACTORY="ESQueueConnectionFactory";
	public static final String QUEUE_NAME="QUEUE_NAME";
	public static final String PRODUCT_LOCAL_PATH="PRODUCT_LOCAL_PATH";
	public static final String PRODUCT_BACKUP_PATH="PRODUCT_BACKUP_PATH";
	public static final String FILE_NAME="FILE_NAME";
	
	public static final String KEY_STORE="keyStore";
	public static final String KEY_STORE_PASSWORD="keyStorePassword";
	
	public static final String ROOT_ELEMENT_NAME="Root_Element_Name";
	
	public static final String PROXY_ATTR="ProxyAttr";
	
	public static final String DIR_DATE_PATTERN="dir_date_pattern";
	
	
	
	public final static String alias = "alias";
	public final static String keyPass = "keyPass";
	
	public final static String subjectName = "subjectName";
	
	
	public final static String writeJMSHeader = "writeJMSHeader";
	
	
	public final static String ConsumerGroupName = "ConsumerGroupName";
	public final static String ConsumerInstanceName = "ConsumerInstanceName";
	public final static String TopicName = "TopicName";
	public final static String subExpression = "subExpression";
	public final static String tags = "tags";
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column V_ENDPOINT_ATTR.ENDPOINT_ATTR_VALUE_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	private Integer endpointAttrValueId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column V_ENDPOINT_ATTR.ENDPOINT_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	private Integer endpointId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column V_ENDPOINT_ATTR.ATTR_VALUE
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	private String attrValue;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column V_ENDPOINT_ATTR.ENDPOINT_SPEC_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	private Integer endpointSpecId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column V_ENDPOINT_ATTR.ENDPOINT_SPEC_ATTR_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	private Integer endpointSpecAttrId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column V_ENDPOINT_ATTR.ATTR_SPEC_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	private Integer attrSpecId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column V_ENDPOINT_ATTR.ATTR_SPEC_NAME
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	private String attrSpecName;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column V_ENDPOINT_ATTR.ATTR_SPEC_CODE
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	private String attrSpecCode;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column V_ENDPOINT_ATTR.DEFAULT_VALUE
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	private String defaultValue;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column V_ENDPOINT_ATTR.NULLABLE
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	private Boolean nullable;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column V_ENDPOINT_ATTR.UP_ATTR_SPEC_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	private Integer upAttrSpecId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column V_ENDPOINT_ATTR.DATA_TYPE_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	private Integer dataTypeId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column V_ENDPOINT_ATTR.DATA_TYPE_NAME
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	private String dataTypeName;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column V_ENDPOINT_ATTR.DATA_TYPE_CODE
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	private String dataTypeCode;
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
	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column V_ENDPOINT_ATTR.ENDPOINT_ATTR_VALUE_ID
	 * @return  the value of V_ENDPOINT_ATTR.ENDPOINT_ATTR_VALUE_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public Integer getEndpointAttrValueId() {
		return endpointAttrValueId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column V_ENDPOINT_ATTR.ENDPOINT_ATTR_VALUE_ID
	 * @param endpointAttrValueId  the value for V_ENDPOINT_ATTR.ENDPOINT_ATTR_VALUE_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public void setEndpointAttrValueId(Integer endpointAttrValueId) {
		this.endpointAttrValueId = endpointAttrValueId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column V_ENDPOINT_ATTR.ENDPOINT_ID
	 * @return  the value of V_ENDPOINT_ATTR.ENDPOINT_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public Integer getEndpointId() {
		return endpointId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column V_ENDPOINT_ATTR.ENDPOINT_ID
	 * @param endpointId  the value for V_ENDPOINT_ATTR.ENDPOINT_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public void setEndpointId(Integer endpointId) {
		this.endpointId = endpointId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column V_ENDPOINT_ATTR.ATTR_VALUE
	 * @return  the value of V_ENDPOINT_ATTR.ATTR_VALUE
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public String getAttrValue() {
		return attrValue;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column V_ENDPOINT_ATTR.ATTR_VALUE
	 * @param attrValue  the value for V_ENDPOINT_ATTR.ATTR_VALUE
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column V_ENDPOINT_ATTR.ENDPOINT_SPEC_ID
	 * @return  the value of V_ENDPOINT_ATTR.ENDPOINT_SPEC_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public Integer getEndpointSpecId() {
		return endpointSpecId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column V_ENDPOINT_ATTR.ENDPOINT_SPEC_ID
	 * @param endpointSpecId  the value for V_ENDPOINT_ATTR.ENDPOINT_SPEC_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public void setEndpointSpecId(Integer endpointSpecId) {
		this.endpointSpecId = endpointSpecId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column V_ENDPOINT_ATTR.ENDPOINT_SPEC_ATTR_ID
	 * @return  the value of V_ENDPOINT_ATTR.ENDPOINT_SPEC_ATTR_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public Integer getEndpointSpecAttrId() {
		return endpointSpecAttrId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column V_ENDPOINT_ATTR.ENDPOINT_SPEC_ATTR_ID
	 * @param endpointSpecAttrId  the value for V_ENDPOINT_ATTR.ENDPOINT_SPEC_ATTR_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public void setEndpointSpecAttrId(Integer endpointSpecAttrId) {
		this.endpointSpecAttrId = endpointSpecAttrId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column V_ENDPOINT_ATTR.ATTR_SPEC_ID
	 * @return  the value of V_ENDPOINT_ATTR.ATTR_SPEC_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public Integer getAttrSpecId() {
		return attrSpecId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column V_ENDPOINT_ATTR.ATTR_SPEC_ID
	 * @param attrSpecId  the value for V_ENDPOINT_ATTR.ATTR_SPEC_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public void setAttrSpecId(Integer attrSpecId) {
		this.attrSpecId = attrSpecId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column V_ENDPOINT_ATTR.ATTR_SPEC_NAME
	 * @return  the value of V_ENDPOINT_ATTR.ATTR_SPEC_NAME
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public String getAttrSpecName() {
		return attrSpecName;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column V_ENDPOINT_ATTR.ATTR_SPEC_NAME
	 * @param attrSpecName  the value for V_ENDPOINT_ATTR.ATTR_SPEC_NAME
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public void setAttrSpecName(String attrSpecName) {
		this.attrSpecName = attrSpecName;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column V_ENDPOINT_ATTR.ATTR_SPEC_CODE
	 * @return  the value of V_ENDPOINT_ATTR.ATTR_SPEC_CODE
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public String getAttrSpecCode() {
		return attrSpecCode;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column V_ENDPOINT_ATTR.ATTR_SPEC_CODE
	 * @param attrSpecCode  the value for V_ENDPOINT_ATTR.ATTR_SPEC_CODE
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public void setAttrSpecCode(String attrSpecCode) {
		this.attrSpecCode = attrSpecCode;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column V_ENDPOINT_ATTR.DEFAULT_VALUE
	 * @return  the value of V_ENDPOINT_ATTR.DEFAULT_VALUE
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column V_ENDPOINT_ATTR.DEFAULT_VALUE
	 * @param defaultValue  the value for V_ENDPOINT_ATTR.DEFAULT_VALUE
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column V_ENDPOINT_ATTR.NULLABLE
	 * @return  the value of V_ENDPOINT_ATTR.NULLABLE
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public Boolean getNullable() {
		return nullable;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column V_ENDPOINT_ATTR.NULLABLE
	 * @param nullable  the value for V_ENDPOINT_ATTR.NULLABLE
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public void setNullable(Boolean nullable) {
		this.nullable = nullable;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column V_ENDPOINT_ATTR.UP_ATTR_SPEC_ID
	 * @return  the value of V_ENDPOINT_ATTR.UP_ATTR_SPEC_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public Integer getUpAttrSpecId() {
		return upAttrSpecId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column V_ENDPOINT_ATTR.UP_ATTR_SPEC_ID
	 * @param upAttrSpecId  the value for V_ENDPOINT_ATTR.UP_ATTR_SPEC_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public void setUpAttrSpecId(Integer upAttrSpecId) {
		this.upAttrSpecId = upAttrSpecId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column V_ENDPOINT_ATTR.DATA_TYPE_ID
	 * @return  the value of V_ENDPOINT_ATTR.DATA_TYPE_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public Integer getDataTypeId() {
		return dataTypeId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column V_ENDPOINT_ATTR.DATA_TYPE_ID
	 * @param dataTypeId  the value for V_ENDPOINT_ATTR.DATA_TYPE_ID
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public void setDataTypeId(Integer dataTypeId) {
		this.dataTypeId = dataTypeId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column V_ENDPOINT_ATTR.DATA_TYPE_NAME
	 * @return  the value of V_ENDPOINT_ATTR.DATA_TYPE_NAME
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public String getDataTypeName() {
		return dataTypeName;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column V_ENDPOINT_ATTR.DATA_TYPE_NAME
	 * @param dataTypeName  the value for V_ENDPOINT_ATTR.DATA_TYPE_NAME
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public void setDataTypeName(String dataTypeName) {
		this.dataTypeName = dataTypeName;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column V_ENDPOINT_ATTR.DATA_TYPE_CODE
	 * @return  the value of V_ENDPOINT_ATTR.DATA_TYPE_CODE
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public String getDataTypeCode() {
		return dataTypeCode;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column V_ENDPOINT_ATTR.DATA_TYPE_CODE
	 * @param dataTypeCode  the value for V_ENDPOINT_ATTR.DATA_TYPE_CODE
	 * @ibatorgenerated  Wed Apr 28 20:49:21 CST 2010
	 */
	public void setDataTypeCode(String dataTypeCode) {
		this.dataTypeCode = dataTypeCode;
	}

}
