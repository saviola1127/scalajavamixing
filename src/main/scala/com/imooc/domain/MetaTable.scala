package com.imooc.domain

import javax.persistence.{Entity, GeneratedValue, Id, Table}

import scala.beans.BeanProperty

/**
  * Created by savypan
  * On 2018/10/4 16:26
  */

@Entity
@Table
class MetaTable {

  @Id
  @GeneratedValue
  @BeanProperty
  var id:Integer = _

  @BeanProperty
  var name:String = _

  @BeanProperty
  var tableType:String = _

  @BeanProperty
  var dbId:Integer = _

}
