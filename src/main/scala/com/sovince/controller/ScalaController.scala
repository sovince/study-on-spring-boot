package com.sovince.controller

import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/26
  * Time: 20:55
  * Description:
  */
@RestController
@RequestMapping(Array("/scala"))
class ScalaController {

  @GetMapping(Array("/hello"))
  def hello(): String = {
    "Hello Scala Boot!"
  }
}
