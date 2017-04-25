package com.rentsystem.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.rentsystem.dao.HouseInfoDAO;
import com.rentsystem.vo.HouseInfoVO;

import java.sql.*;

public class HouseInfoDAOImpl implements HouseInfoDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	
	public HouseInfoDAOImpl(Connection conn){
		this.conn = conn;
	}

	public boolean addHouse(HouseInfoVO house) {
		boolean flag = false;
		String SQL = "INSERT INTO HouseInfoTable VALUES (?,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, house.getHouseId());
			pstmt.setString(2, house.getHouseName());
			pstmt.setString(3, house.getInTime());
			pstmt.setInt(4, house.getNumOfPeople());
			pstmt.setString(5, house.getOutTime());
			pstmt.setString(6, house.getPeopleName());
			pstmt.setInt(7, house.getPrice());
			if(pstmt.executeUpdate() != 0){
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public boolean delHouseByCondition(String condition) {
		boolean flag = false;
		String SQL = "DELETE FROM HouseInfoTable WHERE " + condition;
		try {
			pstmt = conn.prepareStatement(SQL);
			if(pstmt.executeUpdate() != 0){
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public boolean updateHouseInfo(String condition) {
		boolean flag = false;
		String SQL = condition;
		try {
			pstmt = conn.prepareStatement(SQL);
			if(pstmt.executeUpdate() != 0){
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public ResultSet getAllHouses() {
		ResultSet rs = null;
		String SQL = "SELECT * FROM HouseInfoTable";
		try {
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public ResultSet getHousesByCondition(String condition) {
		ResultSet rs = null;
		String SQL = "SELECT * FROM HouseInfoTable WHERE " + condition;
		try {
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

}
