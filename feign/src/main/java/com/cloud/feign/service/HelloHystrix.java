package com.cloud.feign.service;

import com.cloud.feign.rpc.GetHello;
import org.springframework.stereotype.Component;

@Component
public class HelloHystrix implements GetHello {
    @Override
    public String sayHello() {
        return "this messge send failed ";
    }
}
