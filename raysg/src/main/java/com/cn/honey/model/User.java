package com.cn.honey.model;

import java.io.Serializable;
/**
 * 
 * @author wzy
 * @since 2016.8.11
 * �û�ʵ����
 */
public class User implements Serializable {
	/**
	 * ���л�ID�����÷���ʱ�ͱ����ļ����л�ID���бȶ�
	 */
	private static final long serialVersionUID = -2318878607245041337L;
	//�û�Id
	private int userId;
	//�û�����
	private String name;
	//�û�ͼ��
	private String photo;
	//�û��绰
	private String phone;
	//�û�����
	private String password;
	//�û�����
	private String birthday;
	//�û��Ա�
	private String gender;
	//�û���ַ
	private String location;
	//�û�ģʽ
	private int userModel;
	//�û���ֵ
	private double threshold;
	//������ȫ��������
	private int safe;
	//�û��豸ID
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
