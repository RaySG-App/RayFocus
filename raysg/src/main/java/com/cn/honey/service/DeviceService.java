package com.cn.honey.service;

import com.cn.honey.model.Device;

public abstract interface DeviceService{
	
  public abstract int insertDevice(Device paramDevice);

  public abstract Device selectDevice(Integer paramInteger);
}