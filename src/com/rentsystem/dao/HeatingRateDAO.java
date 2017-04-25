package com.rentsystem.dao;

import com.rentsystem.vo.HeatingRateVO;
import java.sql.ResultSet;

public interface HeatingRateDAO {
	/**
	 * add heating record when someone pay the heating fee
	 * @param heatingRate information of this payment
	 * @return true if success
	 */
	public boolean addHeatingRate(HeatingRateVO heatingRate);
	
	public boolean delHeatingRateByCondition(String conditon);
	
	public ResultSet getAllHeatingRateRecord();
	
	public ResultSet getHeatingRateRecordByCondition(String condition);
}
