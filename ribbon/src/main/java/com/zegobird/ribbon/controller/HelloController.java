package com.zegobird.ribbon.controller;

import com.zegobird.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/7/3 16:01
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String sayHello(@RequestParam String name){
        return  helloService.sayHello(name);
    }
}
