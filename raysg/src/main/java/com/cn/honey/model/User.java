package com.cn.honey.model;

import java.io.Serializable;
/**
 * 
 * @author wzy
 * @since 2016.8.11
 * 用户实体类
 */
public class User implements Serializable {
	/**
	 * 序列化ID，调用方法时和本地文件序列化ID进行比对
	 */
	private static final long serialVersionUID = -2318878607245041337L;
	//用户Id
	private int userId;
	//用户姓名
	private String name;
	//用户图像
	private String photo;
	//用户电话
	private String phone;
	//用户密码
	private String password;
	//用户生日
	private String birthday;
	//用户性别
	private String gender;
	//用户地址
	private String location;
	//用户模式
	private int userModel;
	//用户阈值
	private double threshold;
	//超过安全报警次数
	private int safe;
	//用户设备ID
	private int deviceId;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getUserModel() {
		return userModel;
	}
	public void setUserModel(int userModel) {
		this.userModel = userModel;
	}
	public double getThreshold() {
		return threshold;
	}
	public void setThreshold(double threshold) {
		this.threshold = threshold;
	}
	public int getSafe() {
		return safe;
	}
	public void setSafe(int safe) {
		this.safe = safe;
	}
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	
}
