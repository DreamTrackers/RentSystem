package com.rentsytem.proxy;

import com.rentsystem.dao.AdminUserDAO;
import com.rentsystem.dbconn.DBHelper;
import com.rentsystem.impl.AdminUserDAOImpl;
import com.rentsystem.vo.AdminUserVO;

public class AdminUserDAOProxy implements AdminUserDAO{
	private DBHelper dbHelper = null;
	private AdminUserDAO adminUserDAOImpl = null;
	
	public AdminUserDAOProxy(){
		dbHelper = new DBHelper();
		adminUserDAOImpl = new AdminUserDAOImpl(this.dbHelper.getConnection());
	}

	public boolean addNewAdmin(AdminUserVO admin) {
		boolean flag = false;
		flag = adminUserDAOImpl.addNewAdmin(admin);
		dbHelper.close();
		return flag;
	}

	public boolean isLogin(AdminUserVO admin) {
		boolean flag = false;
		flag = adminUserDAOImpl.isLogin(admin);
		dbHelper.close();
		return flag;
	}

	public boolean delAdmin(AdminUserVO admin) {
		boolean flag = false;
		flag = adminUserDAOImpl.delAdmin(admin);
		dbHelper.close();
		return flag;
	}
}