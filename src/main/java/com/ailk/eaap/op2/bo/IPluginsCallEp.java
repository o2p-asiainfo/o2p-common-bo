package com.ailk.eaap.op2.bo;

import com.asiainfo.integration.o2p.message.IMessageBO;


public interface IPluginsCallEp {
	
	IMessageBO<?> remoteCall(IMessageBO<?> bo);

}
