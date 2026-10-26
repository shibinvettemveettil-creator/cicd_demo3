package com.svv1.cicd_demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdDemo3Application {

    public static void main(String[] args) {
        SpringApplication.run(CicdDemo3Application.class, args);
    }

    @GetMapping("/welcome3")
    public String welcomeString() {
        return "Hello World!";
    }
}
