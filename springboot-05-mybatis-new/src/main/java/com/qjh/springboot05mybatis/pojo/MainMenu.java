package com.qjh.springboot05mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description: 主导航
 * @author: QJH
 * @date: 2021/6/4  13:25
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MainMenu {
    private int id;
    private String title;
    private String path;
    private List<SubMenu> sList;

}
