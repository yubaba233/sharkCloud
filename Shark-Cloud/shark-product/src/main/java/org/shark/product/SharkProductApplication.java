package org.shark.product;


import org.shark.common.security.annotation.EnableCustomConfig;
import org.shark.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Acer
 */
@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class SharkProductApplication
{
    public static void main(String[] args) {
        SpringApplication.run(SharkProductApplication.class, args);
    }
}
