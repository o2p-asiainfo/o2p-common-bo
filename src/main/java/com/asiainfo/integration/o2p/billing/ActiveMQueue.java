/** 
 * Project Name:o2p-common-bo 
 * File Name:ActiveMQueue.java 
 * Package Name:com.asiainfo.integration.o2p.billing 
 * Date:2015年1月21日下午2:27:11 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integration.o2p.billing;  

import java.io.Serializable;

/** 
 * ClassName:ActiveMQueue  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年1月21日 下午2:27:11  
 * @author   wushuzhen 
 * @version   
 * @since    JDK 1.7 
 *        
 */
public class ActiveMQueue implements Serializable{
	private static final long serialVersionUID = 1L;
	//采集队列信息
	public final static String COLLECTING_ADDRESS = "collecting.activemq.brokerURL";
	public final static String COLLECTING_USER_NAME = "collecting.activemq.userName";
	public final static String COLLECTING_PASSWORD = "collecting.activemq.password";
	public final static String COLLECTING_TIMEOUT = "collecting.activemq.receiveTime";
	public final static String COLLECTING_DESTINATIONNAME = "collecting.activemq.queueDestination";
	public final static String COLLECTING_CONSUMERNUM="collecting.consumerNum ";
	
	//分拣队列信息
	public final static String DISTRIBUTION_ADDRESS = "distribution.activemq.brokerURL";
	public final static String DISTRIBUTION_USER_NAME = "distribution.activemq.userName";
	public final static String DISTRIBUTION_PASSWORD = "distribution.activemq.password";
	public final static String DISTRIBUTION_TIMEOUT = "distribution.activemq.receiveTime";
	public final static String DISTRIBUTION_DESTINATIONNAME = "distribution.activemq.queueDestination";
	public final static String DISTRIBUTION_CONSUMERNUM="distribution.consumerNum ";
	
	
	//合并队列信息-按次
	public final static String COMBINE_TIMES_ADDRESS = "combine_times.activemq.brokerURL";
	public final static String COMBINE_TIMES_USER_NAME = "combine_times.activemq.userName";
	public final static String COMBINE_TIMES_PASSWORD = "combine_times.activemq.password";
	public final static String COMBINE_TIMES_TIMEOUT = "combine_times.activemq.receiveTime";
	public final static String COMBINE_TIMES_DESTINATIONNAME = "combine_times.activemq.queueDestination";
	public final static String COMBINE_TIMES_CONSUMERNUM="combine_times.consumerNum ";
	
	//合并队列信息-按流量
	public final static String COMBINE_FLOW_ADDRESS = "combine_flow.activemq.brokerURL";
	public final static String COMBINE_FLOW_USER_NAME = "combine_flow.activemq.userName";
	public final static String COMBINE_FLOW_PASSWORD = "combine_flow.activemq.password";
	public final static String COMBINE_FLOW_TIMEOUT = "combine_flow.activemq.receiveTime";
	public final static String COMBINE_FLOW_DESTINATIONNAME = "combine_flow.activemq.queueDestination";
	public final static String COMBINE_FLOW_CONSUMERNUM="combine_flow.consumerNum ";
	
   //批价队列信息
	public final static String RATING_ADDRESS = "rating.activemq.brokerURL";
	public final static String RATING_USER_NAME = "rating.activemq.userName";
	public final static String RATING_PASSWORD = "rating.activemq.password";
	public final static String RATING_TIMEOUT = "rating.activemq.receiveTime";
	public final static String RATING_DESTINATIONNAME = "rating.activemq.queueDestination";
	public final static String RATING_CONSUMERNUM="rating.consumerNum ";

	
}
