package com.rentsystem.impl;

import com.rentsystem.dao.AdminUserDAO;
import com.rentsystem.vo.AdminUserVO;

import java.sql.*;

public class AdminUserDAOImpl implements AdminUserDAO{
	
	private Connection conn = null ;
	private PreparedStatement pstmt = null ;
	
	public AdminUserDAOImpl(Connection conn){
		this.conn = conn;
	}

	public boolean addNewAdmin(AdminUserVO admin) {
		boolean flag = false;
		String SQL = "INSERT INTO AdminUsersTable VALUES (?,?,?)";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, admin.getAdminId());
			pstmt.setString(2, admin.getUserName());
			pstmt.setString(3, admin.getPassWord());
			if(pstmt.executeUpdate() != 0){
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return flag;
	}

	public boolean isLogin(AdminUserVO admin) {
		boolean flag = false;
		String SQL = "SELECT * FROM AdminUsersTable WHERE userName = ? AND passWord = ?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, admin.getUserName());
			pstmt.setString(2, admin.getPassWord());
			if(pstmt.executeQuery() != null){
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public boolean delAdmin(AdminUserVO admin) {
		boolean flag = false;
		String SQL = "DELETE FROM AdminUsersTable WHERE userName = ? AND passWord = ?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, admin.getUserName());
			pstmt.setString(2, admin.getPassWord());
			if(pstmt.executeUpdate() != 0){
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

}
