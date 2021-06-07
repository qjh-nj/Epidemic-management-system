package com.qjh.springboot05mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: TODO
 * @author: QJH
 * @date: 2021/6/7  9:58
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private int id;
    private String username;
    private String name;
    private String gender;
    private String email;
    private String address;
    private String phone;
    private String health;

}
