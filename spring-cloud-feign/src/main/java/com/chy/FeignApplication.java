package com.chy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by chy on 2018/11/5.
 *      Feign 采用的是基于接口的注解
 *      Feign 整合了ribbon，具有负载均衡的能力
 *     整合了Hystrix，具有熔断的能力
 */
@SpringBootApplication
@EnableFeignClients
public class FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }

}
