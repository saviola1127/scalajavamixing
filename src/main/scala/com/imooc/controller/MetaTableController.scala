package com.imooc.controller

import com.imooc.domain.MetaTable
import com.imooc.service.MetaTableService
import com.imooc.utils.ResultVOUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._

/**
  * Created by savypan
  * On 2018/10/4 16:36
  */

@RestController
@RequestMapping(Array("/meta/table"))
class MetaTableController @Autowired()(metaTableService: MetaTableService) {

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.POST))
  @ResponseBody
  def save(@ModelAttribute metaTable:MetaTable): Unit = {
    metaTableService.save(metaTable)
    ResultVOUtil.success() //scala invoking Java code
  }

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.GET))
  @ResponseBody
  def query() = {
    ResultVOUtil.success(metaTableService.query())
  }
}
