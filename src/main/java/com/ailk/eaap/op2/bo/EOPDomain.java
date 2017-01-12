package com.ailk.eaap.op2.bo;

/**
 * 
* @ClassName: EOPDomain 
* @Description: �ַ���
* @author com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ�� 
* @date Aug 18, 2011 7:53:08 PM 
*
 */
public class EOPDomain {

	
	//com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ𷽱��Ĵ�Сcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ2M
	public static final int MAX_LIMIT_MESSAGE_SIZE=2*1024*1024;
	
	public static final String ERROR_TRASACTION_ID="9999999999999999999999999999";
	
	public static final String EOP_COMPONENT = "1000010002";

	// REQUEST TCP��ͷcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ���
	public static final String REQUEST_TCP_SCHEMA = "REQUEST_TCP_SCHEMA";

	// RESPONSE TCP��ͷcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ���
	public static final String RESONSE_TCP_SCHEMA = "RESPONSE_TCP_SCHEMA";

	// �ַ�UTF-8
	public static final String CHARSET_UTF8 = "UTF-8";
	public static final String CHARSET_GBK = "GBK";
	public static final String MD5 = "MD5";
	public static final String THREEDES = "3DES";
	//��Ϣģ��
	public static final String MESSAGE_TEMPLATE = "MESSAGE_TEMPLATE";
	
	// com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	public static final String REQ_FLAG = "0";

	// Ӧ��
	public static final String RSP_FLAG = "1";
	
	public static final String YES = "Y";
	
	public static final String XML = "1";
	public static final String JSON = "2";
	public static final String URLGET = "3";
	public static final String FILE = "4";
	public static final String MAP = "5";
	public static final String JSONFORMAT = "json";
	
	public static final String detect = "3";//��ʱ���ԵĿcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ�̽com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ�
	
	public final static String optional="3";//���Գ���һ�λ��߲com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ�
	public final static String mustOne = "1";//ֻ�ܳ���һ��
	public final static String mustmulti = "2";//���ٳ���һ��
	public final static String multi= "4";//���Գ��ֶ�λ��߲com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ�
	
	
	public static final String user_auth = "2";//httpcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	public static final String app_auth = "1";//webServicecom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	
	public final static String NORMAL = "A";//��
	
	public final static String ONLINE = "D";//com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ��

	public final static String F = "F";
	public final static String V = "V";
	
	public final static String fixed = "1";
	public final static String enums = "2";
	public final static String mainData = "3";
	public final static String exceptioncode = "4";
	
	// ͬ��
	public static final String DATA_EXCH_SYNC = "S";

	// �첽
	public static final String DATA_EXCH_ASYN = "A";

	// com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	public static final String DATA_EXCH_BATCH = "B";

	// com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServͨ��Э��SOAP
	public static final String SERVICE_TYPE_SOAP = "SOAP";

	// com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServͨ��Э��HTTP
	public static final String SERVICE_TYPE_HTTP = "HTTP";

	// com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServͨ��Э��SOCKET
	public static final String SERVICE_TYPE_SOCKET = "SOCKET";

	// com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServͨ��Э��FTP
	public static final String SERVICE_TYPE_FTP = "FTP";

	// com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServͨ��Э��IBM MQ
	public static final String SERVICE_TYPE_IBM_MQ = "IBMMQ";
	final static public String EXCHANGE_MODE_SYN = "SYN";
	final static public String EXCHANGE_MODE_ASYN = "ASYN";
	// ·com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ��
	public static final String ROUTE_TYPE_SERVICE_NUMBER = "11"; // ҵ���·��

	public static final String ROUTE_TYPE_REGION_CODE = "12"; // ���·��

	// ���
	public static final String COMPONENT_SUBCRIBED = "Y"; // Y��ͨ��Nδ��ͨ

	public static final String COMPONENT_SIGNED = "Y"; // Yǩ��,Nδǩ��

	public static final String COMPONENT_CONNECTED = "Y"; // Y���ӣ�Ncom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	

	
	public static final String HTTP_GET_PROTOCOL = "1";//httpcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	public static final String HTTP_POST_PROTOCOL = "2";//httpcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	public static final String WEBSERVICE = "6";//webServicecom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	public static final String WEBSERVICE_POST_PROTOCOL = "7";//webServicecom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	public static final String SOAP = "9";//webServicecom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	public static final String TUXDO = "8";//TUXDOcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	public static final String rest = "11";
	public static final String dubbo = "12";
	// �ȴ�Ӧcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServг�ʱ��,30��
	public static final int QUEUE_READ_TIME_OUT = 35 * 1000;

	// ��ݿcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ�ʱʱ��
	public static final int DB_TRANSACTION_TIME_OUT = 5;//3 * 1000;�Ѿ���3���ˣ�lity��

	// Ӧ��/com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ��Ϣcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	public static final int RESPONSE_DESC_LENGTH = 512;
	//com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ/com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ��Ϣcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	public static final int REQUEST_DESC_LENGTH = 128;

	public static final String REQ_QUEUE_KEY = "REQUEST_QUEUE_KEY";

	public static final String RES_QUEUE_KEY = "RES_QUEUE_KEY";

	public static final String EMPTY_STRING = "";
	
	//--------------------------com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ�ܱ���,Эcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ�
	/**
	 * com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ�ܱ���BUS00001
	 */
	public static final String BUS_CODE_BUS00001="BUS00001";
	/**
	 * Эcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ�SVC00001
	 */
	public static final String SVC_CODE_SVC00001="SVC00001";
	/**
	 * com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ�Ƿcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ��ʶ
	 * 
	 * @param resOrReqFlag
	 * @return
	 */
	public static boolean isRequestMessage(String resOrReqFlag) {
		return EOPDomain.REQ_FLAG.equals(resOrReqFlag);
	}
	
	
	//���Դ·�ɣ��̱߳com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServбcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ��Դ���ContextName
	public static final String DepDataSourceContextName = "DepDataSource";
	//���Դ·�ɣ��̱߳com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServбcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ���ContextName
	public static final String DepTabSuffixContextName = "DepTabSuffix";
	//���Դ·�ɣ��̱߳com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServбcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ�ڲcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ���ˮ
	public static final String CiiContextName = "cii";
	//SQLcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServУcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ�д��ʽ
	public static final String DepTabSuffixSQLPattern = "\\$\\{DepTabSuffix\\}";

	//com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	public static final String IPWhite = "WHITELIST";
	//com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	public static final String IPBlack = "BLACKLIST";
	
	//com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ���
	public static final String COUNT_CONTROL = "1";

	//com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ��Сcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	public static final String SIZE_CONTROL = "2";
	
	//com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	public static final String CONCURRENT_CONTROL = "2";
	
	//���תcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	final static public String XQUERY ="XQuery";
	final static public String XSLT = "XSLT";
	
	//���ܷcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ���
	public final static String CENTER_RECEIVE_SRC = "10001";
	//com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ��ط�
	public final static String CENTER_FORWARD_DST = "10002";
	//�յ���ط�Ӧ��
	public final static String CENTER_RECEIVE_DST = "10003";
	//�ظcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ�
	public final static String CENTER_RESPONSE_SRC = "10004";
	//�˵�Ӧ��
	public final static String POINT_RESPONSE = "50001";
	//�˵com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	public final static String POINT_RECEIVE = "50002";
	
	public final static String INSERT = "INSERT";
	public final static String UPDATE = "UPDATE";
	
	//IPcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	public final static String WHITELIST = "WHITELIST";
	//com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	public final static String BLACKLIST = "BLACKLIST";
	//com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServǩ��
	public final static String SIGNEDDATA = "SIGNEDDATA";
	//com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ��֤
	public final static String PLAINTEXT = "PLAINTEXT";
	//com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ���
	public final static String CIPHER = "CIPHER";
	
	/**
	 * com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ���
	 */
	public static final String TIMES = "1";
	/**
	 * com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ
	 */
	public static final String SIZE = "2";
	/**
	 * com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServcom.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ�
	 */
	public static final String THREAD_NUM = "3";

	public static final String MINUTE = "1"; // 
	public static final String HOUR = "2";

}