package com.chy.client.fallback;

import com.chy.client.Client;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Created by chy on 2018/11/5.
 */
//添加请求异常处理
@Component
public class ClientFallbackFactory implements FallbackFactory<Client> {

    @Override
    public Client create(Throwable throwable) {
        return new Client() {
            @Override
            public String hello() {
                return " request client error o(╥﹏╥)o ";
            }
        };
    }
}
