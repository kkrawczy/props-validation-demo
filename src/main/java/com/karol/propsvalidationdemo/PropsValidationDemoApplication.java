package com.karol.propsvalidationdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableBinding(Queues.class)
public class PropsValidationDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PropsValidationDemoApplication.class, args);
    }
}

interface Queues {}

