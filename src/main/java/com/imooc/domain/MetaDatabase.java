package com.imooc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by savypan
 * On 2018/10/3 23:42
 */

@Entity
@Table
public class MetaDatabase {

    @Id
    @GeneratedValue
    private Integer id; //db id
    private String name; //db name
    private String localtion; //stored file path

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocaltion() {
        return localtion;
    }

    public void setLocaltion(String localtion) {
        this.localtion = localtion;
    }
}
