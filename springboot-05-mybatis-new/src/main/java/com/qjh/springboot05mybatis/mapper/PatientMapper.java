package com.qjh.springboot05mybatis.mapper;

import com.qjh.springboot05mybatis.pojo.Person;
import com.qjh.springboot05mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PatientMapper {

    public List<Person> getAllSick(@Param("name")String name, @Param("pageStart") int PageStasrt, @Param("pageSize")int pagesize);

    public List<Person> getAllDead(@Param("name")String name, @Param("pageStart") int PageStasrt, @Param("pageSize")int pagesize);

    public List<Person> getAllCuel(@Param("name")String name, @Param("pageStart") int PageStasrt, @Param("pageSize")int pagesize);

    public int getSickCounts(@Param("name")String name);

    public int getDeadCounts(@Param("name")String name);

    public int getCuelCounts(@Param("name")String name);

}
