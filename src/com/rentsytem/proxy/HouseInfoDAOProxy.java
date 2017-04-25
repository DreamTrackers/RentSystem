package com.rentsytem.proxy;

import java.sql.ResultSet;

import com.rentsystem.dao.HouseInfoDAO;
import com.rentsystem.dbconn.DBHelper;
import com.rentsystem.impl.HouseInfoDAOImpl;
import com.rentsystem.vo.HouseInfoVO;

public class HouseInfoDAOProxy implements HouseInfoDAO{
	
	private DBHelper db = null;
	private HouseInfoDAO houseInfoDAOImpl = null;
	
	public HouseInfoDAOProxy(){
		db = new DBHelper();
		houseInfoDAOImpl = new HouseInfoDAOImpl(this.db.getConnection());
	}

	@Override
	public boolean addHouse(HouseInfoVO house) {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = houseInfoDAOImpl.addHouse(house);
		this.db.close();
		return flag;
	}

	@Override
	public boolean delHouseByCondition(String condition) {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.houseInfoDAOImpl.delHouseByCondition(condition);
		this.db.close();
		return flag;
	}

	@Override
	public boolean updateHouseInfo(String condition) {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.houseInfoDAOImpl.updateHouseInfo(condition);
		this.db.close();
		return flag;
	}

	@Override
	public ResultSet getAllHouses() {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		rs = this.houseInfoDAOImpl.getAllHouses();
		this.db.close();
		return rs;
	}

	@Override
	public ResultSet getHousesByCondition(String condition) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		rs = this.houseInfoDAOImpl.getHousesByCondition(condition);
		this.db.close();
		return rs;
	}

}
