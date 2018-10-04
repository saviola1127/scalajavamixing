package com.imooc.repository

import com.imooc.domain.MetaTable
import org.springframework.data.repository.CrudRepository

/**
  * Created by savypan
  * On 2018/10/4 16:32
  */
trait MetaTableRepository extends CrudRepository[MetaTable, Integer] {

}
