package com.cn.honey.serviceImp;

import com.cn.honey.Dao.RadiationDao;
import com.cn.honey.model.Radiation;
import com.cn.honey.service.RadiationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("radiationService")
public class RadiationServiceImp implements RadiationService{

  @Autowired
  private RadiationDao radiationDao;

  public int insert(Radiation radiation)
  {
    int result = this.radiationDao.insert(radiation);
    return result;
  }

  public Radiation find(Integer radiationId)
  {
    Radiation radiation = this.radiationDao.find(radiationId);
    return radiation;
  }
}