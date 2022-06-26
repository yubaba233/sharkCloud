package org.shark.ware;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 网关启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableFeignClients(basePackages = "org.shark.ware.controller")
@MapperScan("org.shark.ware.mapper")
public class SharkWareApplication
{
    public static void main(String[] args) {
        SpringApplication.run(SharkWareApplication.class, args);
    }
}
