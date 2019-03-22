package com.alibet.feign.hystric;

import com.alibet.feign.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * 配置service调用的服务断联后的处理方式
 *
 * @Author yexun
 * @Date 2019-03-21
 */
@Component
public class HelloServiceHytric implements HelloService {

    @Override
    public String hello(String name) {
        return "hi " + name + ", feign error!";
    }
}
