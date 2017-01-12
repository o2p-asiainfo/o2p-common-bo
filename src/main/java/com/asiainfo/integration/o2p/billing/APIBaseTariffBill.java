package com.asiainfo.integration.o2p.billing;

import java.util.ArrayList;
import java.util.List;

//基础资源
public class APIBaseTariffBill extends APIComponentPrice {

	private static final long serialVersionUID = -176972773712818407L;
	// 计费单位
	private long ratingUnitValue;
	// 计费单位类型
	private byte ratingUnitType;
	//资费类型 1-简单 2-阶梯
	private Integer rateType;
	// 基础资源的费率详情
	private List<APIBaseTariffBillInfo> billInfoList = new ArrayList<APIBaseTariffBillInfo>(
			20);
	
	public Integer getRateType() {
		return rateType;
	}

	public void setRateType(Integer rateType) {
		this.rateType = rateType;
	}

	public List<APIBaseTariffBillInfo> getBillInfoList() {
		return billInfoList;
	}

	public byte getRatingUnitType() {
		return ratingUnitType;
	}

	public void setRatingUnitType(byte ratingUnitType) {
		this.ratingUnitType = ratingUnitType;
	}

	public void setBillInfoList(List<APIBaseTariffBillInfo> billInfoList) {
		this.billInfoList = billInfoList;
	}

	public long getRatingUnitValue() {
		return ratingUnitValue;
	}

	public void setRatingUnitValue(long ratingUnitValue) {
		this.ratingUnitValue = ratingUnitValue;
	}

}
