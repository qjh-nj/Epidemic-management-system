package com.qjh.springboot05mybatis.mapper;

import com.qjh.springboot05mybatis.pojo.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PersonMapper {

    public Person getPersonByMessage(@Param("username") String username);

    public int addPerson(Person person);

    public int deletePerson(String username );

    public Person getUpdatePerson(String username);

    public int editPerson(Person person);

}
