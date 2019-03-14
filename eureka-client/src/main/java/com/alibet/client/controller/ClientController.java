package com.alibet.client.controller;

import org.springframework.beans.factory.annotation.Value;
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

    @RequestMapping("/home")
    public String home(@RequestParam(value = "name", defaultValue = "zhou hao") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
