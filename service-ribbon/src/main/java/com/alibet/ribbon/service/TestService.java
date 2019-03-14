package com.alibet.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author yexun
 * @Date 2019-03-14
 */
@Service
public class TestService {

    @Autowired
    private RestTemplate restTemplate;

    public String hello(String name){
        return restTemplate.getForObject("http://127.0.0.1:8763/home?name=" + name,  String.class);
    }
}
