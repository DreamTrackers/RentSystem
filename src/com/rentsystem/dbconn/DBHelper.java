package com.rentsystem.dbconn;

import java.sql.*;

public class DBHelper {
	
	private final String DBDRIVER = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://127.0.0.1:3306/RentSystem";
	private final String USERNAME = "root";
	private final String PASSWORD = "123456";
	private Connection conn = null ;
	
	public DBHelper() {
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			System.out.println("DB Driver Load failed!");
		}
	}
	
	public Connection getConn(){
		return this.conn;
	}
	
	public void close(){
		try {
			this.conn.close();
		} catch (SQLException e) {
			System.out.println("DB connection close failed!");
		}
	}
}
