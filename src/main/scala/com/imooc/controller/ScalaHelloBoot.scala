package com.imooc.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

/**
  * Created by savypan
  * On 2018/10/3 23:28
  */

@RestController
class ScalaHelloBoot {

  @RequestMapping (value = Array("/sayScalaHello"), method = Array(RequestMethod.GET))
  def sayScalaHello() = {
    "say Scala Hello..."
  }
}
