package com.rentsystem.dao;

import java.sql.*;
import com.rentsystem.vo.HouseInfoVO;

public interface HouseInfoDAO {
	
	public boolean addHouse(HouseInfoVO house);
	
	public boolean delHouseByCondition(String condition);
	
	public boolean updateHouseInfo(String condition);
	
	public ResultSet getAllHouses();
	
	public ResultSet getHousesByCondition(String condition);
}
