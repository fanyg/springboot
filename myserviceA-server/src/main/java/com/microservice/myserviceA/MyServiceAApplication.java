package com.microservice.myserviceA;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microservice.framework.MySpringAplication;

@SpringBootApplication
public class MyServiceAApplication {

    public static void main(String[] args) {
        MySpringAplication mySpringAplication = new MySpringAplication();
        mySpringAplication.run(args);
    }
}