//package com.example.demo.config;
//
//import io.swagger.models.License;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.Collections;
//
//@Configuration
//@EnableSwagger2
//public class Swagger2Config {
//    @Bean
//    public Docket aDocket(){
//        return new Docket(DocumentationType.SWAGGER_2).groupName("a");
//    }
//    @Bean
//    public Docket bDocket(){
//        return new Docket(DocumentationType.SWAGGER_2).groupName("b");
//    }
//
//
//    @Bean
//    public Docket apiDocket() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("我是分组名称")
//                .select()
//                .apis(RequestHandlerSelectors.any())    //指定要扫描的包
//                .paths(PathSelectors.any())             // 过滤什么路径
//                .build()
//                .apiInfo(getApiInfo());
//    }
//
//    private ApiInfo getApiInfo() {
//        return new ApiInfo(
//                "我是title",
//                "我是description",
//                "1.0.0",
//                "我是组织的名字",
//                new Contact("我是创作者","https://www.baidu.com","1321155253@qq.com"),
//                "Apache 2.0",
//                "https://www.jd.com",
//                Collections.emptyList()
//        );
//    }
//
//
//}
