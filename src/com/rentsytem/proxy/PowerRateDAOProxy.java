package com.rentsytem.proxy;

import java.sql.ResultSet;

import com.rentsystem.dao.PowerRateDAO;
import com.rentsystem.dbconn.DBHelper;
import com.rentsystem.impl.PowerRateDAOImpl;
import com.rentsystem.vo.PowerRateVO;

public class PowerRateDAOProxy implements PowerRateDAO{

	private DBHelper db = null;
	private PowerRateDAO powerRateDAOImpl = null;
	
	public PowerRateDAOProxy(){
		db = new DBHelper();
		powerRateDAOImpl = new PowerRateDAOImpl(this.db.getConnection());
	}
	
	@Override
	public boolean addPowerRate(PowerRateVO powerRate) {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.powerRateDAOImpl.addPowerRate(powerRate);
		this.db.close();
		return flag;
	}

	@Override
	public ResultSet getAllPowerRateRecord() {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		rs = this.powerRateDAOImpl.getAllPowerRateRecord();
		this.db.close();
		return rs;
	}

	@Override
	public boolean delPowerRateByCondition(String condition) {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.powerRateDAOImpl.delPowerRateByCondition(condition);
		this.db.close();
		return flag;
	}

	@Override
	public ResultSet getPowerRateByCondition(String condition) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		rs = this.powerRateDAOImpl.getPowerRateByCondition(condition);
		this.db.close();
		return rs;
	}

}
