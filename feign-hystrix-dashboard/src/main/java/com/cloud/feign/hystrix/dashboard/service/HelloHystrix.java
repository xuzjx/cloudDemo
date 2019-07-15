package com.cloud.feign.hystrix.dashboard.service;

import com.cloud.feign.hystrix.dashboard.rpc.GetHello;
import org.springframework.stereotype.Component;

@Component
public class HelloHystrix implements GetHello {
    @Override
    public String sayHello() {
        return "this messge send failed ";
    }
}
