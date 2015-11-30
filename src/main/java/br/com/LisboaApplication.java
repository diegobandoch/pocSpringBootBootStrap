package br.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="br.com")
@EnableAutoConfiguration
public class LisboaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LisboaApplication.class, args);
    }
}
