package com.qjh.springboot05mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: TODO
 * @author: QJH
 * @date: 2021/6/2  22:53
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String role;//角色：超级管理员、管理员、用户
    private boolean state;//状态:0,1

}
