package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        var applicationContext = SpringApplication.run(DemoApplication.class, args);

        var doSomething = applicationContext.getBean(DoSomething.class);
        doSomething.engage();
    }

}
