package com.cn.honey.model;

import java.io.Serializable;
	/**
	 * 
	 * @author wzy
	 * @since 2016.08.12
	 * 
	 *	主动标记实体类
	 */
public class MarkRadiation implements Serializable{

	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = -1430091728210953077L;
	
	//主动标记标识
	private int radiationId;
	//辐射剂量率
	private Double radiationPvg;
	//辐射剂量
	private Double radiationAcount;
	//经度
	private Double longitude;
	//纬度
	private Double latitude;
	//国家
	private int country;
	//省
	private int province;
	//城市
	private int city;
	//详细地址
	private String location;
	//用户Id
	private int userId;
	//创建时间
	private String createTime;
	//最后一次标记信息
	private int lastMid;
	//是否呗删除
	private int isDelete;
	//设备ID
	private int deiceId;
	
	public int getRadiationId() {
		return radiationId;
	}
	public void setRadiationId(int radiationId) {
		this.radiationId = radiationId;
	}
	public Double getRadiationPvg() {
		return radiationPvg;
	}
	public void setRadiationPvg(Double radiationPvg) {
		this.radiationPvg = radiationPvg;
	}
	public Double getRadiationAcount() {
		return radiationAcount;
	}
	public void setRadiationAcount(Double radiationAcount) {
		this.radiationAcount = radiationAcount;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public int getCountry() {
		return country;
	}
	public void setCountry(int country) {
		this.country = country;
	}
	public int getProvince() {
		return province;
	}
	public void setProvince(int province) {
		this.province = province;
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public int getLastMid() {
		return lastMid;
	}
	public void setLastMid(int lastMid) {
		this.lastMid = lastMid;
	}
	public int getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}
	public int getDeiceId() {
		return deiceId;
	}
	public void setDeiceId(int deiceId) {
		this.deiceId = deiceId;
	}
	
	

}
