package org.shark.user;

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
@EnableFeignClients(basePackages = "org.shark")
@MapperScan("org.shark.user.mapper")
public class SharkUserApplication
{
    public static void main(String[] args) {
        SpringApplication.run(SharkUserApplication.class, args);
    }
}
