package com.zegobird.feign.service;

import com.zegobird.feign.rpc.IServiceHi;
import org.springframework.stereotype.Component;

@Component
public class ServiceHiHystrix implements IServiceHi {
    @Override
    public String sayHello(String name) {
        return "sorry"+name;
    }
}
