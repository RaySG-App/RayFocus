package com.cn.honey.Dao;

import com.cn.honey.model.Radiation;


public interface RadiationDao {
	
	  public abstract int insert(Radiation paramRadiation);

	  public abstract Radiation find(Integer paramInteger);
}
