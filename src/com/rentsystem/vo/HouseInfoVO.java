package com.rentsystem.vo;

public class HouseInfoVO {

	private int houseId = 0;
	private String houseName = null;
	private int price = 0;
	private String inTime = null;
	private String outTime = null;
	private int numOfPeople = 0;
	private String peopleName = null;
	
	public HouseInfoVO(int id, String housename, int fee, String intime, String outtime, int num, String peoplename){
		this.houseId = id;
		this.houseName = housename;
		this.price = fee;
		this.inTime = intime;
		this.outTime = outtime;
		this.numOfPeople = num;
		this.peopleName = peoplename;
	}
	
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	public int getNumOfPeople() {
		return numOfPeople;
	}
	public void setNumOfPeople(int numOfPeople) {
		this.numOfPeople = numOfPeople;
	}
	public String getPeopleName() {
		return peopleName;
	}
	public void setPeopleName(String peopleName) {
		this.peopleName = peopleName;
	}
	
}
