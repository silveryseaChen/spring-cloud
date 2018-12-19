package com.chy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chy on 2018/10/17.
 */
@SpringBootApplication
@RestController
@Slf4j
public class ZipkinClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        log.info("hello zipkin client");
        return "hello zipkin client";
    }

}
