package com.wendao.denglu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource(value={"file:config.properties"})
public class DengluApplication {

    public static void main(String[] args) {
        SpringApplication.run(DengluApplication.class, args);
    }

}
