package com.rentsystem.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rentsystem.dao.WaterRateDAO;
import com.rentsystem.vo.WaterRateVO;

public class WaterRateDAOImpl implements WaterRateDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;

	public boolean addWaterRate(WaterRateVO waterRate) {
		boolean flag = false;
		String SQL = "INSERT IINTO WaterRateTable VALUES (?,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, waterRate.getWaterRateId());
			pstmt.setInt(2, waterRate.getHouseId());
			pstmt.setString(3, waterRate.getPayDate());
			pstmt.setString(4, waterRate.getPayVal());
			pstmt.setDouble(5, waterRate.getShouldPay());
			pstmt.setDouble(6, waterRate.getRealPay());
			pstmt.setString(7, waterRate.getPayer());
			if(pstmt.executeUpdate() != 0){
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public boolean delWaterRateByCondition(String condition) {
		boolean flag = false;
		String SQL = "DELETE FROM WaterRateTable WHERE " + condition;
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

	public ResultSet getAllWaterRateRecord() {
		ResultSet rs = null;
		String SQL = "SELECT * FROM WaterRateTable";
		try {
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public ResultSet getWaterRateRecordByCondition(String condition) {
		ResultSet rs = null;
		String SQL = "SELECT * FROM WaterRateTable WHERE " + condition;
		try {
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

}
