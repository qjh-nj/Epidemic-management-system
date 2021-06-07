package com.qjh.springboot05mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DataMapper {

    public int getTotalData();
    public int getSickData();
    public int getDeathData();
    public int getCuelData();
    public int getHealthyData();
}
