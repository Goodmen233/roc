package com.ccb.business.test;

import com.ccb.annotation.RpcService;
import com.ccb.api.HelloApi;

@RpcService(serviceInterface = HelloApi.class, serviceVersion = "1.0.0")
public class HelloController implements HelloApi {
    @Override
    public String sayHello() {
        return "Hello, world";
    }
}
