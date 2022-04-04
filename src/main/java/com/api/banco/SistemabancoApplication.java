package com.api.banco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.validation.constraints.NotNull;

@SpringBootApplication
public class SistemabancoApplication {


    public static void main(String[] args) {
        SpringApplication.run(SistemabancoApplication.class, args);
        System.out.println("DevTools funcionando na Build");
    }

}
