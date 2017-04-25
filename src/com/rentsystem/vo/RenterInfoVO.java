package com.rentsystem.vo;

public class RenterInfoVO {

	private int renterId = 0;
	private int houseId = 0;
	private String renterIdNum = null;
	private String cellphone = null;
	
	public RenterInfoVO(int id, int houseid, String idNum, String phone){
		this.renterId = id;
		this.houseId = houseid;
		this.renterIdNum = idNum;
		this.cellphone = phone;
	}
	
	public int getRenterId() {
		return renterId;
	}
	public void setRenterId(int renterId) {
		this.renterId = renterId;
	}
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	public String getRenterIdNum() {
		return renterIdNum;
	}
	public void setRenterIdNum(String renterIdNum) {
		this.renterIdNum = renterIdNum;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	
	
}
