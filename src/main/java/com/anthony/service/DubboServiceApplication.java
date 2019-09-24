package com.anthony.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author mgdm
 */
@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-providers.xml"})
public class DubboServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboServiceApplication.class, args);
    }

}
