package com.chy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chy on 18/10/5.
 */
@SpringBootApplication
@RestController
@RefreshScope
@Slf4j
public class ClientApplication {

    @Value("${server.port}")
    String name = "World";

    @RequestMapping("/hello")
    public String hello() {
        log.debug(" client request ..");
        return "Hello " + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class);
    }

}
