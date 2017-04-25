package com.rentsytem.proxy;

import java.sql.ResultSet;

import com.rentsystem.dao.WaterRateDAO;
import com.rentsystem.dbconn.DBHelper;
import com.rentsystem.impl.WaterRateDAOImpl;
import com.rentsystem.vo.WaterRateVO;

public class WaterRateDAOProxy implements WaterRateDAO{

	private DBHelper db = null;
	private WaterRateDAO waterRateDAOImpl = null;
	
	public WaterRateDAOProxy(){
		this.db = new DBHelper();
		this.waterRateDAOImpl = new WaterRateDAOImpl(this.db.getConnection());
	}
	
	@Override
	public boolean addWaterRate(WaterRateVO waterRate) {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.waterRateDAOImpl.addWaterRate(waterRate);
		this.db.close();
		return flag;
	}

	@Override
	public boolean delWaterRateByCondition(String condition) {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.waterRateDAOImpl.delWaterRateByCondition(condition);
		this.db.close();
		return flag;
	}

	@Override
	public ResultSet getAllWaterRateRecord() {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		rs = this.waterRateDAOImpl.getAllWaterRateRecord();
		this.db.close();
		return rs;
	}

	@Override
	public ResultSet getWaterRateRecordByCondition(String condition) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		rs = this.waterRateDAOImpl.getWaterRateRecordByCondition(condition);
		this.db.close();
		return rs;
	}

}
