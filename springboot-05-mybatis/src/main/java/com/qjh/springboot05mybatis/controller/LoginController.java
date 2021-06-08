package com.qjh.springboot05mybatis.controller;

import com.alibaba.fastjson.JSON;
import com.qjh.springboot05mybatis.mapper.UserMapper;
import com.qjh.springboot05mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Description: 登录模块
 * @author: QJH
 * @date: 2021/6/3  16:28
 */

@RestController
public class LoginController {

    @Autowired
    UserMapper userMapper;

    @PostMapping("/login")
    public String login(@RequestBody User user){
        String flag="error";
        User us = userMapper.getUserByMessage(user.getUsername(), user.getPassword());

        HashMap<String,Object> res= new HashMap<>();
        if(us!=null){
            flag="ok";
        }
        res.put("flag",flag);
        res.put("user",us);
        String res_json = JSON.toJSONString(res);
        return res_json;
    }


}
