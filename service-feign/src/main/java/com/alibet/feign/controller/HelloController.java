package com.alibet.feign.controller;

import com.alibet.feign.service.ScheduledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author yexun
 * @Date 2019-03-20
 */
@RestController
public class HelloController {

    @Autowired
    private ScheduledService scheduledService;

    @GetMapping(value = "/hello/{name}")
    public String hello(@PathVariable String name){
        return scheduledService.hello(name);
    }
}
