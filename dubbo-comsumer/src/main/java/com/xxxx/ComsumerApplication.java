package com.xxxx;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author zhuyp
 * @create 2021-01-22 16:36
 */
@SpringBootApplication
//@EnableDubboConfiguration
@EnableDubbo
@EnableOpenApi
public class ComsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComsumerApplication.class, args);
    }
}
