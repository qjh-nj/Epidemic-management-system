package com.qjh.springboot05mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: TODO
 * @author: QJH
 * @date: 2021/6/6  11:45
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryInfo {
    private String query;//查询信息：username
    private int pageNum=1;//当前页
    private int pageSize=1;//每页最大数

}
