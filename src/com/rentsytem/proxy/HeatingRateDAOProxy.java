package com.rentsytem.proxy;

import java.sql.ResultSet;

import com.rentsystem.dao.HeatingRateDAO;
import com.rentsystem.dbconn.DBHelper;
import com.rentsystem.impl.HeatingRateDAOImpl;
import com.rentsystem.vo.HeatingRateVO;

public class HeatingRateDAOProxy implements HeatingRateDAO {
	private DBHelper db = null;
	private HeatingRateDAO heatingRateDAOImpl = null;

	public HeatingRateDAOProxy(){
		db = new DBHelper();
		heatingRateDAOImpl = new HeatingRateDAOImpl(this.db.getConnection());
	}
	public boolean addHeatingRate(HeatingRateVO heatingRate) {
		boolean flag = false;
		flag = heatingRateDAOImpl.addHeatingRate(heatingRate);
		db.close();
		return flag;
	}

	public boolean delHeatingRateByCondition(String conditon) {
		boolean flag = false;
		flag = heatingRateDAOImpl.delHeatingRateByCondition(conditon);
		db.close();
		return flag;
	}

	public ResultSet getAllHeatingRateRecord() {
		ResultSet rs = null;
		rs = heatingRateDAOImpl.getAllHeatingRateRecord();
		db.close();
		return rs;
	}

	public ResultSet getHeatingRateRecordByCondition(String condition) {
		ResultSet rs = null;
		rs = heatingRateDAOImpl.getHeatingRateRecordByCondition(condition);
		db.close();
		return rs;
	}

}
