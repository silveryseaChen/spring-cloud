package com.chy.client;

import com.chy.client.fallback.ClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chy on 2018/11/5.
 * spring-cloud-client 的 客户端
 */
@FeignClient(value = "spring-cloud-client", fallbackFactory = ClientFallbackFactory.class)
public interface Client {

    @RequestMapping("/hello")
    String hello();

}
