package com.group.employsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class EmploySystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmploySystemApplication.class, args);
    }

}
