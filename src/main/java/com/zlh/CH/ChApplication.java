package com.zlh.CH;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@MapperScan("com.zlh.CH.dao")
public class ChApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChApplication.class, args);
    }



}
