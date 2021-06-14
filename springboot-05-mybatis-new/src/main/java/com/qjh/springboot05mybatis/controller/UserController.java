package com.qjh.springboot05mybatis.controller;

import com.alibaba.fastjson.JSON;
import com.qjh.springboot05mybatis.mapper.UserMapper;
import com.qjh.springboot05mybatis.pojo.User;
import com.qjh.springboot05mybatis.pojo.QueryInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Description: 系统管理模块
 * @author: QJH
 * @date: 2021/6/2  23:26
 */

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;



//    @GetMapping("/query")
//    public List<ComUser> queryUserList(){
//        List<ComUser> userList = userMapper.queryUserList();
//        return userList;
//    }
    @RequestMapping("/sys")
    public String getUserList(QueryInfo queryInfo){
        //获取最大列表数和当前编号
        int numbers = userMapper.getUserCounts("%" + queryInfo.getQuery() + "%");
        int pageStart = (queryInfo.getPageNum() - 1) * queryInfo.getPageSize();
        List<User> users = userMapper.getAllUser("%" + queryInfo.getQuery() + "%", pageStart, queryInfo.getPageSize());
        HashMap<String, Object> res = new HashMap<>();
        res.put("numbers",numbers);
        res.put("data",users);
        String res_string = JSON.toJSONString(res);
        return res_string;

    }

    @RequestMapping("/userstate")
    public String updateUserState(@RequestParam("id")Integer id,
                                  @RequestParam("state")Boolean state){
        int i = userMapper.updateState(id, state);
        return i>0?"success":"error";
    }

//    添加用户的时候，还需调用PersonController里的add接口，向person表里添加此用户对应的数据
//    username字段为user的username，其他字段可使用默认空值
    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user){
        user.setRole("普通用户");
        int i = userMapper.addUser(user);

        return i > 0?"success":"error";
    }

//删除用户同样调用person的删除接口
    @RequestMapping("deleteUser")
    public String deleteUser(int id){
        int i= userMapper.deleteUser(id);
        return i > 0?"success":"error";
    }

    @RequestMapping("/getupdate")
    public  String getUpdateUser(int id){
        User user = userMapper.getUpdateUser(id);
        String s = JSON.toJSONString(user);
        return s;
    }

    @RequestMapping("/edituser")
    public String editUser(@RequestBody User user){
        int i = userMapper.editUser(user);
        return  i>0?"success":"error";

    }




}
