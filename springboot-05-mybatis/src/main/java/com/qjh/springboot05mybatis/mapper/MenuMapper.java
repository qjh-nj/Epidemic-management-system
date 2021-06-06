package com.qjh.springboot05mybatis.mapper;

import com.qjh.springboot05mybatis.pojo.MainMenu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MenuMapper {
    public List<MainMenu> getMenus();

}
