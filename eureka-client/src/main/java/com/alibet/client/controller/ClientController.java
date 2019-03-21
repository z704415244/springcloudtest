package com.alibet.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yexun
 * @Date 2019-03-12
 */
@RestController
public class ClientController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable(value = "name") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
