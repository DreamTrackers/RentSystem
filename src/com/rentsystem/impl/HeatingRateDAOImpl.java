package com.rentsystem.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rentsystem.dao.HeatingRateDAO;
import com.rentsystem.vo.HeatingRateVO;

public class HeatingRateDAOImpl implements HeatingRateDAO {
	
	private Connection conn = null ;
	private PreparedStatement pstmt = null ;
	
	public HeatingRateDAOImpl(Connection conn){
		this.conn = conn;
	}

	public boolean addHeatingRate(HeatingRateVO heatingRate) {
		boolean flag = false;
		String SQL = "INSERT INTO HeatingRateTable VALUES (?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, heatingRate.getHeatingRateId());
			pstmt.setInt(2, heatingRate.getHouseId());
			pstmt.setString(3, heatingRate.getPayDate());
			pstmt.setDouble(4, heatingRate.getFee());
			pstmt.setString(5,heatingRate.getPayer());
			pstmt.setString(6,heatingRate.getPayVal());
			if(pstmt.executeUpdate() != 0){
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public boolean delHeatingRateByCondition(String condition) {
		boolean flag = false;
		String SQL = "DELETE FROM HeatingRateTable WHERE " + condition;
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

	public ResultSet getAllHeatingRateRecord() {
		ResultSet rs = null;
		String SQL = "SELECT * FROM HeatingRataTable";
		try {
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public ResultSet getHeatingRateRecordByCondition(String condition) {
		ResultSet rs = null;
		String SQL = "SELECT * FROM HeatingRateTable WHERE " + condition;
		try {
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

}
