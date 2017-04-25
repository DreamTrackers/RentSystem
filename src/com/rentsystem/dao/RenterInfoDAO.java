package com.rentsystem.dao;

import com.rentsystem.vo.RenterInfoVO;
import java.sql.*;

public interface RenterInfoDAO {

	public boolean addRenterInfo(RenterInfoVO renter);
	
	public boolean delRenterByCondition(String condition);
	
	public ResultSet getAllRenterInfoRecord();
	
	public ResultSet getRenterInfoByCondition(String condition);
}
