package com.asiainfo.integration.o2p.billing;

import java.io.Serializable;


public class APICdrPacketBean implements Serializable{
	private static final long serialVersionUID = 1L;
	//4bit  API报文版本号，当前为0x01
	private byte   	version = 0x01;					
	//4bit 保留位，为后续扩展用
	private byte  	reservedBit;						
	//1 Byte 指定本话单所属的类型 1.普通话单 2.文件话单
	private byte  	messageType;				
	//18 Byte 消息的时间格式 有的可以到毫秒级别  也为入库时间201411101231000000
	private String 	messageTime;               
	//4 Bytes 消息序列号，标识消息唯一性的字段，由消息发送方进行设置 最大值4294967295
	private long   	messageSequenceNo;	
	//4Bytes 消息长度，含API话单报文报文头		
	private long   	messageLength;				
	//byte数组  包正文内容
	private byte[] 	messageContentDb;
	private Integer tenantId;

	public byte getVersion() {
		return version;
	}


	public void setVersion(byte version) {
		this.version = version;
	}


	public byte getReservedBit() {
		return reservedBit;
	}


	public void setReservedBit(byte reservedBit) {
		this.reservedBit = reservedBit;
	}


	public byte getMessageType() {
		return messageType;
	}


	public void setMessageType(byte messageType) {
		this.messageType = messageType;
	}


	public String getMessageTime() {
		return messageTime;
	}

	public long getMessageSequenceNo() {
		return messageSequenceNo;
	}


	public void setMessageSequenceNo(long messageSequenceNo) {
		this.messageSequenceNo = messageSequenceNo;
	}


	public long getMessageLength() {
		return messageLength;
	}


	public void setMessageLength(long messageLength) {
		this.messageLength = messageLength;
	}

	public void setMessageTime(String messageTime) {
		
		this.messageTime = messageTime;
		
		int strLen = messageTime.length();
		
		StringBuilder sb = null;
	     while (strLen < 18) {
	           sb = new StringBuilder();
	           sb.append(this.messageTime).append("0");//��0
	           this.messageTime = sb.toString();
	           strLen 	= this.messageTime.length();
	     }
	}






	public byte[] getMessageContentDb() {
		return messageContentDb;
	}
	
	
	public static int getHeadLength() {
		
		return 28;
	}

	public void setMessageContentDb(byte[] messageContentDb) {
		
		this.messageContentDb = messageContentDb;
		
		this.setMessageLength(28+messageContentDb.length);		
		
	}
	
	public Integer getTenantId() {
		return tenantId;
	}


	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}


	public byte[] toByteArray() throws Exception
	{
		byte[] buffer = new byte[(int)this.getMessageLength()];
		
		buffer[0]  = (byte) (((this.getVersion() & 0x0f) << 4) 
				| (this.getReservedBit() & 0x0f));	
			
		buffer[1]  = (byte) (this.getMessageType() & 0xff);					
		
		byte[] time_144b = this.getMessageTime().getBytes();	
			
		buffer[2]  	= time_144b[0];
		buffer[3]  	= time_144b[1];
		buffer[4]  	= time_144b[2];
		buffer[5]  	= time_144b[3];
		buffer[6]  	= time_144b[4];
		buffer[7]  	= time_144b[5];
		buffer[8]  	= time_144b[6];
		buffer[9]  	= time_144b[7];
		buffer[10]  = time_144b[8];
		buffer[11]  = time_144b[9];
		buffer[12]  = time_144b[10];
		buffer[13]  = time_144b[11];
		
		buffer[14]  = time_144b[12];
		buffer[15]  = time_144b[13];
		buffer[16]  = time_144b[14];
		buffer[17]  = time_144b[15];
		buffer[18]  = time_144b[16];
		buffer[19]  = time_144b[17];
			
		buffer[20]  = (byte) (this.getMessageSequenceNo() >> 24 & 0xff);	//Packet.message_SequenceNo_32b
		buffer[21]  = (byte) (this.getMessageSequenceNo() >> 16 & 0xff);
		buffer[22] 	= (byte) (this.getMessageSequenceNo() >> 8 & 0xff);
		buffer[23] 	= (byte) (this.getMessageSequenceNo() & 0xff);
		
		buffer[24] 	= (byte) (this.getMessageLength() >> 24 & 0xff);		//Packet.message_Length_32b
		buffer[25] 	= (byte) (this.getMessageLength() >> 16 & 0xff);
		buffer[26] 	= (byte) (this.getMessageLength() >> 8 & 0xff);
		buffer[27] 	= (byte) (this.getMessageLength() & 0xff);
		
		//APIPacket.message_Content_db ���Ƶ�buffer���ӵ�28�ֽڿ�ʼ
		System.arraycopy(this.getMessageContentDb(), 0, buffer, getHeadLength(), this.getMessageContentDb().length);
			
		return buffer;
	}

}
