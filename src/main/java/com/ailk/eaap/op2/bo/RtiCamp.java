package com.ailk.eaap.op2.bo;

import java.io.Serializable;
/**
 * @author linyy
 * RTI营销话单协议信息
 * */
public class RtiCamp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String campId;
	private String customerId;
	private String customerName;
	private String phoneNumber;
	private String pushTime;	
	private String channelType;
	private String channelId;
	private String eventRuleId;
	private String timeZone;
	public String getCampId() {
		return campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPushTime() {
		return pushTime;
	}
	public void setPushTime(String pushTime) {
		this.pushTime = pushTime;
	}
	public String getChannelType() {
		return channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getEventRuleId() {
		return eventRuleId;
	}
	public void setEventRuleId(String eventRuleId) {
		this.eventRuleId = eventRuleId;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
