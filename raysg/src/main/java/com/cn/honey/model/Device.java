package com.cn.honey.model;

import java.io.Serializable;
	/**
	 * 
	 * @author wzy
	 * @since 2016.08.12
	 *	
	 *	设备实体类
	 */
public class Device implements Serializable{

	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 8224704412738680478L;
	//设备Id
	private int device;
	//版本名称
	private String versionName;
	//版本号
	private int versionCode;
	//版本描述
	private String description;
	//////////////////////////////////////////////////////
	public int getDevice() {
		return device;
	}
	public void setDevice(int device) {
		this.device = device;
	}
	public String getVersionName() {
		return versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	public int getVersionCode() {
		return versionCode;
	}
	public void setVersionCode(int versionCode) {
		this.versionCode = versionCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}

