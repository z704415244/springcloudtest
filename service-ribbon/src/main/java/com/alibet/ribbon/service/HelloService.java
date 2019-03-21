package com.alibet.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author yexun
 * @Date 2019-03-14
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hello(String name){
        return restTemplate.getForObject("http://eureka-client/hello/" + name, String.class);
    }
}
