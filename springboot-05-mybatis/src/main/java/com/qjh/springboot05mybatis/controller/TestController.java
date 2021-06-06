package com.qjh.springboot05mybatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @author: QJH
 * @date: 2021/6/3  14:04
 */

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "Test me";
    }
}
