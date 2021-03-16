package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


/**
 * springBoot-demo 启动类
 *
 * <b>exclude = {DataSourceAutoConfiguration.class}</b> 的配置会在启动时忽略数据库配置
 *
 * @author coder
 */

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

}
