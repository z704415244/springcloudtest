package com.alibet.feign.service;

import com.alibet.feign.hystric.HelloServiceHytric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author yexun
 * @Date 2019-03-16
 */
@FeignClient(value = "eureka-client", fallback = HelloServiceHytric.class)
public interface HelloService {

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    String hello(@PathVariable(value = "name")String name);
}
