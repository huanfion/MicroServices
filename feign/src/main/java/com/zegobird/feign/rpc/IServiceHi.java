package com.zegobird.feign.rpc;

import com.zegobird.feign.service.ServiceHiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/7/5 17:38
 * 通过@ FeignClient（“服务名”），来指定调用哪个服务
 */
@FeignClient(value = "service-hi",fallback = ServiceHiHystrix.class)
public interface IServiceHi {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name);
}
