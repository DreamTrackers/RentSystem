package com.rentsystem.vo;

public class HeatingRateVO {

	private int heatingRateId = 0;
	private int houseId = 0;
	private String payDate = null;
	private double fee = 0.0;
	private String payer = null;
	private String payVal = null;
	
	public int getHeatingRateId() {
		return heatingRateId;
	}
	public void setHeatingRateId(int heatingRateId) {
		this.heatingRateId = heatingRateId;
	}
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	public String getPayDate() {
		return payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getPayer() {
		return payer;
	}
	public void setPayer(String payer) {
		this.payer = payer;
	}
	public String getPayVal() {
		return payVal;
	}
	public void setPayVal(String payVal) {
		this.payVal = payVal;
	}
}
