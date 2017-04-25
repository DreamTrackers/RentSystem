package com.rentsystem.vo;

public class WaterRateVO {
	
	private int waterRateId = 0;
	private int houseId = 0;
	private String payDate = null;
	private String payVal = null;
	private double shouldPay = 0.0;
	private double realPay = 0.0;
	private String payer = null;
	
	public WaterRateVO(int id, int houseid, String date, String interval,
			double shpay, double repay, String name){
		this.waterRateId = id;
		this.houseId = houseid;
		this.payDate = date;
		this.shouldPay = shpay;
		this.realPay = repay;
		this.payer = name;
		this.payVal = interval;
	}
	
	public int getWaterRateId() {
		return waterRateId;
	}
	public void setWaterRateId(int waterRateId) {
		this.waterRateId = waterRateId;
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
	public String getPayVal() {
		return payVal;
	}
	public void setPayVal(String payVal) {
		this.payVal = payVal;
	}
	public double getShouldPay() {
		return shouldPay;
	}
	public void setShouldPay(double shouldPay) {
		this.shouldPay = shouldPay;
	}
	public double getRealPay() {
		return realPay;
	}
	public void setRealPay(double realPay) {
		this.realPay = realPay;
	}
	public String getPayer() {
		return payer;
	}
	public void setPayer(String payer) {
		this.payer = payer;
	}
	
}
