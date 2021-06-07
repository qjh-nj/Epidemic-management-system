package com.qjh.springboot05mybatis.controller;

import com.qjh.springboot05mybatis.mapper.DataMapper;
import com.qjh.springboot05mybatis.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: TODO
 * @author: QJH
 * @date: 2021/6/7  14:47
 */

@RestController
public class DataController {

    @Autowired
    private DataMapper dataMapper;

    @RequestMapping("datashow")
    public List<Integer> dataShow(){
        int totalData = dataMapper.getTotalData();
        int healthyData = dataMapper.getHealthyData();
        int sickData = dataMapper.getSickData();
        int deathData = dataMapper.getDeathData();
        int cuelData = dataMapper.getCuelData();
        List<Integer> res = Arrays.asList(totalData,healthyData,sickData,deathData,cuelData);

        return res;
    }


}
