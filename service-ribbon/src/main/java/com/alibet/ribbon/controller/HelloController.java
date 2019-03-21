package com.alibet.ribbon.controller;

import com.alibet.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yexun
 * @Date 2019-03-14
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return helloService.hello(name);
    }

    @GetMapping("/hello/repeat/{name}")
    public List<String> helloRepeated(@PathVariable String name){
        List<String> list = new ArrayList<>();
        StringBuilder hello = new StringBuilder();
        for (int i = 0; i < 100; i++){
            list.add(helloService.hello(name));
        }
        return list;
    }

}
