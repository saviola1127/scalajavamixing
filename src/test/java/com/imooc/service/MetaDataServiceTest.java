package com.imooc.service;

import com.imooc.domain.MetaDatabase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

/**
 * Created by savypan
 * On 2018/10/3 23:50
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class MetaDataServiceTest {

    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @Test
    public void testSave() {
        MetaDatabase metaDatabase = new MetaDatabase();
        metaDatabase.setId(1);
        metaDatabase.setName("HiveDB");
        metaDatabase.setLocaltion("hdfs://hadoop000:8020/user/hive/warehouse");

        metaDatabaseService.save(metaDatabase);
    }


    @Test
    public void testQuery() {
        Iterable<MetaDatabase> list = metaDatabaseService.query();
        for (MetaDatabase metaDatabase : list) {
            System.out.println(metaDatabase.getId());
            System.out.println(metaDatabase.getName());
            System.out.println(metaDatabase.getLocaltion());
        }
    }
}
