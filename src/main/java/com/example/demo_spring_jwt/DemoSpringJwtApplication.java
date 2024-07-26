package com.example.demo_spring_jwt;

import com.example.demo_spring_jwt.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class DemoSpringJwtApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoSpringJwtApplication.class, args);
        System.out.println("Start");
    }

}
