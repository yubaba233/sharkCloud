package org.shark.order;


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
@EnableFeignClients(basePackages = "org.shark.order.controller")
@MapperScan("org.shark.order.mapper")
public class SharkOrderApplication
{
    public static void main(String[] args) {
        SpringApplication.run(SharkOrderApplication.class, args);
    }
}
