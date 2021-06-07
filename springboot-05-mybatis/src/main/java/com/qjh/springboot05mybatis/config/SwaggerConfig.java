package com.qjh.springboot05mybatis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @Description: TODO
 * @author: QJH
 * @date: 2021/6/6  14:48
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //basepackage指定要扫描的包
                .apis(RequestHandlerSelectors.basePackage("com.qjh.springboot05mybatis.controller"))
                .build();

    }
    private ApiInfo apiInfo(){

        Contact contact=new Contact("qjh","https://www.baidu.com","99@qq.com");

        return new ApiInfo("qqqqqqqqqqq", "Api Documentation", "1.0", "urn:tos", contact, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());

    }

}
