package com.asiainfo.integration.o2p.billing;

import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;



public class APIAckPacketBean implements Serializable {
	private static final long serialVersionUID = 1L;
	//18 Byte 消息的时间格式 有的可以到毫秒级别  也为入库时间201411101231000000
	private String 	messageTime;               
	//4 Bytes 消息序列号，标识消息唯一性的字段，由消息发送方进行设置
	private long   	messageSequenceNo;	
	//1 Bytes 返回类型代码
	private byte 	ackPacketErrorStatus;
	//2 Bytes 返回信息长度 ，含API话单ACK报文报文头
	private int   	ackPacketErrorInfoLength;
	//Byes 返回信息详细描述
	private byte[] 	ackPacketErrorInfoDb;
	
	public String getMessageTime() {
		return messageTime;
	}


	public void setMessageTme(String messageTime) {
		this.messageTime = messageTime;
				
		int strLen = messageTime.length();
		
	     StringBuilder sb = null;
	     while (strLen < 18) {
	           sb = new StringBuilder();
	           sb.append(this.messageTime).append("0");
	           this.messageTime = sb.toString();
	           strLen 	= this.messageTime.length();
	     }	     
	}


	public long getMessageSequenceNo() {
		return messageSequenceNo;
	}


	public void setMessageSequenceNo(long messageSequenceNo) {
		this.messageSequenceNo = messageSequenceNo;
	}


	public byte getAckPacketErrorStatus() {
		return ackPacketErrorStatus;
	}


	public void setAckPacketErrorStatus(byte ackPacketErrorStatus) throws UnsupportedEncodingException {
		this.ackPacketErrorStatus = ackPacketErrorStatus;
		String messAck ="";
		switch(ackPacketErrorStatus)
		{
		
			case 0:
				messAck ="success";		
				this.setackPacketErrorInfoDb(messAck.getBytes("UTF-8"));	
				this.setAckPacketErrorInfoLength(getHeadLength()+messAck.getBytes("UTF-8").length);
				break;
			case 1:
				messAck ="Message header length error";
				this.setackPacketErrorInfoDb(messAck.getBytes());
				this.setAckPacketErrorInfoLength(getHeadLength()+messAck.getBytes("UTF-8").length);
				break;
			case 2:
				messAck ="The body of the message field error";
				this.setackPacketErrorInfoDb(messAck.getBytes());
				this.setAckPacketErrorInfoLength(getHeadLength()+messAck.getBytes("UTF-8").length);
				break;				
			case 3:
				messAck ="Message queue exceeds capacity";
				this.setackPacketErrorInfoDb(messAck.getBytes());
				this.setAckPacketErrorInfoLength(getHeadLength()+messAck.getBytes("UTF-8").length);
				break;
			case 4:
				messAck ="Database exception";
				this.setackPacketErrorInfoDb(messAck.getBytes());
				this.setAckPacketErrorInfoLength(getHeadLength()+messAck.getBytes("UTF-8").length);
				break;
		}
	}


	public int getAckPacketErrorInfoLength() {
		return ackPacketErrorInfoLength;
	}


	public void setAckPacketErrorInfoLength(int ackPacketErrorInfoLength) {
		this.ackPacketErrorInfoLength = ackPacketErrorInfoLength;
	}


	public byte[] getackPacketErrorInfoDb() {
		return ackPacketErrorInfoDb;
	}


	public void setackPacketErrorInfoDb(byte[] ackPacketErrorInfoDb) {
		this.ackPacketErrorInfoDb = ackPacketErrorInfoDb;
	}

	
	public static int getHeadLength()
	{
		
		return 25;
	}

	
	public byte[] toByteArray() throws Exception
	{
		
		byte[] buffer = new byte[(int)this.getAckPacketErrorInfoLength()];
				
		byte[] time_144b = this.getMessageTime().getBytes();				
		buffer[0]  = time_144b[0];
		buffer[1]  = time_144b[1];
		buffer[2]  = time_144b[2];
		buffer[3]  = time_144b[3];
		buffer[4]  = time_144b[4];
		buffer[5]  = time_144b[5];
		buffer[6]  = time_144b[6];
		buffer[7]  = time_144b[7];
		buffer[8]  = time_144b[8];
		buffer[9]  = time_144b[9];
		buffer[10]  = time_144b[10];
		buffer[11]  = time_144b[11];
		
		buffer[12]  = time_144b[12];
		buffer[13]  = time_144b[13];
		buffer[14]  = time_144b[14];
		buffer[15]  = time_144b[15];
		buffer[16]  = time_144b[16];
		buffer[17]  = time_144b[17];
		
		//AckPacket.ack_messageSequenceNo			
		buffer[18] = (byte) (this.getMessageSequenceNo() >> 24 & 0xff);	
		buffer[19] = (byte) (this.getMessageSequenceNo() >> 16 & 0xff);
		buffer[20] = (byte) (this.getMessageSequenceNo() >> 8 & 0xff);
		buffer[21] = (byte) (this.getMessageSequenceNo() & 0xff);
		
		buffer[22] = (byte) (this.getAckPacketErrorStatus()& 0xff);
		//AckPacket.ack_message_No_16b
		buffer[23] = (byte) (this.getAckPacketErrorInfoLength() >> 8 & 0xff);
		buffer[24] = (byte) (this.getAckPacketErrorInfoLength() & 0xff);
		
	
		//AckPacket.ackPacketErrorInfoDb 复制到buffer，从第25字节开始
		System.arraycopy(this.getackPacketErrorInfoDb(), 0, buffer, getHeadLength(), this.getackPacketErrorInfoDb().length);
			
		return buffer;
	}
	
	
	public void writeToStream(OutputStream outStream) throws Exception
	{
		if (outStream==null)
			throw new RuntimeException("in APIAckPacketBean.writeToStream:"+"OutputStream is null");
		
		byte[] buffer = this.toByteArray();
		
		outStream.write(buffer);
		outStream.flush();
	}
}
