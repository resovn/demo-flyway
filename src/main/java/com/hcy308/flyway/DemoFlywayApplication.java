package com.hcy308.flyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;

@SpringBootApplication(exclude = JmxAutoConfiguration.class)
public class DemoFlywayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoFlywayApplication.class, args);
    }

}
