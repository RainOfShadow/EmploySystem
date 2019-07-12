package cn.org.y24.EmploySystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(value = {"cn.org.y24.EmploySystem.mapper"})
public class EmploySystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmploySystemApplication.class, args);
    }

}
