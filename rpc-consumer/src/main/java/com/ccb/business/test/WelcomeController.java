package com.ccb.business.test;

import com.ccb.annotation.RpcReference;
import com.ccb.api.HelloApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RpcReference(serviceVersion = "1.0.0", timeout = 3000)
    private HelloApi helloApi;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return helloApi.sayHello();
    }

}
