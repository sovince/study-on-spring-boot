package com.sovince.controller

import java.util

import com.sovince.entity.Host
import com.sovince.service.HostService
import com.sovince.util.ResultVOUtil
import com.sovince.vo.ResultVO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation._

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/27
  * Time: 20:57
  * Description:
  */
@Controller
@RequestMapping(Array("/host"))
class HostController @Autowired()(hostService: HostService){

  @GetMapping(Array("/index"))
  def index(model: Model): String = {
    val hosts: util.List[Host] = hostService.query
    model.addAttribute("hosts", hosts)
    "host/index"
  }


  @RequestMapping(value = Array("","/"),method = Array(RequestMethod.POST))
  @ResponseBody
  def save(@ModelAttribute host: Host): ResultVO[_] ={
    val result = hostService.save(host)
    if(result.getId>0){
      ResultVOUtil.success(result)
    }else{
      ResultVOUtil.error()
    }
  }
}
