package com.cn.honey.controller;

import com.cn.honey.model.Device;
import com.cn.honey.service.DeviceService;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/device"})
public class DeviceController{

  @Resource
  private DeviceService deviceService;

  @ResponseBody
  @RequestMapping({"addDevice"})
  public String addDevice(Device device)
  {
    int result = this.deviceService.insertDevice(device);
    if (result == 1) {
      return "success11";
    }
    return "default";
  }
  @ResponseBody
  @RequestMapping({"findDevice"})
  public Map<String, Object> findDevice(Integer deviceId) {
    Map<String, Object>  deviceMap = new HashMap<String, Object> ();
    Device deviceList = this.deviceService.selectDevice(deviceId);
    deviceMap.put("List", deviceList);
    return deviceMap;
  }
}