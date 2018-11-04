package com.chy;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by chy on 2018/10/15.
 * 负载均衡
 */
@SpringBootApplication
@RestController
@EnableHystrix  //dependence hystrix
@EnableHystrixDashboard
public class RibbonApplication {

    @Autowired
    private RestTemplate restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/{client}/{path}")
    @HystrixCommand(fallbackMethod = "clientError") //dependence hystrix
    public String index(@PathVariable String client, @PathVariable String path){
        return restTemplate.getForObject("http://"+ client +"/"+path, String.class);
    }

    public String clientError(String client, String path){
        return String.format(" [%s] servlet [%s] unavailable", client, path);
    }

}
