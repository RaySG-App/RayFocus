package com.cn.honey.Dao;

import java.util.List;

import com.cn.honey.model.MarkRadiation;

public interface MarkRadiationDao {
	
	  public abstract int insert(MarkRadiation paramMarkRadiation);

	  public abstract MarkRadiation select(Integer paramInteger);

	  public abstract void update(MarkRadiation paramMarkRadiation);

	  public abstract void delete(Integer paramInteger);

	  public abstract List<MarkRadiation> selectByUserId(Integer paramInteger);
}
