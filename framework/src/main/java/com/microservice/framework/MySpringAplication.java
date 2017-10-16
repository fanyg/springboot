package com.microservice.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microservice.framework.consul.ConsulRegisterListener;

/**
 * 注意：@SpringBootApplication该注解必须在SpringApplication.run()所在的类上
 *
 */
@SpringBootApplication
public class MySpringAplication {

    public void run(String[] args) {
        SpringApplication sa = new SpringApplication(MySpringAplication.class);
        sa.addListeners(new ConsulRegisterListener());
        sa.run(args);
    }
    
    public static void main(String[] args) {
    }
}