package com.rentsystem.dao;

import com.rentsystem.vo.*;

public interface AdminUserDAO {
	
	/**
	 * Add a new admin for the system
	 * @param admin: the new administrator which will be added.
	 * @return true: add success; false: add fail
	 */
	public boolean addNewAdmin(AdminUserVO admin);
	
	/**
	 * Check if the admin is logged in the system
	 * @param admin the logged admin
	 * @return true if login success, false when login fail
	 */
	public boolean isLogin(AdminUserVO admin);
	
	public boolean delAdmin(AdminUserVO admin);
}
