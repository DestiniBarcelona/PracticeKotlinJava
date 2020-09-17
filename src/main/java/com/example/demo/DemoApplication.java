package com.example.demo;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Logger
@SpringBootApplication
@EnableConfigurationProperties(BlogProperties.class)
public class DemoApplication {

	public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
        new JavaService().sayHello();
        new KotlinService().sayHello();
    }
}
