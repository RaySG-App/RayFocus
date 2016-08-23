package com.cn.honey.serviceImp;

import com.cn.honey.Dao.DeviceDao;
import com.cn.honey.model.Device;
import com.cn.honey.service.DeviceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("deviceService")
public class DeviceServiceImp implements DeviceService{

  @Autowired
  private DeviceDao deviceDao;

  public int insertDevice(Device device)
  {
    int result = this.deviceDao.insert(device);
    return result;
  }

  public Device selectDevice(Integer deviceId)
  {
    Device deviceList = this.deviceDao.select(deviceId);
    return deviceList;
  }
}