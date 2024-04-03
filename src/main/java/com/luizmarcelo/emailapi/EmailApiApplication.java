package com.luizmarcelo.emailapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class EmailApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailApiApplication.class, args);
    }

}
