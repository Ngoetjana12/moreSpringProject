package org.mecerintered.morespringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoreSpringProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoreSpringProjectApplication.class, args);
    }

    public String welcome(){
        return "App running on Port:8080";
    }
}
