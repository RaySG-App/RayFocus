package com.cn.honey.service;

import com.cn.honey.model.Radiation;

public interface RadiationService {
	
	public abstract int insert(Radiation paramRadiation);

	public abstract Radiation find(Integer paramInteger);
	
}
