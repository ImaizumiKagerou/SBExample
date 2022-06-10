package com.ik.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ik.test.dao")
public class SbExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbExampleApplication.class, args);
    }

}
