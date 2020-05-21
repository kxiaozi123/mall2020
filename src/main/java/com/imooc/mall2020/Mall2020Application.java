package com.imooc.mall2020;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.imooc.mall2020.dao")
public class Mall2020Application {

    public static void main(String[] args) {
        SpringApplication.run(Mall2020Application.class, args);
    }

}
