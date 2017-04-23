package com.rentsystem.vo;

public class PowerRateVO {
	
	private int powerRateId = 0;
	private int houseId = 0;
	private String payDate = null ;
	private double numberForLast = 0.0;
	private double numberForThis = 0.0;
	private double difference = 0.0;
	private double price = 0.0;
	private double shouldPay = 0.0;
	private double realPay = 0.0;
	private String payer = null;
	private String payVal = null;
	
	public int getPowerRateId() {
		return powerRateId;
	}
	public void setPowerRateId(int powerRateId) {
		this.powerRateId = powerRateId;
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
	public double getNumberForLast() {
		return numberForLast;
	}
	public void setNumberForLast(double numberForLast) {
		this.numberForLast = numberForLast;
	}
	public double getNumberForThis() {
		return numberForThis;
	}
	public void setNumberForThis(double numberForThis) {
		this.numberForThis = numberForThis;
	}
	public double getDifference() {
		return difference;
	}
	public void setDifference(double difference) {
		this.difference = difference;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
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
	public String getPayVal() {
		return payVal;
	}
	public void setPayVal(String payVal) {
		this.payVal = payVal;
	}
	
	
	
}
