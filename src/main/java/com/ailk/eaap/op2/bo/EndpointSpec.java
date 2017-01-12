package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class EndpointSpec implements Serializable{
private static final long serialVersionUID = 1L;
	private int endpointSpecId;
	private String endpointSpecCode;
	private String endpointSpecName;
	private String endpointSpecDesc;
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
	public final static String SERVLET = "servlet";
	public final static String HTTP = "httpcall";
	public final static String WEBSERVICE = "webservicecall";
	public final static String EJB = "ejbcall";
	public final static String FTP = "ftpcall";
	public final static String GOLDENGATE = "GOLDENGATEcall";
	public final static String JMS = "jmscall";
	public final static String JMSRECEIVE = "JMSRECEIVE";
	public final static String IBMMQ = "IBMMQcall";
	
	public final static String BEGIN = "BEGIN";
	public final static String IN = "IN";
	public final static String TIMER = "timer";
	public final static String BEAN = "bean";
	public final static String MemoryQ = "mq";
	public final static String IBMMQACCESS = "wmq";
	public final static String ActiveMQ = "amq";
	public final static String TRANSFORMER = "transformer";//转换端点
	public final static String JDBC = "jdbc";//jdbc端点
	public final static String SERVICE = "service";
	public final static String PROF  = "PROF";//认证端点
	public final static String FLOW   = "FLOW";//流量控制端点
	public final static String ENRICH   = "ENRICH";//丰富端点
	public final static String CALL   = "CALL";//调用端点
	public final static String ASYNCALLBACK   = "ASYNCALLBACK";//异步回调端点
	public final static String VALIDATE   = "VALIDATE";//校验端点
	public final static String OBSCURE = "OBSCURE";//模糊端点
	public final static String GenerateToken = "GenerateToken";//生成token端点
	public final static String AUTH = "AUTH";//授权端点
	public final static String ENCRYPT = "ENCRYPT";//加密端点
	public final static String ASYN = "ASYN";//异步端点
	public final static String BATCH_PRARSE = "BATCH_PRARSE";//批量解析
	public final static String HTTPACCESS = "HTTPACCESS";//http访问
	public final static String GOLDENGATEACCESS = "GOLDENGATEACCESS";//gg访问
	public final static String FTPACCESS = "FTPACCESS";//文件访问
	public final static String SOCKETACCESS = "SOCKETACCESS";//socket访问
	
	public final static String EJBACCESS = "EJBACCESS";//ejb访问
	public final static String WEBSERVICEACCESS = "WEBSERVICEACCESS";//webservice访问
	public final static String END = "END";//结束
	
	public final static String dyncScriptEndpoint = "dyncScriptEndpoint";//自定义端点
	
	public final static String CIRCLE = "CIRCLE";//循环端点
	public final static String ORDER_DEAL = "ORDERDEAL";
	public final static String TUXEDOCALL = "tuxedocall";
	
	public final static String Interception = "Interception";
	public final static String templateReplace = "templateReplace";
	
	public final static String FILE_CHECK = "FILECHECK";
	public final static String FILE_ADAPTER = "FILEADAPTER";
	public final static String FILE_MOVE = "FILEMOVE";
	public static final String TRANSFORMERv2 = "TRANSFORMER-v2";
	public static final String ZIP_FILE_END = "ZIP_FILE_END";
	public static final String FETCH_FILE_END = "FETCH_FILE_END";
	public static final String REMOVE_FILE_END = "REMOVE_FILE_END";
	
	public static final String DOWNLOAD_FILE = "download";
	public static final String FILE_PUBLISH = "filepublish";
	public static final String FILE_SUBSCRIBE = "filesubscribe";
	public final static String FILE_MOVEV2 = "filemove-v2";
	public static final String JDBC_INOUT = "JDBC_INOUT";
	
	public static final String PLUGINS_CALL_END = "PLUGINS_CALL_END";
	public static final String FILERENAME = "filerename";
	
	public static final String FLAT_FILE_READER = "FLAT_FILE_READER";
	public static final String XML_FILE_READER = "XML_FILE_READER";
	
	public static final String JMSTOPICCONSUMER = "JMSTOPICCONSUMER";
	public static final String JMSTOPICPRODUCER = "JMSTOPICPRODUCER";
	
	public void setEndpointSpecId(int endpointSpecId){
		this.endpointSpecId=endpointSpecId;
	}
	public int getEndpointSpecId(){
		return this.endpointSpecId;
	}
	public void setEndpointSpecCode(String endpointSpecCode){
		this.endpointSpecCode=endpointSpecCode;
	}
	public String getEndpointSpecCode(){
		return this.endpointSpecCode;
	}
	public void setEndpointSpecName(String endpointSpecName){
		this.endpointSpecName=endpointSpecName;
	}
	public String getEndpointSpecName(){
		return this.endpointSpecName;
	}
	public void setEndpointSpecDesc(String endpointSpecDesc){
		this.endpointSpecDesc=endpointSpecDesc;
	}
	public String getEndpointSpecDesc(){
		return this.endpointSpecDesc;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
}
