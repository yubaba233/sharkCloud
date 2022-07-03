package org.shark.ware;


import org.shark.common.security.annotation.EnableCustomConfig;
import org.shark.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 网关启动程序
 * 
 * @author Acer
 */
@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class SharkWareApplication
{
    public static void main(String[] args) {
        SpringApplication.run(SharkWareApplication.class, args);
    }
}
