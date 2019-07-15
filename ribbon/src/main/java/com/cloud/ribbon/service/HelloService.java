package com.cloud.ribbon.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello(){
        return "helloWorld"; // 提供一个hello World
    }
}