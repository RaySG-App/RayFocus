package com.cn.honey.serviceImp;

import com.cn.honey.Dao.MarkRadiationDao;
import com.cn.honey.model.MarkRadiation;
import com.cn.honey.service.MarkRadiationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("markRadiationService")
public class MarkRadiationServiceImp implements MarkRadiationService{

  @Autowired
  private MarkRadiationDao markRadiationDao;

  public int insert(MarkRadiation markRadiation)
  {
    int result = this.markRadiationDao.insert(markRadiation);
    return result;
  }

  public MarkRadiation select(Integer markRadiationId)
  {
    MarkRadiation markRadiation = this.markRadiationDao.select(markRadiationId);
    return markRadiation;
  }

  public void update(MarkRadiation markRadiation)
  {
  }

  public void delete(Integer markRadiationId)
  {
    this.markRadiationDao.delete(markRadiationId);
  }

  public List<MarkRadiation> selectByUserId(Integer userId)
  {
	  List<MarkRadiation> markRadiationList = this.markRadiationDao.selectByUserId(userId);
    return markRadiationList;
  }
}