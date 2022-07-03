package org.shark.system;


import org.shark.common.security.annotation.EnableCustomConfig;
import org.shark.common.security.annotation.EnableRyFeignClients;
import org.shark.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author Acer
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class SharkSystemApplication
{
    public static void main(String[] args) {
        SpringApplication.run(SharkSystemApplication.class, args);
    }
}
