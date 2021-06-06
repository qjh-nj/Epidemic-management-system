package com.qjh.springboot05mybatis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class Springboot05MybatisApplicationTests {
    @LocalServerPort
    private int port;

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {

    }

}
