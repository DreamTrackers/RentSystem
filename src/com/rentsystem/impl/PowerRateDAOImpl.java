package com.rentsystem.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rentsystem.dao.PowerRateDAO;
import com.rentsystem.vo.PowerRateVO;

public class PowerRateDAOImpl implements PowerRateDAO{
	private Connection conn = null;
	private PreparedStatement pstmt = null;

	public boolean addPowerRate(PowerRateVO powerRate) {
		boolean flag = false;
		String SQL = "INSERT INTO PowerRateTable VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, powerRate.getPowerRateId());
			pstmt.setInt(2, powerRate.getHouseId());
			pstmt.setString(3, powerRate.getPayDate());
			pstmt.setDouble(4, powerRate.getNumberForLast());
			pstmt.setDouble(5, powerRate.getNumberForThis());
			pstmt.setDouble(6, powerRate.getDifference());
			pstmt.setDouble(7, powerRate.getPrice());
			pstmt.setDouble(8, powerRate.getShouldPay());
			pstmt.setDouble(9, powerRate.getRealPay());
			pstmt.setString(10, powerRate.getPayer());
			pstmt.setString(11,powerRate.getPayVal());
			if(pstmt.executeUpdate() != 0){
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public ResultSet getAllPowerRateRecord() {
		ResultSet rs = null;
		String SQL = "SELECT * FROM PowerRateTable";
		try {
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public boolean delPowerRateByCondition(String condition) {
		boolean flag = false;
		String SQL = "DELETE FROM PowerRateTable WHERE " + condition;
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

	public ResultSet getPowerRateByCondition(String condition) {
		ResultSet rs = null;
		String SQL = "SELECT * FROM PowerRateTable WHERE " + condition;
		try {
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

}
