package com.cn.honey.controller;

import com.cn.honey.model.MarkRadiation;
import com.cn.honey.service.MarkRadiationService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/markRadiation"})
public class MarkRadiationController
{

  @Resource
  private MarkRadiationService markRadiationService;

  @ResponseBody
  @RequestMapping({"addmarkRadiation"})
  public String addmarkRadiation(MarkRadiation markRadiation)
  {
    int result = this.markRadiationService.insert(markRadiation);
    if (result == 1) {
      return "录入成功";
    }
    return "录入失败";
  }
  @ResponseBody
  @RequestMapping({"findMarkRadiation"})
  public Map<String, Object> findmarkRadiation(Integer markRadiationId) {
    Map<String, Object> markRadiationMap = new HashMap<String, Object>();
    MarkRadiation markRadiation = this.markRadiationService.select(markRadiationId);
    markRadiationMap.put("list", markRadiation);
    return markRadiationMap;
  }
  @ResponseBody
  @RequestMapping({"deleteMarkRadiation"})
  public String deleteMarkRadiation(Integer markRadiationId) {
    this.markRadiationService.delete(markRadiationId);
    return "";
  }
  @ResponseBody
  @RequestMapping({"showRadiationList"})
  public Map<String, Object> showRadiationList(Integer userId) {
	  Map<String, Object> markRadiationMap = new HashMap<String, Object>();
    List<MarkRadiation> markRadiationList = this.markRadiationService.selectByUserId(userId);
    markRadiationMap.put("list", markRadiationList);
    return markRadiationMap;
  }
}