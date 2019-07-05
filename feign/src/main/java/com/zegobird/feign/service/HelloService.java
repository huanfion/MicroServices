package com.zegobird.feign.service;

import com.zegobird.feign.rpc.IServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/7/5 17:37
 */
@Service
public class HelloService {
    @Autowired
    private IServiceHi serviceHi;//注入rpc
    public String sayHello(@RequestParam String name){
        return serviceHi.sayHello(name);
    }
}
