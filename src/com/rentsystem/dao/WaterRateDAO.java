package com.rentsystem.dao;

import com.rentsystem.vo.WaterRateVO;
import java.sql.*;

public interface WaterRateDAO {

	public boolean addWaterRate(WaterRateVO waterRate);
	
	public boolean delWaterRateByCondition(String condition);
	
	public ResultSet getAllWaterRateRecord();
	
	public ResultSet getWaterRateRecordByCondition(String condition);
}
