package com.cn.honey.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.honey.model.User;
import com.cn.honey.service.UserService;

@Controller
@RequestMapping({"/user"})
public class UserController{

  @Autowired
  private UserService userService;

  @ResponseBody
  @RequestMapping({"addUser"})
  public String addUser(User user)
  {
    int result = this.userService.insertUser(user);
    if (result == 1) {
      return "录入成功1111";
    }
    return "录入失败";
  }
  @ResponseBody
  @RequestMapping({"updateUser"})
  public String updateUser(HttpServletRequest request, User user) {
    String photo = request.getParameter("photo");
    String name = request.getParameter("name");
    String phone = request.getParameter("phone");
    String password = request.getParameter("password");
    String birthday = request.getParameter("birthday");
    String gender = request.getParameter("gender");
    String location = request.getParameter("location");
    String userModel = request.getParameter("userModel");
    String threshold = request.getParameter("threshold");
    String safe = request.getParameter("safe");
    String deviceId = request.getParameter("deviceId");
    user.setPhoto(photo);
    user.setName(name);
    user.setPhone(phone);
    user.setPassword(password);
    user.setBirthday(birthday);
    user.setGender(gender);
    user.setLocation(location);
    user.setUserModel(Integer.parseInt(userModel));
    user.setThreshold(Double.parseDouble(threshold));
    user.setSafe(Integer.parseInt(safe));
    user.setDeviceId(Integer.parseInt(deviceId));
    this.userService.updateUser(user);
    return "";
  }

  @ResponseBody
  @RequestMapping({"findUser"})
  public Map<String, Object> findu(Integer userId)
  {
    User userlist = this.userService.findUsers(userId);
    Map<String, Object> re = new HashMap<String, Object>();
    re.put("list", userlist);
    return re;
  }

  @ResponseBody
  @RequestMapping({"deleteUser"})
  public String deleteUser(Integer userId)
  {
    this.userService.deleteUser(userId);
    return "";
  }
}