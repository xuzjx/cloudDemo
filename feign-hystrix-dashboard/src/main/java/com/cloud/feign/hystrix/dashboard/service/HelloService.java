package com.cloud.feign.hystrix.dashboard.service;

import com.cloud.feign.hystrix.dashboard.rpc.GetHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Autowired
    private GetHello getHello; //注入rpc

    public String sayHello(){
        return getHello.sayHello(); // 提供一个hello World
    }
}