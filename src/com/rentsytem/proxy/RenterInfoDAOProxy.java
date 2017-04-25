package com.rentsytem.proxy;

import java.sql.ResultSet;

import com.rentsystem.dao.RenterInfoDAO;
import com.rentsystem.dbconn.DBHelper;
import com.rentsystem.vo.RenterInfoVO;

public class RenterInfoDAOProxy implements RenterInfoDAO{
	
	private DBHelper db = null;
	private RenterInfoDAO renterInfoDAOImpl = null;

	@Override
	public boolean addRenterInfo(RenterInfoVO renter) {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.renterInfoDAOImpl.addRenterInfo(renter);
		this.db.close();
		return flag;
	}

	@Override
	public boolean delRenterByCondition(String condition) {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.renterInfoDAOImpl.delRenterByCondition(condition);
		this.db.close();
		return flag;
	}

	@Override
	public ResultSet getAllRenterInfoRecord() {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		rs = this.renterInfoDAOImpl.getAllRenterInfoRecord();
		this.db.close();
		return rs;
	}

	@Override
	public ResultSet getRenterInfoByCondition(String condition) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		rs = this.renterInfoDAOImpl.getRenterInfoByCondition(condition);
		this.db.close();
		return rs;
	}

}
