package com.zegobird.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/7/3 15:59
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String sayHello(@RequestParam String name) {
        return restTemplate.getForObject("http://SERVER-HI/hi?name=" + name, String.class);
    }
}
