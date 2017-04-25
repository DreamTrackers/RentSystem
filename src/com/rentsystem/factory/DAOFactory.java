package com.rentsystem.factory;

import com.rentsystem.dao.*;
import com.rentsytem.proxy.*;

public class DAOFactory {

	public static AdminUserDAO getAdminUserDAOInstance(){
		return new AdminUserDAOProxy();
	}
	
	public static HeatingRateDAO getHeatingRateDAOInstance(){
		return new HeatingRateDAOProxy();
	}
	
	public static HouseInfoDAO getHouseInfoDAOInstance(){
		return new HouseInfoDAOProxy();
	}
	
	public static PowerRateDAO getPowerRateDAOInstance(){
		return new PowerRateDAOProxy();
	}
	
	public static RenterInfoDAO getRenterInfoDAOInstance(){
		return new RenterInfoDAOProxy();
	}
	
	public static WaterRateDAO getWaterRateDAOInstance(){
		return new WaterRateDAOProxy();
	}
}
