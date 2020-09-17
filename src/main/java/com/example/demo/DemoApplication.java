package com.example.demo;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//this could also be in Kotlin, literally errthang can be in Kotlin
@Logger
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
    }
}
