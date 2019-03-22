package com.alibet.feign.controller;

import com.alibet.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author yexun
 * @Date 2019-03-20
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hello/{name}")
    public String hello(@PathVariable String name){
        return helloService.hello(name) + "(Feign)";
    }
}
