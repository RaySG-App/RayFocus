package com.cn.honey.controller;

import com.cn.honey.model.Radiation;
import com.cn.honey.service.RadiationService;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/radiation"})
public class RadiationController
{

  @Resource
  private RadiationService radiationService;

  @ResponseBody
  @RequestMapping({"addRadiation"})
  public String addRadiation(Radiation radiation)
  {
    int result = this.radiationService.insert(radiation);
    if (result == 1) {
      return "录入成功";
    }
    return "录入失败";
  }
  @ResponseBody
  @RequestMapping({"findRadiation"})
  public Map<String, Object> find(Integer radiationId) {
	  Map<String, Object> radiationMap = new HashMap<String, Object>();
    Radiation radiation = this.radiationService.find(radiationId);
    radiationMap.put("list", radiation);
    return radiationMap;
  }
}