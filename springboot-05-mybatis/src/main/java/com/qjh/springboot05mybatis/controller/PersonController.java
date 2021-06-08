package com.qjh.springboot05mybatis.controller;

import com.alibaba.fastjson.JSON;
import com.qjh.springboot05mybatis.mapper.PersonMapper;
import com.qjh.springboot05mybatis.mapper.UserMapper;
import com.qjh.springboot05mybatis.pojo.Person;
import com.qjh.springboot05mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 个人信息模块
 * @author: QJH
 * @date: 2021/6/7  10:16
 */

@RestController
public class PersonController {

    @Autowired
    private PersonMapper personMapper;

    @RequestMapping("/personinfo")
    public String getPersonInfo(String username){
        Person ps=personMapper.getPersonByMessage(username);
        String s = JSON.toJSONString(ps);
        return s;

    }

    @RequestMapping("/addPerson")
    public String addPerson(@RequestBody Person person){
        int i = personMapper.addPerson(person);

        return i > 0?"success":"error";
    }

    //此接口仅在user的delete接口调用时调用
    @RequestMapping("/deletePerson")
    public String deletePerson(String username){
        int i = personMapper.deletePerson(username);

        return i > 0?"success":"error";
    }

    @RequestMapping("/getupdateperson")
    public  String getUpdatePerson(String username){
        Person person = personMapper.getUpdatePerson(username);
        String s = JSON.toJSONString(person);
        return s;
    }

//  调用此修改接口的时候需要同时调用user的修改接口，因为涉及到用户名的修改，需要修改两个表
    @RequestMapping("/editperson")
    public String editPerson(@RequestBody Person person){
        int i = personMapper.editPerson(person);
        return  i>0?"success":"error";

    }

}
