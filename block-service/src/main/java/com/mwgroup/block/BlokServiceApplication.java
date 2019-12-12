package com.mwgroup.block;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.mwgroup.block.dao")
@EnableSwagger2Doc
@EnableCaching
@EnableAsync
public class BlokServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlokServiceApplication.class, args);
    }

}
