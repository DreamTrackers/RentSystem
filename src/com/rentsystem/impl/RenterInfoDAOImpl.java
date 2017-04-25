package com.rentsystem.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.rentsystem.dao.RenterInfoDAO;
import com.rentsystem.vo.RenterInfoVO;

import java.sql.*;

public class RenterInfoDAOImpl implements RenterInfoDAO{
	private Connection conn = null;
	private PreparedStatement pstmt = null;

	public RenterInfoDAOImpl(Connection conn){
		this.conn = conn;
	}
	
	public boolean addRenterInfo(RenterInfoVO renter) {
		boolean flag = false;
		String SQL = "INSERT INTO RenterInfoTable VALUES (?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, renter.getRenterId());
			pstmt.setInt(2, renter.getHouseId());
			pstmt.setString(3, renter.getRenterIdNum());
			pstmt.setString(4, renter.getCellphone());
			if(pstmt.executeUpdate() != 0){
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public boolean delRenterByCondition(String condition) {
		boolean flag = false;
		String SQL = "DELETE FROM RenterInfoTable WHERE " + condition;
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

	public ResultSet getAllRenterInfoRecord() {
		ResultSet rs = null;
		String SQL = "SELECT * FROM RenterInfoTable";
		try {
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public ResultSet getRenterInfoByCondition(String condition) {
		ResultSet rs = null;
		String SQL = "SELECT * FROM RenterInfoTable WHERE " + condition;
		try {
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

}
