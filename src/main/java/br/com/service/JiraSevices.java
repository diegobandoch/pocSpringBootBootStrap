package br.com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="br.com")
@EnableAutoConfiguration
public class JiraSevices {

    public static void main(String[] args) {
    	SpringApplication.run(JiraSevices.class, args);
    }
}
