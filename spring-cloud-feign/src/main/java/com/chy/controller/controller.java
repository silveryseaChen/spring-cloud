package com.chy.controller;

import com.chy.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chy on 2018/11/5.
 */
@RestController
public class controller {

    @Autowired
    private Client client;

    @RequestMapping("/hello")
    public String clientHello(){
        return client.hello();
    }


}
