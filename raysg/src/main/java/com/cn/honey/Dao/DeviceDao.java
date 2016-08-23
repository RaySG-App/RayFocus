package com.cn.honey.Dao;

import com.cn.honey.model.Device;

public interface DeviceDao {
	
	  public abstract int insert(Device paramDevice);

	  public abstract Device select(Integer paramInteger);
	  
	  
	  
}
