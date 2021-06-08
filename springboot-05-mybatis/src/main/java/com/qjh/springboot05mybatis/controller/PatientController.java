package com.qjh.springboot05mybatis.controller;

import com.alibaba.fastjson.JSON;
import com.qjh.springboot05mybatis.mapper.PatientMapper;
import com.qjh.springboot05mybatis.mapper.UserMapper;
import com.qjh.springboot05mybatis.pojo.Person;
import com.qjh.springboot05mybatis.pojo.QueryInfo;
import com.qjh.springboot05mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @Description: 三个患者管理模块
 * @author: QJH
 * @date: 2021/6/8  16:09
 */


@RestController
public class PatientController {

    @Autowired
    private PatientMapper patientMapper;

    @RequestMapping("/showsick")
    public String getSickList(QueryInfo queryInfo){
        //获取最大列表数和当前编号
        int numbers = patientMapper.getSickCounts("%" + queryInfo.getQuery() + "%");
        int pageStart = (queryInfo.getPageNum() - 1) * queryInfo.getPageSize();
        List<Person> sicks=patientMapper.getAllSick("%" + queryInfo.getQuery() + "%", pageStart, queryInfo.getPageSize());
        HashMap<String,Object> res= new HashMap<>();
        res.put("numbers",numbers);
        res.put("data",sicks);
        String res_string = JSON.toJSONString(res);
        return res_string;

    }

    @RequestMapping("/showdead")
    public String getDeadList(QueryInfo queryInfo){
        //获取最大列表数和当前编号
        int numbers = patientMapper.getDeadCounts("%" + queryInfo.getQuery() + "%");
        int pageStart = (queryInfo.getPageNum() - 1) * queryInfo.getPageSize();
        List<Person> deads=patientMapper.getAllDead("%" + queryInfo.getQuery() + "%", pageStart, queryInfo.getPageSize());
        HashMap<String,Object> res= new HashMap<>();
        res.put("numbers",numbers);
        res.put("data",deads);
        String res_string = JSON.toJSONString(res);
        return res_string;

    }

    @RequestMapping("/showcuel")
    public String getCuelList(QueryInfo queryInfo){
        //获取最大列表数和当前编号
        int numbers = patientMapper.getCuelCounts("%" + queryInfo.getQuery() + "%");
        int pageStart = (queryInfo.getPageNum() - 1) * queryInfo.getPageSize();
        List<Person> cuels=patientMapper.getAllCuel("%" + queryInfo.getQuery() + "%", pageStart, queryInfo.getPageSize());
        HashMap<String,Object> res= new HashMap<>();
        res.put("numbers",numbers);
        res.put("data",cuels);
        String res_string = JSON.toJSONString(res);
        return res_string;

    }
}
