package com.cyouguang.autolibrary;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.cyouguang.autolibrary"})
@MapperScan("com.cyouguang.autolibrary.dao")
public class AutolibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutolibraryApplication.class, args);
    }
}
