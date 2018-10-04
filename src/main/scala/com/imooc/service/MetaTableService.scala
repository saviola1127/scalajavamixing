package com.imooc.service

import com.imooc.domain.MetaTable
import com.imooc.repository.MetaTableRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
  * Created by savypan
  * On 2018/10/4 16:33
  */
@Service
class MetaTableService @Autowired()(metaTableRepository:MetaTableRepository) {

  @Transactional
  def save(metaTable:MetaTable): Unit = {
    metaTableRepository.save(metaTable)
  }

  @Transactional
  def query() = {
    metaTableRepository.findAll()
  }
}
