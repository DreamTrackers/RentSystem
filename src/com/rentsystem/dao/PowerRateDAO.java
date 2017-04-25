package com.rentsystem.dao;

import com.rentsystem.vo.PowerRateVO;
import java.sql.*;

public interface PowerRateDAO {

	public boolean addPowerRate(PowerRateVO powerRate);
	
	public ResultSet getAllPowerRateRecord();
	
	public boolean delPowerRateByCondition(String condition);
	
	public ResultSet getPowerRateByCondition(String condition);
}
