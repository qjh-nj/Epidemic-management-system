package com.qjh.springboot05mybatis.controller;

import com.alibaba.fastjson.JSON;
import com.qjh.springboot05mybatis.mapper.MenuMapper;
import com.qjh.springboot05mybatis.pojo.MainMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @Description: TODO
 * @author: QJH
 * @date: 2021/6/4  14:12
 */

@RestController
public class MenuController {

    @Autowired
    MenuMapper menuMapper;


//    获取所有menu,用来写导航栏的
    @RequestMapping("/menus")
    public String getAllMenus(){
        HashMap<String,Object> data=new HashMap<>();
        int status=404;
        List<MainMenu> menus=menuMapper.getMenus();
        if(menus!=null){
            data.put("menus",menus);
            data.put("flag",200);

        }
        else{
            data.put("flag",404);
        }
        String s= JSON.toJSONString(data);
        return s;

    }

}
