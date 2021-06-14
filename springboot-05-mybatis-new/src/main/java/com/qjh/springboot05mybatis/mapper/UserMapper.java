package com.qjh.springboot05mybatis.mapper;


import com.qjh.springboot05mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

//    List<ComUser> queryUserList();
//    ComUser queryUserById(int id);
//    int addUser(ComUser comUser);
//
//    int updateUser(ComUser comUser);
//
//    int deleteUser(int id);
    public User getUserByMessage(@Param("username") String username, @Param("password") String password);

    //查询功能。显示所有用户信息
    public List<User> getAllUser(@Param("username")String username, @Param("pageStart") int PageStasrt, @Param("pageSize")int pagesize);

    //获取用户个数
    public int getUserCounts(@Param("username")String username);

    public int updateState(Integer id,Boolean state);

    public int addUser(User user);

    public int deleteUser(int id);

    public User getUpdateUser(int id);

    public int editUser(User user);




}
