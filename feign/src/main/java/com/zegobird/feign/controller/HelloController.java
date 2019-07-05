package com.zegobird.feign.controller;

import com.zegobird.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/7/5 17:35
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String sayHello(@RequestParam String name) {
        return helloService.sayHello(name);
    }
}
