package com.ailk.eaap.o2p.fileExchange.model;

import java.io.Serializable;
import java.util.List;

import com.ailk.eaap.op2.bo.ContractFormat;

public class FileExchangeContractFormat extends ContractFormat implements Serializable {
	
	private static final long serialVersionUID = 1L;
	//add by wuwz
	private List<ContractAttrSpecBean> casbList;
	
	public List<ContractAttrSpecBean> getCasbList() {
		return casbList;
	}
	public void setCasbList(List<ContractAttrSpecBean> casbList) {
		this.casbList = casbList;
	}
}
