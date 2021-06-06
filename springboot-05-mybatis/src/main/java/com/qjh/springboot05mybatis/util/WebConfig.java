package com.qjh.springboot05mybatis.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Description: TODO
 * @author: QJH
 * @date: 2021/6/3  14:22
 */
//全局配置类
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    /**
     * 1.访问路径
     * 2.请求来源
     * 3.方法
     * 4.允许携带
     * 5.最大时间
     */

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("Http://localhost:8080","null")
                .allowedMethods("GET","POST","PUT","OPTIONS","DELETE")
                .allowCredentials(true)
                .maxAge(3600);
    }


}
