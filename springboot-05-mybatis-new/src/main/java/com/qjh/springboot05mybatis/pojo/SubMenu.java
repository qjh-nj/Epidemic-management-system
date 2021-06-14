package com.qjh.springboot05mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 分支导航
 * @author: QJH
 * @date: 2021/6/4  13:23
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubMenu {

    private int id;
    private String title;
    private String path;



}
