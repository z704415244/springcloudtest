package com.alibet.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(String name){
        return restTemplate.getForObject("http://eureka-client/hello/" + name, String.class);
    }

    /**
     * 当eureka-client服务无法调通，会使用Hystrix的熔断功能，调用此方法
     * @return
     */
    public String helloError(String name){
        System.out.println("error");
        return "hi " + name + ", sorry, Error";
    }
}
